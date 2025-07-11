import java.util.Scanner;

class Publisher {
    String publisherName;

    Publisher(String publisherName) {
        this.publisherName = publisherName;
    }

    void displayPublisher() {
        System.out.println("Publisher: " + publisherName);
    }
}

class Book extends Publisher {
    String bookTitle;
    String author;
    double price;

    Book(String publisherName, String bookTitle, String author, double price) {
        super(publisherName);
        this.bookTitle = bookTitle;
        this.author = author;
        this.price = price;
    }

    void displayBookDetails() {
        displayPublisher();
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

class Literature extends Book {
    Literature(String publisherName, String bookTitle, String author, double price) {
        super(publisherName, bookTitle, author, price);
    }

    void display() {
        System.out.println("\n**Literature Book Details**");
        displayBookDetails();
    }
}

class Fiction extends Book {
    Fiction(String publisherName, String bookTitle, String author, double price) {
        super(publisherName, bookTitle, author, price);
    }

    void display() {
        System.out.println("\n**Fiction Book Details**");
        displayBookDetails();
    }
}

public class BookManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Literature Book Details:");
        System.out.print("Publisher: ");
        String litPublisher = scanner.nextLine();
        System.out.print("Title: ");
        String litTitle = scanner.nextLine();
        System.out.print("Author: ");
        String litAuthor = scanner.nextLine();
        System.out.print("Price: ");
        double litPrice = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        Literature literature = new Literature(litPublisher, litTitle, litAuthor, litPrice);

        System.out.println("\nEnter Fiction Book Details:");
        System.out.print("Publisher: ");
        String ficPublisher = scanner.nextLine();
        System.out.print("Title: ");
        String ficTitle = scanner.nextLine();
        System.out.print("Author: ");
        String ficAuthor = scanner.nextLine();
        System.out.print("Price: ");
        double ficPrice = scanner.nextDouble();
        Fiction fiction = new Fiction(ficPublisher, ficTitle, ficAuthor, ficPrice);

        literature.display();
        fiction.display();
    }
}
