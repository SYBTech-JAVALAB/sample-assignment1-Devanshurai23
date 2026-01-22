class Book {
    private String title;
    private String author;
    private double price;
    private String isbn;
    private int stock;

    public Book(String title, String author, double price, String isbn, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        this.stock = stock;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("ISBN: " + isbn);
        System.out.println("Stock: " + stock);
        System.out.println("Available: " + (isAvailable() ? "Yes" : "No"));
        System.out.println("---------------------------");
    }

    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }

    public void addStock(int quantity) {
        stock += quantity;
    }

    public boolean isAvailable() {
        return stock > 0;
    }
}

public class BookstoreInventory {
    public static void main(String[] args) {

        Book novel = new Book(
                "The Great Gatsby",
                "F. Scott Fitzgerald",
                15.99,
                "978-0743273565",
                10
        );

        Book textbook = new Book(
                "Introduction to Algorithms",
                "Thomas H. Cormen",
                89.99,
                "978-0262033848",
                0
        );

        novel.displayInfo();
        textbook.displayInfo();

        novel.applyDiscount(20);
        textbook.applyDiscount(10);

        novel.addStock(5);
        textbook.addStock(15);

        System.out.println("After updates:");
        novel.displayInfo();
        textbook.displayInfo();
    }
}


