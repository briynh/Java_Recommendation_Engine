import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class CSV_Reader {

	public static void main(String[] args) {
		csvArray("c:\\Users\\l15\\Downloads\\ml-20m\\ml-20m\\test.csv");

	}
	
	static void csvArray(String Location){
		
		Scanner inStream = null;
		String currentLine = "";
		
		try {
			inStream = new Scanner(new BufferedReader(new FileReader(Location)));
			
			while (inStream.hasNextLine()) {
				currentLine = inStream.nextLine();
				System.out.println(currentLine);
			}
			inStream.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
