public class BookApp {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Pip Jones", "", 'u');
        authors[1] = new Author("Bessie Carter", "", 'f');

        Book javaDummy = new Book("Java for Dummies", authors, 19.99, 99);

        System.out.println(javaDummy);
        System.out.println("Title: " + javaDummy.getTitle());
        System.out.println("Authors: " + javaDummy.getAuthorNames());
        System.out.println("Price: " + javaDummy.getPrice());
        System.out.println("Quantity: " + javaDummy.getQty());
    }
}
