
public class MovieList {
	private static Movie[] movieList;
	private static int movieCount;
	private static int listSize;
	
	public MovieList(){
		listSize = 100;
		movieList = new Movie[listSize];
		movieCount = 0;
		
	}
	
	public void append(Movie add){		
		if(movieCount == listSize){
			listSize = listSize*2;
			Movie[] newList = new Movie[listSize];
			for(int i = 0; i < movieCount; i++){
				newList[i] = movieList[i];
			}
			
			movieList = newList;
		}
		//System.out.println("Current Size = " + movieCount);
		//System.out.println("Max Size = " + listSize);
		movieList[movieCount] = add;
		movieCount++;
	}
	
	public Movie find(String movieName){
		
		
	}
	
	public void printAll(){
		for(int i = 0; i < movieCount; i++){
			System.out.println(movieList[i].getID() + " " + movieList[i].getName());
			int numGenre = movieList[i].getNumGenre();
			for(int j = 0; j < numGenre; j++){
				System.out.print(movieList[i].getGenre(j) + " ");
			}
			System.out.println("");
		}
	}
	
	public int getMovieCount(){
		return movieCount;
	}
	
	public 
}
