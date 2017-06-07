
public class User {
	private int userID;
	private int name;
	private int totalRatings;
	private int totalMovies;
	private int[][] RPM;
	
	public boolean find(String movieName){
		return false;
	}
	
	public void setID(int id){
		this.userID = id;
	}
	
	public void editRating(int rating){
		totalRatings = rating;
	}
	
	public int getID(){
		return userID;
	}

}
