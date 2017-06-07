import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class CSV_Reader{

	public static void main(String[] args) {
		csvArray("c:\\Users\\l15\\Downloads\\ml-20m\\ml-20m\\");

	}
	
	static void csvArray(String Location){
		
		Scanner inStream = null;
		Scanner inStream2 = null;
		long startTime, endTime, totalTime;
		
		int checker = 0; 
		int dots = 0;
		
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
			inStream2 = new Scanner(new BufferedReader(new FileReader(userLocation)));
			System.out.println("Here");
			inStream2.nextLine();
			startTime = System.currentTimeMillis();
			while (inStream2.hasNextLine()) {
				currentLine = inStream2.nextLine();
				String[] splitStrings = currentLine.split(",");

				if(checker != Integer.parseInt(splitStrings[0])) //Changes ID string into int and checks if user already exists in list
				{
					User newUser = new User();
					newUser.setID(Integer.parseInt(splitStrings[0]));
					uList.append(newUser);
					
					checker = Integer.parseInt(splitStrings[0]);
					//System.out.println("Checker was changed to " + checker);
					//System.out.println("Dots = " + dots);
					//dots = 0;
				}
				//dots++;
			}
			endTime = System.currentTimeMillis();
			inStream2.close();
			System.out.println("Here");
			System.out.println(uList.getUserCount());
			totalTime = endTime - startTime;
			System.out.println("Total time elapsed = " +totalTime);
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
