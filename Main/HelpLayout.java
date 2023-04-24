package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Class: HelpLayout
 * 
 * @author Richelle Elkes <br>
 *         Purpose: Creates a JText Area and chat bot for user to be able to
 *         interact with when receiving help <br>
 *         Restrictions: None
 */
public class HelpLayout {

	// Instantiated Variables & Components
	private static final int SCREEN_WIDTH = 1520;
	private static final int SCREEN_HEIGHT = 820;
	private static final int CONSOLE_WIDTH = (int) (SCREEN_WIDTH / 2.5);
	private static final int CONSOLE_HEIGHT = SCREEN_HEIGHT - 28;
	private String botReply;
	private String userReply = "";
	private ArrayList<String> chatHistory = new ArrayList<>();
	private HashMap<Integer, DayContent> dayContentHashMap = DayLayoutList.dayContentHashMap;
	private static final Color BACKGROUND_COLOUR = new Color(232, 244, 253);
	private JFrame frame;
	private JPanel mainPanel;
	private JPanel rightPanel;;
	private JTextArea helpConsole;
	private JScrollPane consolePane;
	private JButton home;

	public HelpLayout(JFrame mainFrame) {

		// Main Frame
		this.frame = mainFrame;
		frame.setBackground(BACKGROUND_COLOUR);
		frame.setVisible(true);

		// Main Panel
		mainPanel = new JPanel();
		mainPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		mainPanel.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		mainPanel.setLayout(new BorderLayout());
		mainPanel.setBackground(BACKGROUND_COLOUR);
		mainPanel.setVisible(true);
		frame.add(mainPanel);

		// Console Pane
		consolePane = new JScrollPane(); // Pane will have scroll function if enough lines are used
		consolePane.setPreferredSize(new Dimension(CONSOLE_WIDTH, CONSOLE_HEIGHT));

		// Console
		helpConsole = new JTextArea(); // New TextArea where the user can freely type
		helpConsole.setText("Welcome to the Help Console!\n");
		helpConsole.setWrapStyleWord(true);
		helpConsole.setLineWrap(true);
		helpConsole.setEditable(true);
		helpConsole.setHighlighter(null);
		helpConsole.setBorder(BorderFactory.createLineBorder(Color.black, (int) 0.75, true));
		consolePane.setViewportView(helpConsole); // Makes it viewable
		mainPanel.add(consolePane, BorderLayout.WEST);

		// Right Panel
		rightPanel = new JPanel();
		rightPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); // Add a 5 pixel border around the panel
		rightPanel.setPreferredSize(new Dimension((int) (SCREEN_WIDTH / 1.6725), CONSOLE_HEIGHT));
		rightPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		rightPanel.setBackground(BACKGROUND_COLOUR);
		mainPanel.add(rightPanel, BorderLayout.CENTER);

		home = new JButton("Home");
		home.setName("Home");
		home.addActionListener(new ButtonListenerImplemented(home, frame));
		home.setOpaque(false);
		home.setContentAreaFilled(false);
		home.setBorderPainted(false);
		rightPanel.add(home, BorderLayout.CENTER);

		frame.revalidate();
		frame.repaint();

		// KeyListener
		helpConsole.addKeyListener(new KeyAdapter() {
			// KeyListener method
			public void keyPressed(KeyEvent e) {
				// Get the current caret position

				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					// Get the user's input from the new variable
					String input = userReply.trim().toUpperCase(); // Only saves the newest line input by the user

					botReply = getDefaultResponse(input);
					chatHistory.add(input);
					chatHistory.add(botReply);
					helpConsole.append("\n\nUser: " + userReply + "\nBot: " + botReply + "\n"); // Appending previous
																								// chat history and
																								// newest
					// lines
					helpConsole.setText(helpConsole.getText().trim()); // Remove gaps in console

					// Clear after adding to chatHistory (otherwise would append)
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
		case "HI":
			botReply = "Greetings!";
			break;
		case "HELLO":
			botReply = "Greetings!";
			break;
		case "HELP":
			botReply = "I would be happy to assist you! Please enter a valid command.";
			break;
		case "QUIT":
			botReply = "Ok. Goodbye.";
		case "BYE":
			botReply = "Ok. Goodbye.";
			break;
		case "":
			botReply = "Please enter a valid command, so that I can assist you.";
			break;
		case "CHESED":
			botReply = "The days that include 'Chesed' are: ";
			for (int i = 1; i < 50; i++) {
				DayContent dayContent = dayContentHashMap.get(i);
				if (dayContent.getLabel().getText().contains("Chesed")) {
					botReply += i + "  ";
				}
			}
			break;
		case "GEVURAH":
			botReply = "The days that include 'Gevurah' are: ";
			for (int i = 1; i < 50; i++) {
				DayContent dayContent = dayContentHashMap.get(i);
				if (dayContent.getLabel().getText().contains("Gevurah")) {
					botReply += i + "  ";
				}
			}
			break;
		case "TIFERET":
			botReply = "The days that include 'Tiferet' are: ";
			for (int i = 1; i < 50; i++) {
				DayContent dayContent = dayContentHashMap.get(i);
				if (dayContent.getLabel().getText().contains("Tiferet")) {
					botReply += i + "  ";
				}
			}
			break;
		case "NETZACH":
			botReply = "The days that include 'Netzach' are: ";
			for (int i = 1; i < 50; i++) {
				DayContent dayContent = dayContentHashMap.get(i);
				if (dayContent.getLabel().getText().contains("Netzach")) {
					botReply += i + "  ";
				}
			}
			break;
		case "HOD":
			botReply = "The days that include 'Hod' are: ";
			for (int i = 1; i < 50; i++) {
				DayContent dayContent = dayContentHashMap.get(i);
				if (dayContent.getLabel().getText().contains("Hod")) {
					botReply += i + "  ";
				}
			}
			break;
		case "YESOD":
			botReply = "The days that include 'Yesod' are: ";
			for (int i = 1; i < 50; i++) {
				DayContent dayContent = dayContentHashMap.get(i);
				if (dayContent.getLabel().getText().contains("Yesod")) {
					botReply += i + "  ";
				}
			}
			break;
		case "MALCHUT":
			botReply = "The days that include 'Malchut' are: ";
			for (int i = 1; i < 50; i++) {
				DayContent dayContent = dayContentHashMap.get(i);
				if (dayContent.getLabel().getText().contains("Malchut")) {
					botReply += i + "  ";
				}
			}
			break;
		default:
			botReply = "Please try again, I was unable to comprehend what you entered.";
			break;
		}
		if (user.contains("SEARCH")) {
			String userSearch = user.substring(user.indexOf("search") + 7).trim().toLowerCase();
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
		}
		return botReply;

	}// getDefaultResponse
}// HelpLayout