package pro.sky.java.course1.lesson1;

public class Book {
    private final String bookName;
    private final Author authorName;
    private int publicationYear;

    public Book(String bookname, Author authorName, int publicationYear){
        this.bookName = bookname;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
    }

    public String  getBookName() {
        return bookName;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publishingYear) {
        this.publicationYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName=" + authorName +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
