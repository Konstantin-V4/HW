package HomeWorks.Book;

public class Main {
    public static void main(String[] args) {

        Author author = new Author("Николай", "Островский");

        Author author2 = new Author("Александ", "Пушкин");

        Book book = new Book("Как закалялась сталь", author, 1934);

        Book book2 = new Book("Евгений Онегин", author2, 1934);

        System.out.println(author);
        System.out.println(author2);
        System.out.println(book);
        System.out.println(book2);

        book.setNameBook("Война и мир");
        book.setYear(1873);

        book2.setAuthor(new Author("Лев", "Толстой"));
        System.out.println(book);
        System.out.println(book2);
    }
}
