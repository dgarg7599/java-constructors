public class Book {

    String title;
    String author;
    double price;

    // Default Constructor
    public Book(){
        this.title = "unknown title";
        this.author = "unknown author";
        this.price = 0.0;
    }

    //Parameterized Constructor
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display Book Details
    public void displayBookDetails(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: $" + this.price);
    }

    public static void main(String[] args) {
        // Using default constructor
        Book book1 = new Book();
        System.out.println("Book1: ");
        book1.displayBookDetails();

        System.out.println();

        // Using parameterized constructor
        Book book2 = new Book("Java", "Uncle John", 200.0);
        System.out.println("Book2: ");
        book2.displayBookDetails();
    }
}


/*
Book1:
Title: unknown title
Author: unknown author
Price: $0.0

Book2:
Title: Java
Author: Uncle John
Price: $200.0

 */