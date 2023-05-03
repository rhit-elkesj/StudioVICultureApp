package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 * Class: HelpLayout
 * 
 * @author Richelle Elkes
 * 
 *         Purpose: Creates a JTextPane and chat bot for user to be able to
 *         interact with when receiving help
 * 
 *         Restrictions: None
 */
public class HelpLayout {

	// Instantiated Variables & Components
	private static final int SCREEN_WIDTH = 1520;
	private static final int SCREEN_HEIGHT = 820;
	private static final int CONSOLE_WIDTH = (int) (SCREEN_WIDTH / 2.5);
	private static final int CONSOLE_HEIGHT = SCREEN_HEIGHT - 28;
	private int lastDayGlobal = DayLayoutList.lastDayGlobal;
	private String botReply;
	private String userReply;
	private HashMap<Integer, DayContent> dayContentHashMap = DayLayoutList.dayContentHashMap;
	private static final Color BACKGROUND_COLOUR = new Color(232, 244, 253);
	private static final Color BACKGROUND_COLOUR1 = new Color(29, 29, 94);
	private static final Color BACKGROUND_COLOUR4 = new Color(92, 142, 228);
	private JFrame frame;
	private JPanel mainPanel;
	private JPanel rightPanel;;
	private JTextPane helpConsole;
	private JScrollPane consolePane;
	private JLabel commandLabel;
	private JButton home;

