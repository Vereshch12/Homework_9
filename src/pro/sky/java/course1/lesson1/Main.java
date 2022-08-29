package pro.sky.java.course1.lesson1;

public class Main {
    public static void addBook(Book book, Book[] books){
        for (int i = 0; i < books.length; i++){
            if (books[i] == null){
                books[i] = book;
                break;
            }
        }
    }

    public static void printAllBooks(Book[] books){
        int i = 0;
        System.out.println("\nСписок книг в массиве:");
        while (books[i] != null){
            System.out.println(i+1 + ")" + books[i].getBookName() + ":" + books[i].getAuthorName() + ": " + books[i].getPublicationYear());
            i++;
        }
    }

    public static void main(String[] args) {
        Author author1 = new Author("Лев Толстой");
        Book book1 = new Book("Война и мир", author1, 1867);
        Author author2 = new Author("Федор Достаевский");
        Book book2 = new Book("Преступление и наказание", author2, 1866);
        System.out.println("Книга: " + book1 + "\nИмя автора: " + author1.getName() + "\nФамилия автора: " + author1.getSurname() + "\n");
        System.out.println("Книга: " + book2 + "\nИмя автора: " + author2.getName() + "\nФамилия автора: " + author2.getSurname() + "\n");
        book1.setPublicationYear(1900);
        System.out.println(book1);

        //Средний уровень
        Book[] books = new Book[10];
        books[0] = book1;
        books[1] = book2;
        Author author3 = new Author( "Уильям Шекспир");
        Book book3 = new Book("Ромео и Джульетта", author3, 1597);
        addBook(book3, books);
        printAllBooks(books);


        //Сложный уровень
        Library library1 = new Library(10);
        library1.addBook(book3);
        library1.addBook(new Book("Зеленая миля", new Author("Стивен Кинг"), 1996));
        library1.printAllBooks();
        library1.printOneBook("Зеленая миля");
        library1.changePublicationYear("Ромео и Джульетта", 2000);
        library1.printOneBook("Ромео и Джульетта");
        library1.printAllBooks();


    }
}
