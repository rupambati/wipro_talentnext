package oops;

import java.util.Scanner;

// Author class
class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String toString() {
        return name + " (" + gender + ") at " + email;
    }
}

// Book class
class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String toString() {
        return "\nBook Name: " + name + "\nAuthor: " + author.toString() +
               "\nPrice: ₹" + price + "\nQuantity in stock: " + qtyInStock;
    }
}


public class OopsQues3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Author Name: ");
        String authorName = sc.nextLine();

        System.out.print("Enter Author Email: ");
        String authorEmail = sc.nextLine();

        System.out.print("Enter Author Gender (M/F): ");
        char authorGender = sc.next().charAt(0);

        Author author = new Author(authorName, authorEmail, authorGender);

        sc.nextLine(); 
        System.out.print("Enter Book Name: ");
        String bookName = sc.nextLine();

        System.out.print("Enter Book Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity in Stock: ");
        int qty = sc.nextInt();

        Book book = new Book(bookName, author, price, qty);

        System.out.println(book);

        sc.close();
    }
}