	public HelpLayout(JFrame mainFrame) {

		// Main Frame
		this.frame = mainFrame;
		frame.getContentPane().setBackground(BACKGROUND_COLOUR);
		frame.setVisible(true);

		// Home Button
		home = new HomeButton(frame, SCREEN_WIDTH, Color.black);
		frame.add(home, BorderLayout.NORTH);

		// Main Panel
		mainPanel = new JPanel();
		mainPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		mainPanel.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT - 75));
		mainPanel.setLayout(new BorderLayout());
		mainPanel.setVisible(true);
		mainPanel.setBackground(Color.WHITE);
		frame.add(mainPanel);

		// Console Pane
		consolePane = new JScrollPane(); // Pane will have scroll function if enough lines are used
		consolePane.setPreferredSize(new Dimension(CONSOLE_WIDTH, CONSOLE_HEIGHT));
		consolePane.setBackground(Color.white);

		// Console
		helpConsole = new JTextPane(); // New TextPane where the user can freely type
		helpConsole.setFont(new Font(helpConsole.getText(), Font.BOLD, 16));
		helpConsole.setForeground(BACKGROUND_COLOUR1);
		helpConsole.setText("Welcome to the Help Console! Please enter your message below!\n"
				+ "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
				+ "\n");
		helpConsole.setEditable(true);
		helpConsole.setBackground(Color.WHITE);
		helpConsole.setBorder(BorderFactory.createLineBorder(Color.black, 1, true));
		consolePane.setViewportView(helpConsole); // Makes it viewable
		mainPanel.add(consolePane, BorderLayout.WEST);

		// Right Panel
		rightPanel = new JPanel();
		rightPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); // Add a 5 pixel border around the panel
		rightPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		rightPanel.setBackground(Color.white);
		mainPanel.add(rightPanel, BorderLayout.CENTER);

		commandLabel = new JLabel("<html> <b> Bot Commands: </b>" + "<br>" + "<br>" + "<br>" + "<b> NAVIGATE </b>"
				+ "<br>" + "Will return instructions on how to use this application" + "<br>" + "<br>" + "<br>"
				+ "<b> FORGOT </b>" + "<br>" + "Will return the user's previous day according to the system" + "<br>"
				+ "<br>" + "<br>" + " <b> SEARCH (Insert Space) WORD </b>" + "<br>"
				+ "Will return lessons that include the user's search term (ie. 'Search prayer' will return Days 29 and 40)"
				+ "<br>" + "<br>" + "<br>" + "<b> DAY (Insert Space) NUMBER </b>" + "<br>"
				+ "Will return the associated Lesson, Activity, and Blessing for the Day specified (ie. 'Day 36')"
				+ "<br>" + "<br>" + "<br>" + "<b> OMER (Insert Space) CHARACTERISTIC </b>" + "<br>"
				+ "Will return the days that exhibit the characteristic the user input (ie. 'Omer Chesed')" + "<br>"
				+ "<br>" + "<br>"
				+ "<b> <i> **NOTE: </b> <i> To allow for full functionality of the HelpBot, specifically search features, please ensure you </i>"
				+ "<br>"
				+ " <i> have clicked into a 'Day' from the 'Start Counting' screen on the homepage. Thank you! </i> </html>");
		commandLabel.setFont(new Font(commandLabel.getText(), Font.PLAIN, 16));
		rightPanel.add(commandLabel);

		frame.revalidate();
		frame.repaint();

		// KeyListener
		helpConsole.addKeyListener(new KeyAdapter() {
			// KeyListener method
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {

					String input = userReply.trim().toUpperCase();

					botReply = getDefaultResponse(input);

					// Append the latest conversation to the helpConsole
					StyledDocument doc = helpConsole.getStyledDocument();

					SimpleAttributeSet right = new SimpleAttributeSet();
					StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
					StyleConstants.setForeground(right, BACKGROUND_COLOUR4);
					StyleConstants.setBold(right, true);

					try {
						doc.insertString(doc.getLength(), "\n" + "HelpBot: " + botReply + "\n", right);
					} catch (BadLocationException ex) {
						ex.printStackTrace();
					}
					userReply = "";
				} else if (Character.isLetterOrDigit(e.getKeyChar())) { // Only accepts letters or numbers
					userReply += e.getKeyChar();
				} else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) { // Check if Backspace key is pressed
					e.consume();
				} else if (e.getKeyCode() == KeyEvent.VK_DELETE) { // Check if Delete key is pressed
					e.consume();
				}
			}// keyPressed
		});
	}// HelpLayout

	public String getDefaultResponse(String user) {

		switch (user.toUpperCase()) { // Switch cases
		case "FORGOT":
			botReply = "According to my system, the last day you were on was Day " + lastDayGlobal;
			break;
		case "NAVIGATE":
			botReply = "\n\nThe Home page serves as the starting point of the application and includes a 'Start Counting,' an 'About,' and a 'Help' button. In the event that you require assistance, you can select the 'Help' button. The Help page allows you to enter a command in the console, and I will do my best to provide assistance. It is advised to exercise caution with spelling when entering inquiries.\n\n"
					+ "Pressing the 'Start Counting' button will lead you to the primary 7x7 Grid. If you are starting your count on Day 1, select the Day 1 button. If you wish to continue from a previous day, you can choose the corresponding number.\n\n"
					+ "Each day includes learning the daily lesson, participating in the daily activity that reinforces the lesson, and reciting the blessing and count to be completed in the evening. Upon completion of the day's tasks, selecting the forward arrow allows you to proceed to the following day. If the arrow is mistakenly clicked twice, selecting the back arrow will allow you to go backward. If you need to exit the day, the Home button, represented as the Star of David, can be clicked to return to the Home Page. "
					+ "If you are seeking additional knowledge on the Counting of the Omer and its significance, selecting the 'About' button is recommended.";
			break;
		case "":
			botReply = "Please enter a valid command, so that I can assist you.";
			break;
		case "HI":
			botReply = "Greetings!";
			break;
		case "HELLO":
			botReply = "Greetings!";
			break;
		case "HELP":
			botReply = "I would be happy to assist you! Please enter a valid command.";
			break;
		case "THANKS":
			botReply = "No problem! Let me know if I can help more!.";
		case "BYE":
			botReply = "Ok. Goodbye.";
			break;
		case "GOOD BYE":
			botReply = "Ok. Goodbye.";
			break;
		default:
			botReply = "Please try again, I did not find a valid command in your message.";
			break;
		}

		if (user.contains("DAY")) {
			String userSearch = user.substring(user.indexOf("day") + 4).trim().toLowerCase();
			if (userSearch.isEmpty()) {
				botReply = "Please enter a valid day number after the 'Day' command (ie. Day 36)";
			} else if (!userSearch.matches("\\d+")) {
				botReply = "Please enter a valid day number after the 'Day' command (ie. Day 36)";
			} else {
				int day = Integer.parseInt(userSearch);
				if (day < 1 || day >= 50) {
					botReply = "Sorry, the number entered is not valid. It must be within the range of 1 and 49. Please try again!";
				} else {
					DayContent dayContent = dayContentHashMap.get(day);
					String jText = dayContent.getTextArea().getText();
					jText = jText.replaceAll("<html>", "");
					jText = jText.replaceAll("</html>", "");
					jText = jText.replaceAll("<b>", "");
					jText = jText.replaceAll("</b>", "\n");
					jText = jText.replaceAll("<br>", "");
					jText = jText.replaceAll("Lesson", "\n" + "Lesson");
					jText = jText.replaceAll("Activity", "\n" + "Activity");
					jText = jText.replaceAll("Blessing", "\n" + "Blessing");
					botReply = "The Lesson, Activity, and Blessing for Day '" + userSearch + "' is:" + jText;
				}
			}
		}

		if (user.contains("OMER")) {
			String userSearch = user.substring(user.indexOf("omer") + 5).trim().toLowerCase();
			if (userSearch.matches(".*\\d.*")) {
				botReply = "It appears a number has been entered. Please enter a valid search term (ie. Characteristic Chesed).";
			} else if (!userSearch.isEmpty()) {
				userSearch = userSearch.substring(0, 1).toUpperCase() + userSearch.substring(1).toLowerCase();
				boolean found = false;
				botReply = "The days that exhibit the characteristic '" + userSearch + "' are: ";
				for (int i = 1; i < 50; i++) {
					DayContent dayContent = dayContentHashMap.get(i);
					if (dayContent.getLabel().getText().contains(userSearch)) {
						botReply += i + "  ";
						found = true;
					}
				}
				if (!found) {
					botReply = "Sorry, I could not find any days that exhibited the characteristic '" + userSearch
							+ ".'";
				}
			} else {
				botReply = "Please enter a valid search term (ie. Characteristic Chesed).";
			}
		}

		if (user.contains("SEARCH")) {
			String userSearch = user.substring(user.indexOf("search") + 7).trim().toLowerCase();
			if (!userSearch.isEmpty()) {
				boolean found = false;
				botReply = "The days that include '" + userSearch + "' in the lesson are: ";
				for (int i = 1; i < 50; i++) {
					DayContent dayContent = dayContentHashMap.get(i);
					if (dayContent.getTextArea().getText().toLowerCase().contains(userSearch)) {
						botReply += i + " ";
						found = true;
					}
				}
				if (!found) {
					botReply = "Sorry, I could not find any days that include '" + userSearch + "' in the lesson.";
				}
			} else {
				botReply = "Please enter a valid search term (ie. Search Prayer).";
			}
		}
		return botReply;

	}// getDefaultResponse
}
// HelpLayout