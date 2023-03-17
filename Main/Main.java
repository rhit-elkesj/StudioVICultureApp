package Main;

import java.awt.BorderLayout;
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

	private static final int BORDER_GAP_WIDTH_T = 0;
	private static final int BORDER_GAP_WIDTH_L = 30;
	private static final int BORDER_GAP_WIDTH_B = 30;
	private static final int BORDER_GAP_WIDTH_R = 30;

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

		frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainButtonPanel.setBorder(BorderFactory.createEmptyBorder(BORDER_GAP_WIDTH_T, BORDER_GAP_WIDTH_L,
				BORDER_GAP_WIDTH_B, BORDER_GAP_WIDTH_R));

		GridLayout labelGrid = new GridLayout(1, 7, 20, 20);
		JPanel labelPanel = new JPanel(labelGrid);
//		labelPanel.setSize(SCREEN_WIDTH, BORDER_GAP_WIDTH_T);
//		labelPanel.setAlignmentX(0);
//		labelPanel.setAlignmentY(0);

		frame.add(labelPanel, BorderLayout.NORTH);
		frame.add(mainButtonPanel);
		frame.setVisible(true);

		new GridButtons(frame, mainButtonPanel, buttonGrid);
		new MainLabel(frame, labelPanel);

		labelPanel.setVisible(true);

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
