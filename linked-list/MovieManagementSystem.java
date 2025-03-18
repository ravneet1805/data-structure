// 2. Doubly Linked List: Movie Management System
class Movie {
    String title, director;
    int year;
    double rating;
    Movie next, prev;

    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

class MovieList {
    private Movie head, tail;

    public void addMovie(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }
    
    public void displayMovies() {
        Movie current = head;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Director: " + current.director + ", Year: " + current.year + ", Rating: " + current.rating);
            current = current.next;
        }
    }
}

public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieList list = new MovieList();
        list.addMovie("Inception", "Christopher Nolan", 2010, 8.8);
        list.addMovie("Interstellar", "Christopher Nolan", 2014, 8.6);
        list.displayMovies();
    }
}