import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class LibraryTest {

    public List<Book> libraryBooks = new ArrayList<Book>();
    public List<Movie> libraryMovies = new ArrayList<Movie>();
    public List<User> libraryUsers = new ArrayList<User>();
   // public Library library;

    @Test
    public void shouldListASingleBook() throws Exception {
        libraryBooks.add(new Book("Robin Hood", "Kevin Reynolds", "9029302930"));
        Library library = new Library(libraryBooks, null,null);
        assertEquals("Book1: Title: Robin Hood, Author: Kevin Reynolds, ISBN: 9029302930", library.listBooks());
    }


    @Test
    public void shouldListMultipleBooks() throws Exception {
        libraryBooks.add(new Book("Robin Hood", "Kevin Reynolds", "9029302930"));
        libraryBooks.add(new Book("Craig Wattrus", "Charles Kimpolo", "90293029211"));
        Library library = new Library(libraryBooks, null, null);
        String expectedResult;
        expectedResult = "Book1: Title: Robin Hood, Author: Kevin Reynolds, ISBN: 9029302930" + "\n";
        expectedResult += "Book2: Title: Craig Wattrus, Author: Charles Kimpolo, ISBN: 90293029211";
        assertEquals(expectedResult, library.listBooks());
    }


    @Test
    public void shouldBeAbleToStoreAMovie() throws Exception {
        libraryMovies.add(new Movie("SholayRamesh", "Sippy", "N/A"));
        Library library = new Library(null, libraryMovies, null);
        assertEquals("Movie1: Movie name: SholayRamesh, Director: Sippy, Rating: N/A", library.displayListOfMovies());


    }

    @Test
    public void shouldBeAbleToStoreMultipleMovies() throws Exception {

        libraryMovies.add(new Movie("CharlesKimpolo", "Lebon", "1"));
        libraryMovies.add(new Movie("CharlesMberi", "Kimpolo", "2"));
        String expectedListOfMovies;
        expectedListOfMovies = "Movie1: Movie name: CharlesKimpolo, Director: Lebon, Rating: 1" + "\n";
        expectedListOfMovies += "Movie2: Movie name: CharlesMberi, Director: Kimpolo, Rating: 2";
        Library library = new Library(null, libraryMovies, null);
        assertEquals(expectedListOfMovies, library.displayListOfMovies());
    }

    @Test
    public void shouldBeAbleToRegisterUser() throws Exception {
        libraryUsers.add(new User("111-1111", "wmb"));
        Library library = new Library(null, null, libraryUsers);
        assertEquals("Username: 111-1111, Password: wmb",library.displayListOfUsers());

    }

    @Test
     public void shouldBeABleToSuccessfullyReserveABook() throws Exception {
        libraryBooks.add(new Book("Robin Hood", "Kevin Reynolds", "9029302930"));
        Library library = new Library(libraryBooks, null,null);
        assertEquals("Thank You! Enjoy the book.", library.reserveBook(1));
    }

    @Test
    public void shouldNotBeABleToSuccessfullyReserveABookThatLibraryDoesNotHave() throws Exception {
        libraryBooks.add(new Book("Robin Hood", "Kevin Reynolds", "9029302930"));
        Library library = new Library(libraryBooks, null,null);
        library.reserveBook(1);
        assertEquals("Sorry we don't have that book yet.",library.reserveBook(1));
    }

    @Test
    public void shouldBeAbleToCheckLibraryNumber() throws Exception {
        Library library = new Library(null,null, libraryUsers);
        assertEquals("Please talk to Librarian. Thank you.",library.checkLibraryNumber());

    }
}
