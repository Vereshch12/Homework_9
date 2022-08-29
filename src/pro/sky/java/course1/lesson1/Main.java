package pro.sky.java.course1.lesson1;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев Толстой");
        Book book1 = new Book("Война и мир", author1, 1867);
        Author author2 = new Author("Федор Достаевский");
        Book book2 = new Book("Преступление и наказание", author2, 1866);
        System.out.println(book1 + "\n" + author1 + "\n");
        System.out.println(book2 + "\n" + author2 + "\n");
        book1.setPublicationYear(1900);
        System.out.println(book1 + "\n" + author1);
    }
}
