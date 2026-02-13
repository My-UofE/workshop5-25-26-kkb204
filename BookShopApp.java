import java.util.ArrayList;

public class BookShopApp {
    public static void main(String[] args) {
        ArrayList<Book> stocklist = new ArrayList<>();
        stocklist.add(new Book("Data Mining Handbook", new Author[]{new Author("Robert Nisbet", "", 'u')}, 27.95, 10));
        stocklist.add(new Book("Mastering COBOL", new Author[]{new Author("Roger Hutty", "", 'u')}, 4.95, 10));
        stocklist.add(new Book("Intro to COBOL", new Author[]{new Author("Paul Murrill", "", 'u')}, 7.35, 4));
        stocklist.add(new Book("Making Software", new Author[]{new Author("Andy Oram", "", 'u')}, 35.00, 5));
        stocklist.add(new Book("OO Design Using Java", new Author[]{new Author("James Nino", "", 'u'), new Author("Frederick Hosch", "", 'u')}, 30.00, 6));
        stocklist.add(new Book("Objects First with Java", new Author[]{new Author("David Barnes", "", 'u'), new Author("Michael Kolling", "", 'u')}, 29.50, 4));

        for (Book b : stocklist) {
            System.out.println(b);
        }

        for (Book b : stocklist) {
            System.out.printf("| %-23s | %-28s | %6.2f | %03d |%n", b.getTitle(), b.getAuthorNames(), b.getPrice(), b.getQty());
        }
        String searchFor = "making software";
        System.out.println("\nSearch for term(s) '" + searchFor + "' in title...");

        for (Book b : stocklist) {
            if (b.getTitle().toLowerCase().equals(searchFor.toLowerCase())) {
                b.setQty(b.getQty() - 1);
            }
        }
        for (Book b : stocklist) {
            System.out.printf("| %-23s | %-28s | %6.2f | %03d |%n", b.getTitle(), b.getAuthorNames(), b.getPrice(), b.getQty());
        }
        String removeAll = "cobol";
        System.out.println("\nRemoving all books with term '" + removeAll + "' in title...");

        int removed = 0;
        for (int i = 0; i < stocklist.size(); i++) {
            if (stocklist.get(i).getTitle().toLowerCase().contains(removeAll)) {
                stocklist.remove(i);
                removed++;
                i--;
            }
        }
        System.out.println("Removed " + removed + " books");

        for (Book b : stocklist) {
            System.out.printf("| %-23s | %-28s | %6.2f | %03d |%n", b.getTitle(), b.getAuthorNames(), b.getPrice(), b.getQty());
        }
    }
}
