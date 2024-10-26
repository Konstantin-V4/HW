package HomeWorks.Book;

public class Book {
    private String nameBook;
    private Author author;
    private Integer year;

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getInfo() {
        return "Название книги: " + nameBook + ", Автор: " + author.getInfo() + ", Год выпуска: " + year;
    }
}
