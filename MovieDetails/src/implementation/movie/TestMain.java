//main method 
package implementation.movie;

public class TestMain {

	public static void main(String[] args) {
		MovieDetailsList details = new MovieDetailsList();

		details.addMovie(new Movie_Details("kgf", "yash", "radhika", "action"));
		details.addMovie(new Movie_Details("h20", "uppi", "priya", "suspense"));
		
		
        //checkby moviename
		boolean checkByName = details.findByMname("kgf");
		if (checkByName) {
			System.out.println("movie found");
		} else
			System.out.println("not found");
		
		
        //checkbygenere
		boolean checkByGenere = ((MovieDetailsList) details).findByGenere("biopic");
		if (checkByName) {
			System.out.println("movie found");

		} else
			System.out.println("not found");

		// remove movie
		details.removeMovie("h20");

		// display the moviedetails
		details.display();

	}

}
