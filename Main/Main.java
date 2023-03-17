package Main;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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

	private static final int BORDER_GAP_WIDTH_T = 10;
	private static final int BORDER_GAP_WIDTH_L = 10;
	private static final int BORDER_GAP_WIDTH_B = 10;
	private static final int BORDER_GAP_WIDTH_R = 10;

	/**
	 * Ensures: The program is ran
	 *
	 * <br>
	 * Requires: The Frame and subsequent components are created and displayed
	 */
	private void runApp() {

		System.out.println("Running Program");

		JFrame frame = new JFrame("Counting of the Omer");
		GridLayout buttonGrid = new GridLayout(7, 7, 20, 20);
		JPanel mainButtonPanel = new JPanel(buttonGrid);
		mainButtonPanel.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createEmptyBorder(BORDER_GAP_WIDTH_T, BORDER_GAP_WIDTH_L, BORDER_GAP_WIDTH_B,
						BORDER_GAP_WIDTH_R),
				BorderFactory.createTitledBorder(
						"                    CHESED                                                      GEVURAH                                                   TIFERET                                                   NETZACH                                                       HOD                                                        YESOD                                                     MALCHUT                                                                                                      ")));

		frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(mainButtonPanel);
		frame.setVisible(true);

		new GridButtons(frame, mainButtonPanel, buttonGrid);
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
