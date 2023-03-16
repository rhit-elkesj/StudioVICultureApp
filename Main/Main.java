package Main;

import javax.swing.JFrame;

/**
 * Class: Main
 * 
 * @author IsraelGroup <br>
 *         Purpose: Top level class for Studio VI Project containing Main method
 *         <br>
 *         Restrictions: None
 */
public class Main {

	// Instantiated Variables
	private static final int SCREEN_WIDTH = 1520;
	private static final int SCREEN_HEIGHT = 820;

	/**
	 * Ensures: The program is ran
	 *
	 * <br>
	 * Requires: The Frame and subsequent components are created and displayed
	 */
	private void runApp() {
		System.out.println("Running Program");
		JFrame frame = new JFrame("Counting of the Omer");
		frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		new GridButtons(frame);
	}// runApp

	/**
	 * Ensures: Runs the program
	 * 
	 * @param Arguments not used
	 * @throws InvalidLevelFormatException (eventually, will add in later)
	 */
	public static void main(String[] args) {
		Main mainApp = new Main();
		mainApp.runApp();
	} // main
}
