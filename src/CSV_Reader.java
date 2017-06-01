import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class CSV_Reader{

	public static void main(String[] args) {
		csvArray("c:\\Users\\l15\\Downloads\\ml-20m\\ml-20m\\test.csv");

	}
	
	static void csvArray(String Location){
		
		Scanner inStream = null;
		String currentLine = "";
		
		try {
			inStream = new Scanner(new BufferedReader(new FileReader(Location)));
			
			inStream.nextLine();
			
			while (inStream.hasNextLine()) {
				currentLine = inStream.nextLine();
				String[] splitStrings = currentLine.split(",");
				System.out.println(splitStrings[0] + " " + splitStrings[1] + " " + splitStrings[2]);
			}
			inStream.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
