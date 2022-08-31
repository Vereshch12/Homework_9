package pro.sky.java.course1.lesson1;

public class Library {
    private final Book[] books;
    private int lenghtOfBooks = 0;

    public Library(int arraylenght) {
        books = new Book[arraylenght];
    }

    public void addBook(Book book){
        books[lenghtOfBooks] = book;
        lenghtOfBooks++;
    }

    public void printAllBooks(){
        int i = 0;
        System.out.println("\nСписок книг в массиве:");
        while (books[i] != null){
            System.out.println(i+1 + ")" + books[i].getBookName() + ":" + books[i].getAuthorName() + ": " + books[i].getPublicationYear());
            i++;
        }
    }

    public void printOneBook(String nameBook){
        for (int i = 0; i < lenghtOfBooks; i++){
            if (nameBook == books[i].getBookName()){
                System.out.println("\nКнига «" + books[i].getBookName() + "», автор - " + books[i].getAuthorName() + ", была издана в " + books[i].getPublicationYear() + " году.");
                break;
            }
        }
    }

    public void changePublicationYear(String nameBook, int newYear){
        for (int i = 0; i < lenghtOfBooks; i++) {
            if (nameBook == books[i].getBookName()) {
                books[i].setPublicationYear(newYear);
                break;
            }
        }
    }
}
