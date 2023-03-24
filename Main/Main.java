package Main;

import java.awt.BorderLayout;
import java.awt.Color;
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
 * @author IsraelGroup <br>
 *         Purpose: Top level class for Studio VI Project containing Main method
 *         <br>
 *         Restrictions: None
 */
public class Main {

	// Instantiated Variables
	private static final int SCREEN_WIDTH = 1520;
	private static final int SCREEN_HEIGHT = 820;
	private static final int BORDER_GAP_WIDTH_T = 5;
	private static final int BORDER_GAP_WIDTH_L = 3;
	private static final int BORDER_GAP_WIDTH_B = 5;
	private static final int BORDER_GAP_WIDTH_R = 3;

	/**
	 * Ensures: The program is ran
	 *
	 * <br>
	 * Requires: The Frame and subsequent components are created and displayed
	 */
	private void runApp() {

		// Ensures the program is starting
		System.out.println("Running Program");

		// Constructing the frame, buttonGrid, and mainButton Panel
		JFrame frame = new JFrame("Counting of the Omer");
		GridLayout buttonGrid = new GridLayout(7, 7, 5, 5);
		JPanel mainButtonPanel = new JPanel(buttonGrid);

		frame.getRootPane().setBackground(Color.BLACK);
		frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.BLACK);

		mainButtonPanel.setBorder(BorderFactory.createEmptyBorder(BORDER_GAP_WIDTH_T, BORDER_GAP_WIDTH_L,
				BORDER_GAP_WIDTH_B, BORDER_GAP_WIDTH_R));

		mainButtonPanel.setBackground(Color.BLACK);
		frame.add(mainButtonPanel);
		frame.setVisible(true);

		// IOException if the GridButtons cannot be constructed properly
		try {
			new GridButtons(frame, mainButtonPanel, buttonGrid);
		} catch (IOException e) {
			e.printStackTrace();
		}

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
	 * @throws InvalidLevelFormatException (eventually, will add in later)
	 */
	public static void main(String[] args) {
		Main mainApp = new Main();
		mainApp.runApp();

	}// main
}
