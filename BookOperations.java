import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: ₹" + String.format("%.2f", price));
    }

    public String getAuthor() {
        return author;
    }
}

public class BookOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[3];

        System.out.println("Enter details for 3 books:");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nBook " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character left by nextDouble()
            books[i] = new Book(title, author, price);
        }

        System.out.print("\nEnter the name of the author to find their books: ");
        String searchAuthor = scanner.nextLine();

        System.out.println("\n--- Books by " + searchAuthor + " ---");
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(searchAuthor)) {
                book.displayDetails();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found by the author: " + searchAuthor);
        }
        System.out.println("------------------------------");
        scanner.close();
    }
}
