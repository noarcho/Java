package programming4;

public class Movie {
	private String title, director, production;
	
	public Movie(){
		this.title = null;
		this.director = null;
		this.production = null;
	}
	
	public Movie(String title, String director, String production){
		this.title = title;
		this.director = director;
		this.production = production;
	}
}
