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
 * @author Richelle Elkes <br>
 *         Purpose: Creates a JTextPane and chat bot for user to be able to
 *         interact with when receiving help <br>
 *         Restrictions: None
 * @ReferencedClasses HomeButton, dayContent
 */
public class HelpLayout {

	// Instantiated Variables & Components
	private static final Color BACKGROUND_COLOUR = new Color(232, 244, 253);
	private static final Color USER_FONT_COLOUR = new Color(29, 29, 94);
	private static final Color BOT_FONT_COLOUR = new Color(92, 142, 228);
	private static final int SCREEN_WIDTH = 1520;
	private static final int SCREEN_HEIGHT = 820;
	private static final int CONSOLE_WIDTH = (int) (SCREEN_WIDTH / 2.5);
	private static final int CONSOLE_HEIGHT = SCREEN_HEIGHT - 28;
	private static final int MAIN_PANEL_BORDER = 50;
	private static final int BANNER_HEIGHT = 75;
	private static final int FONT_SIZE = 16;
	private static final int CONSOLE_THICKNESS = 1;
	private static final int RIGHT_PANEL_BORDER = 5;
	private static final int START_DAY = 1;
	private static final int LAST_DAY = 50;
	private HashMap<Integer, DayContent> dayContentHashMap = DayLayoutList.dayContentHashMap;
	private int lastDayGlobal = DayLayoutList.lastDayGlobal;
	private String selectedLanguage = Main.selectedLanguage;
	private String userReply = "";
	private String botReply;
	private JFrame frame;
	private JPanel mainPanel;
	private JPanel rightPanel;;
	private JScrollPane consolePane;
	private JTextPane helpConsole;
	private JLabel commandLabel;
	private JButton home;

