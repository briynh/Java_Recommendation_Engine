import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class CSV_Reader{

	public static void main(String[] args) {
		csvArray("c:\\Users\\l15\\Downloads\\ml-20m\\ml-20m\\");

	}
	
	static void csvArray(String Location){
		
		Scanner inStream = null;
		String currentLine = "";
		String movieLocation = Location + "movies.csv";
		String userLocation = Location + "ratings.csv";
		
		MovieList mList = new MovieList();
		UserList uList = new UserList();
		
		
		try {
			inStream = new Scanner(new BufferedReader(new FileReader(movieLocation)));
			
			inStream.nextLine();
			
			while (inStream.hasNextLine()) {
				currentLine = inStream.nextLine();
				String[] splitStrings = currentLine.split(",");
				
				String[] genreList = splitStrings[2].split("\\|");
				
				
				Movie newMovie = new Movie();
				newMovie.setID(Integer.parseInt(splitStrings[0]));
				newMovie.setName(splitStrings[1]);	
				newMovie.setGenre(genreList);
				mList.append(newMovie);
			}
			
			//mList.printAll();
			System.out.println(mList.getMovieCount());
			
			inStream.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		try{
			inStream = new Scanner(new BufferedReader(new FileReader(userLocation)));
			
			inStream.nextLine();
			
			while (inStream.hasNextLine()) {
				currentLine = inStream.nextLine();
				
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
