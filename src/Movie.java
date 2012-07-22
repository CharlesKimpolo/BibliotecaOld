import static java.lang.Integer.valueOf;

public class Movie {
    String name;
    String director;
    String rating;

    public Movie(String name, String director, String rating) {
        this.name = name;
        this.director = director;
        this.rating = rating;
    }

    public String displayMovieInfo() {
        return "Movie name: " + name + ", Director: " + director + ", Rating: " + rating;
    }
}