	public HelpLayout(JFrame mainFrame) {

		// Main Frame
		this.frame = mainFrame;
		frame.getContentPane().setBackground(BACKGROUND_COLOUR);
		frame.setVisible(true);

		// Home Button
		home = new HomeButton(frame, SCREEN_WIDTH, Color.BLACK);
		frame.add(home, BorderLayout.NORTH);

		// mainPanel
		mainPanel = new JPanel();
		mainPanel.setBorder(BorderFactory.createEmptyBorder(MAIN_PANEL_BORDER, MAIN_PANEL_BORDER, MAIN_PANEL_BORDER,
				MAIN_PANEL_BORDER));
		mainPanel.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT - BANNER_HEIGHT));
		mainPanel.setLayout(new BorderLayout());
		mainPanel.setVisible(true);
		mainPanel.setBackground(Color.WHITE);
		frame.add(mainPanel);

		// consolePane, Pane will have scroll function if enough lines are used
		consolePane = new JScrollPane();
		consolePane.setPreferredSize(new Dimension(CONSOLE_WIDTH, CONSOLE_HEIGHT));
		consolePane.setBackground(Color.WHITE);

		// helpConsole, new JTextPane where the user can freely type
		helpConsole = new JTextPane();
		helpConsole.setFont(new Font(helpConsole.getText(), Font.BOLD, FONT_SIZE));
		helpConsole.setForeground(USER_FONT_COLOUR);
		helpConsole.setText("Welcome to the Help Console! Please enter your message below!\n"
				+ "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
				+ "\n");
		helpConsole.setEditable(true);
		helpConsole.setBackground(Color.WHITE);
		helpConsole.setBorder(BorderFactory.createLineBorder(Color.BLACK, CONSOLE_THICKNESS, true));
		// Makes it viewable
		consolePane.setViewportView(helpConsole);
		mainPanel.add(consolePane, BorderLayout.WEST);

		// rightPanel, with border
		rightPanel = new JPanel();
		rightPanel.setBorder(BorderFactory.createEmptyBorder(RIGHT_PANEL_BORDER, RIGHT_PANEL_BORDER, RIGHT_PANEL_BORDER,
				RIGHT_PANEL_BORDER));
		rightPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		rightPanel.setBackground(Color.WHITE);
		mainPanel.add(rightPanel, BorderLayout.CENTER);

		if (selectedLanguage.equals("Hebrew")) {
			commandLabel = new JLabel("<html><div style='text-align: right;'><b> פקודות בוט: </b>" + "<br>" + "<br>"
					+ "<b> נווט </b>" + "<br>" + "ישוב עם הוראות לשימוש באפליקציה זו" + "<br>" + "<br>"
					+ "<b> שכחתי </b>" + "<br>" + "ישוב את היום הקודם של המשתמש לפי המערכת" + "<br>" + "<br>"
					+ "<b> ברור </b>" + "<br>" + "מנקה את הטקסט הנוכחי במסוף" + "<br>" + "<br>" + " <b> חפש [מילה] </b>"
					+ "<br>" + "יחזיר שיעורים הכוללים את מונח החיפוש של המשתמש (כמו 'חיפוש תפילה')" + "<br>" + "<br>"
					+ "<b> יום [מספר] </b>" + "<br>"
					+ "יחזיר את השיעור, הפעילות והברכה המשויכים ליום שצוין (כלומר 'יום ל\"ו')" + "<br>" + "<br>"
					+ "<b> עומר (הכנס רווח) מאפיין </b>" + "<br>"
					+ "יחזיר את הימים שמציגים את המאפיין שהמשתמש קלט (כלומר 'עומר חסד')" + "<br>" + "<br>"
					+ "<b> <i> **הערה: </b> <i> כדי לאפשר את הפונקציונליות המלאה של ה-HelpBot, במיוחד תכונות החיפוש, אנא הקפד"
					+ "<br>" + "<i> לחצו על 'יום' ממסך 'התחל לספור' בדף הבית. תודה! </i></div></html>");

			helpConsole.setText("ברוכים הבאים למסוף העזרה! אנא הזינו את ההודעה שלכם למטה.\r\n"
					+ "מסוף העזרה אינו פעיל כעת בעברית. הוא פועל כרגע רק באנגלית.\n"
					+ "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
					+ "\n");
		}

		else {
			commandLabel = new JLabel("<html> <b> Bot Commands: </b>" + "<br>" + "<br>" + "<br>" + "<b> NAVIGATE </b>"
					+ "<br>" + "Will return instructions on how to use this application" + "<br>" + "<br>" + "<br>"
					+ "<b> FORGOT </b>" + "<br>" + "Will return the user's previous day according to the system"
					+ "<br>" + "<br>" + "<br>" + "<b> CLEAR </b>" + "<br>"
					+ "Will clear the current text in the console" + "<br>" + "<br>" + "<br>"
					+ " <b> SEARCH (Insert Space) WORD </b>" + "<br>"
					+ "Will return lessons that include the user's search term (ie. 'Search Prayer')" + "<br>" + "<br>"
					+ "<br>" + "<b> DAY (Insert Space) NUMBER </b>" + "<br>"
					+ "Will return the associated Lesson, Activity, and Blessing for the Day specified (ie. 'Day 36')"
					+ "<br>" + "<br>" + "<br>" + "<b> OMER (Insert Space) CHARACTERISTIC </b>" + "<br>"
					+ "Will return the days that exhibit the characteristic the user input (ie. 'Omer Chesed')" + "<br>"
					+ "<br>" + "<br>"
					+ "<b> <i> **NOTE: </b> <i> To allow for full functionality of the HelpBot, specifically search features, please ensure you </i>"
					+ "<br>"
					+ " <i> have clicked into a 'Day' from the 'Start Counting' screen on the homepage. Thank you! </i> </html>");
		}

		commandLabel.setFont(new Font(commandLabel.getText(), Font.PLAIN, FONT_SIZE));
		rightPanel.add(commandLabel);

		// Repaints updated Frame
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
					StyleConstants.setForeground(right, BOT_FONT_COLOUR);
					StyleConstants.setBold(right, true);

					try {
						doc.insertString(doc.getLength(), "\n" + "HelpBot: " + botReply + "\n", right);
					} catch (BadLocationException ex) {
						ex.printStackTrace();
					}
					userReply = "";

					// Only accepts letters or numbers
				} else if (Character.isLetterOrDigit(e.getKeyChar())) {
					userReply += e.getKeyChar();
					// Check if Backspace key is pressed, do nothing
				}
			}
		});
	}

	public String getDefaultResponse(String user) {

		// Switch Cases
		switch (user.toUpperCase()) {
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
		case "CLEAR":
			botReply = "The console has been sucessfully cleared.";
			helpConsole.setText("Welcome to the Help Console! Please enter your message below!\n"
					+ "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
					+ "\n");
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
				if (day < START_DAY || day > LAST_DAY) {
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
				for (int i = START_DAY; i < LAST_DAY; i++) {
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
				for (int i = START_DAY; i < LAST_DAY; i++) {
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
}// HelpLayout