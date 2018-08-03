//class Movie_Details with fields and getter and setter methods
package implementation.movie;

public class Movie_Details {

	private String mov_name;
	private String lead_actor;
	private String lead_actress;
	private String genere;

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public Movie_Details(String mov_name, String lead_actor, String lead_actress, String genere) {
		super();
		this.mov_name = mov_name;
		this.lead_actor = lead_actor;
		this.lead_actress = lead_actress;
		this.genere = genere;
	}

	public String getMov_name() {
		return mov_name;
	}

	public void setMov_name(String mov_name) {
		this.mov_name = mov_name;
	}

	public String getLead_actor() {
		return lead_actor;
	}

	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}

	public String getLead_actress() {
		return lead_actress;
	}

	public void setLead_actress(String lead_actress) {
		this.lead_actress = lead_actress;
	}

	@Override
	public String toString() {
		return "Movie_Details [mov_name=" + mov_name + ", lead_actor=" + lead_actor + ", lead_actress=" + lead_actress
				+ "]";
	}

}
