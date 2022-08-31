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
        return bookName + ", " + authorName + ", " + publicationYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return bookName.equals(c2.bookName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }
}
