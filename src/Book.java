public class Book {
    private final String author;
    private final String name;

    public Book (final String author, final String name) {
        this.author = author;
        this.name = name;
    }

    public String toString() {
        return "Book [name=" + name + ", Author=" + author + "]";
    }
}
