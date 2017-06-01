
public class Movie {
	
	private int id;
	private String name;
	private String[] genre;
	private int numGenre;
	private int totalStars;
	private int totalRatings;
	
	public Movie(){
		id = 0;
		name = "";
		genre = null;
		totalStars = 0;
		totalRatings = 0;
	}
	
	public void setName(String name){
			this.name = name;
	}
	
	public void setID(int id){
		this.id = id;
	}
	
	public void changeStars(int rating, int exist){
		totalStars += rating;
	}
	
	public float getAverageStars(){
		return totalStars/totalRatings;
	}
	
	
}
