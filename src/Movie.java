
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
		numGenre = 0;
		totalStars = 0;
		totalRatings = 0;
	}
	
	public void setName(String name){
			this.name = name;
	}
	
	public void setID(int id){
		this.id = id;
	}
	
	public void setGenre(String[] genreList){
		genre = genreList;
		numGenre = genreList.length;
	}
	
	public void addStars(int rating){
		this.changeStars(rating);
		totalRatings++;
	}
	
	public void changeStars(int rating){
		totalStars += rating;
	}
	
	public float getAverageStars(){
		return totalStars/totalRatings;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getID(){
		return this.id;
	}
	
	public int getNumGenre(){
		return numGenre;
	}
	
	public String getGenre(int i){
		return genre[i];
	}
	
	
}
