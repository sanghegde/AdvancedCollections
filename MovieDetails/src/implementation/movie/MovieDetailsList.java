//class moviedetaillist which contains the other methods
package implementation.movie;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MovieDetailsList {
	Set<Movie_Details> movie = new LinkedHashSet<>();

	public void addMovie(Movie_Details movieName) {
		movie.add(movieName);
		System.out.println(movieName.getMov_name() + "added");

	}

	public void removeMovie(String movieName) {
		Predicate<Movie_Details> delMovie = Movie_Details -> Movie_Details.getMov_name().equals(movieName);
		movie.removeIf(delMovie);
	}

	public void removeAll() {
		movie.clear();
		System.out.println("all moves are deleted");
	}

	public boolean findByMname(String movieName) {
		Predicate<Movie_Details> checkMovieByName = Movie_Details -> (Movie_Details.getMov_name().equals(movieName));
		return movie.stream().anyMatch(checkMovieByName);
	}

	public boolean findByGenere(String genere) {
		Predicate<Movie_Details> checkMovieByGenere = Movie_Details -> (Movie_Details.getMov_name().equals(genere));
		return movie.stream().anyMatch(checkMovieByGenere);
	}

	public void display() {
		Consumer<Movie_Details> disp = Movie_Details -> System.out.println(Movie_Details);
		movie.stream().forEach(disp);
	}

}