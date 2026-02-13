public class Book {

    private String title;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String title, Author[] authors, double price, int qty) {
        this.title = title;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getTitle() { return title; }
    public Author[] getAuthors() { return authors; }
    public double getPrice() { return price; }
    public int getQty() { return qty; }

    public void setPrice(double price) { this.price = price; }

    public void setQty(int qty) { this.qty = qty; }

    public String getAuthorNames() {
        String names = "";
        boolean first = true;

        for (int i = 0; i < authors.length; i++) {
            if (!first) names += ", ";
            names += authors[i].getName();
            first = false;
        }
        return names;
    }

    public String toString() {
        return "Book[title=" + title +
               ",authors={" + getAuthorNames() + "}" +
               ",price=" + price +
               ",qty=" + qty + "]";
    }
}
