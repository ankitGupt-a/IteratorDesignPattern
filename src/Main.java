public class Main {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("Ankit1", "firstBook"));
        bookCollection.addBook(new Book("Ankit2", "secondBook"));

        Iterator<Book> iterator = bookCollection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}