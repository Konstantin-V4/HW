package HomeWorks.Book;

public class Main {
    public static void main(String[] args) {

        Author author = new Author();
        author.setName("Николай");
        author.setSurname("Островский");

        Author author2 = new Author();
        author2.setName("Александ");
        author2.setSurname("Пушкин");


        Book book = new Book();
        book.setAuthor(author);
        book.setNameBook("Как закалялась сталь");
        book.setYear(1934);

        Book book2 = new Book();
        book2.setAuthor(author2);
        book2.setNameBook("Евгений Онегин");
        book2.setYear(1934);

        System.out.println(author.getInfo());
        System.out.println(author2.getInfo());
        System.out.println(book.getInfo());
        System.out.println(book2.getInfo());
    }
}
