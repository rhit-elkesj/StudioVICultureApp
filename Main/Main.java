package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Class: Main
 * 
 * @author Richelle Elkes <br>
 *         Purpose: Top level class for Studio VI Project containing Main method
 *         <br>
 *         Restrictions: None
 * @ReferencedClasses HomeScreen
 */
public class Main {

	// Instantiated Variables
	private static final Color BACKGROUND_COLOUR = Color.BLACK;
	private static final int SCREEN_WIDTH = 1520;
	private static final int SCREEN_HEIGHT = 820;
	private static final String[] LANGUAGE_OPTIONS = { "English", "Hebrew" };
	private static final String[] LANGUAGE_TITLES = { "Counting the Omer", "סופרים את העומר" };
	private JFrame frame = new JFrame();
	protected static String selectedLanguage;

	private void runApp() {

		// Ensures the program is starting
		System.out.println("Running Program");

		// Displays dialogBox for user to click the language they want the application
		selectedLanguage = (String) JOptionPane.showInputDialog(null, "Select a language:", "Language Selection",
				JOptionPane.PLAIN_MESSAGE, null, LANGUAGE_OPTIONS, LANGUAGE_OPTIONS[0]);

		// If the dialogBox is closed without a language selected, program closes
		if (selectedLanguage == null) {
			System.exit(0);
		}

		for (int i = 0; i < LANGUAGE_TITLES.length; i++) {
			if (selectedLanguage.equals(LANGUAGE_OPTIONS[i])) {
				frame.setTitle(LANGUAGE_TITLES[i]);
			}
		}

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainButtonPanel = new JPanel(new BorderLayout());
		mainButtonPanel.setBackground(BACKGROUND_COLOUR);
		frame.add(mainButtonPanel);

		new HomeScreen(frame, selectedLanguage);

		frame.setMinimumSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		frame.setVisible(true);
	}// runApp

	public static void main(String[] args) {
		Main mainApp = new Main();
		mainApp.runApp();

	}// runApp
}// Main
