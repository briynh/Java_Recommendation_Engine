
public class User {
	private int userID;
	private String name;
	private int totalRatings;
	private int totalMovies;
	private Movie[][] personalList;
	private int[] starList;
	
	public User(){
		userID = 0;
		name = "";
		totalRatings = 0;
		totalMovies = 0;
		personalList = new Movie[5][1000];
		starList = new int[]{0,0,0,0,0};
	}
	
	public boolean find(String movieName){
		return false;
	}
	
	public void setID(int id){
		this.userID = id;
	}
	
	public void addNewRating(int movieID, Float rating,  MovieList masterList){
		int roundedRating = Math.round(rating) - 1 ;
		personalList[roundedRating][starList[roundedRating]] = masterList.find(movieID);
		totalRatings += roundedRating;
		totalMovies++;
		starList[roundedRating]++;
		
	}
	
	public void printPersonalList(){
		
		for (int i = 0; i <5; i++){
				System.out.println(i + " star list:");
				for(int j = 0; j <starList[i]; j++){
					System.out.print(personalList[i][j].getName()+ " ");
				}
				System.out.println("");
		}
	}
	
	public int getID(){
		return userID;
	}

}
