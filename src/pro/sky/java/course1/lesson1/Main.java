package pro.sky.java.course1.lesson1;

public class Main {
    private static void addBook(Book book, Book[] books){
        for (int i = 0; i < books.length; i++){
            if (books[i] == null){
                books[i] = book;
                break;
            }
        }
    }

    private static void printAllBooks(Book[] books){
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
        library1.changePublicationYear("Ромео и Джульетт", 2000);
        library1.printOneBook("Ромео и Джульетта");
        library1.printAllBooks();


        //ДЗ №10
        Author author4 = new Author("Уильям Шекспир");
        Book book4 = new Book("Ромео и Джульетта", author4, 200 );
        System.out.println("\n" + book4.equals(book3));
        System.out.println(author4.equals(author3));


        System.out.println("Authors:");
        Author stephenKing = new Author("Stephen King");
        Author stephenKing2 = new Author("Stephen King");
        Author levTolstoy = new Author("Lev Tolstoy");
        System.out.println("Author copies equal: " + stephenKing.equals(stephenKing2));
        System.out.println("Author copies equal by hashCode: " + (stephenKing.hashCode() == stephenKing2.hashCode()));
        System.out.println("Authors equal: " + stephenKing.equals(levTolstoy));
        System.out.println("Authors equal by hashCode: " + (stephenKing.hashCode() == levTolstoy.hashCode()));

        System.out.println(stephenKing);
        System.out.println(levTolstoy);

        System.out.println("==============================");

        System.out.println("Books:");
        Book theStand = new Book("The Stand", stephenKing, 1976);
        Book theStand2 = new Book("The Stand", stephenKing, 1976);
        Book warAndPeace = new Book("War and Peace", levTolstoy, 1869);
        System.out.println("Book copies equal: " + theStand.equals(theStand2));
        System.out.println("Book copies equal by hashCode: " + (theStand.hashCode() == theStand2.hashCode()));
        System.out.println("Books equal: " + theStand.equals(warAndPeace));
        System.out.println("Books equal by hashCode: " + (theStand.hashCode() == warAndPeace.hashCode()));
        System.out.println(theStand);
        System.out.println(warAndPeace);

        System.out.println("==============================");
        Library library = new Library(2);
        library.addBook(theStand);
        library.addBook(warAndPeace);
        System.out.println(library);
    }
}
