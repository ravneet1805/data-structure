// 5. Doubly Linked List: Library Management System
import java.util.Scanner;

class Book {
    String title, author, genre;
    int id;
    boolean available;
    Book next, prev;

    public Book(String title, String author, String genre, int id) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.id = id;
        this.available = true;
    }
}

class Library {
    Book head, tail;

    void addBook(String title, String author, String genre, int id) {
        Book newBook = new Book(title, author, genre, id);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    void displayBooks() {
        Book temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.id + ", Title: " + temp.title + ", Available: " + temp.available);
            temp = temp.next;
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Java Programming", "James Gosling", "Tech", 201);
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 202);
        library.displayBooks();
    }
}