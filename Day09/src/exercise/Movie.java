package exercise;

public class Movie {
	private String title, director, actors;

	public void setTitle(String input_title) {
		title = input_title;
	}

	public void setDirector(String input_director) {
		director = input_director;
	}

	public void setActors(String input_actors) {
		actors = input_actors;
	}

	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	public String getActors() {
		return actors;
	}
}
