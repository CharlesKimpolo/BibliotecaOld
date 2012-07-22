import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class MovieTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void shouldBeAbleToDisplayMovieInfo() throws Exception {
        Movie movie = new Movie("SholayRamesh", "Sippy", "N/A");
        assertEquals("Movie name: SholayRamesh, Director: Sippy, Rating: N/A", movie.displayMovieInfo());

    }
}
