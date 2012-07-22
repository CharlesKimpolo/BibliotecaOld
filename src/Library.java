import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<Book>();
    private List<Movie> movies = new ArrayList<Movie>();
    public List<User> users = new ArrayList<User>();

    public Library(List<Book> books, List<Movie> movies, List<User> users) {
        this.books = books;
        this.movies = movies;
        this.users = users;
    }

    public String listBooks() {
        String listOfBooks = "";
        for (int i =0; i<books.size(); i++){
            if(books.get(i) != null) {
                if (i > 0) listOfBooks +=  "\n";
                listOfBooks += "Book" + String.valueOf(i+1) + ": " + books.get(i).displayBookInfo();
            }
        }

        return listOfBooks;
    }

    public String reserveBook(int bookNumber) {
        if (books.get(bookNumber-1).isReserved()) {
            return "Sorry we don't have that book yet.";
        }
        else {
            books.get(bookNumber-1).markAsReserved();
            return "Thank You! Enjoy the book.";
        }
    }

    public String checkLibraryNumber() {
        return "Please talk to Librarian. Thank you.";
    }

    public String displayListOfMovies() {
        String listOfMovies = "";
        for (int i =0; i<movies.size(); i++){
            if(movies.get(i) != null) {
                if (i > 0) listOfMovies +=  "\n";
                listOfMovies += movies.get(i).displayMovieInfo();
            }
        }
        return listOfMovies;
    }

    public String displayListOfUsers() {
        String listOfUsers = "";
        for (int i=0; i<users.size(); i++){
            if(users.get(i) != null) {
                if (i > 0) listOfUsers +=  "\n";
                listOfUsers += users.get(i).displayUsername();
            }
        }
        return listOfUsers;
    }

    public String displayMenuOfOtherOperations() {
        return "1) Registered user, please login, 2) Exit";

    }
}


