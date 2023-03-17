package Main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class OmerDays {

	// Instantiated Variables
	private static final String[] FILES = new String[] { "Day1" };
	private String dayFile;

	public OmerDays() {
		
		this.dayFile = FILES[0];
	}

	protected void getDay(String wantedFile) throws FileNotFoundException {

		FileReader dayReader = new FileReader(dayFile + ".txt");
		Scanner dayScanner = new Scanner(dayReader);

		while (dayScanner.hasNextLine()) {
			System.out.println(dayScanner.nextLine());
		}
	}// getday

	public static String[] getFiles() {
		return FILES;
	}// getFiles
}
