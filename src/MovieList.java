
public class MovieList {
	private static Movie[] movieList;
	private static int movieCount;
	private static int listSize;
	
	public MovieList(){
		movieList = new Movie[10];
		movieCount = 0;
		listSize = 0;
	}
	
	public void append(Movie add){
		movieList[movieCount] = add;
		movieCount++;
	}
	
	public static boolean find(String movieName){
		
		
		return true;
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
}
