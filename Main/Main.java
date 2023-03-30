package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 * Class: Main
 * 
 * @author elkesj <br>
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
	 * 
	 * @throws IOException
	 */
	private void runApp() {

		// Ensures the program is starting
		System.out.println("Running Program");

		JFrame frame = new JFrame("Counting of the Omer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel mainButtonPanel = new JPanel(new BorderLayout());
		mainButtonPanel.setBackground(Color.BLACK);
		frame.add(mainButtonPanel);

		new HomeScreen(frame);

		frame.setMinimumSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));

		frame.pack();
		frame.setVisible(true);

		// Constructor for a MainLabel
		// (not being, delete in final version of program if not used)

//		GridLayout labelGrid = new GridLayout(1, 7, 20, 20);
//		JPanel labelPanel = new JPanel(labelGrid);
//		frame.add(labelPanel, BorderLayout.NORTH);
//		new MainLabel(frame, labelPanel);
//		labelPanel.setVisible(true);

	}// runApp

	/**
	 * Ensures: Runs the program
	 * 
	 * @param Arguments not used
	 * @throws IOException
	 * @throws InvalidLevelFormatException (eventually, will add in later)
	 */
	public static void main(String[] args) {
		Main mainApp = new Main();
		mainApp.runApp();

	}// runApp
}// Main
