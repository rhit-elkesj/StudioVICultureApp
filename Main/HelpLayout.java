package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
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

	private static final int SCREEN_WIDTH = 1520;
	private static final int SCREEN_HEIGHT = 820;
	private static final int CONSOLE_WIDTH = SCREEN_WIDTH / 2;
	private static final int CONSOLE_HEIGHT = SCREEN_HEIGHT - 26;
	private String botReply;
	private String userReply = "";
	private ArrayList<String> chatHistory = new ArrayList<>();
	private static final Color BACKGROUND_COLOUR = new Color(232, 244, 253);

	private JFrame frame;
	private JPanel mainPanel;
	private JTextArea helpConsole;
	private JScrollPane consolePane;

	public HelpLayout(JFrame mainFrame) {

		// Main Frame
		this.frame = mainFrame;
		frame.setBackground(BACKGROUND_COLOUR);
		frame.setVisible(true);

		// Main Panel
		mainPanel = new JPanel();
		mainPanel.setVisible(true);
		mainPanel.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		mainPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		mainPanel.setBackground(BACKGROUND_COLOUR);
		frame.add(mainPanel);

		// Console Pane
		consolePane = new JScrollPane(); // Pane will have scroll function if enough lines are used
		consolePane.setPreferredSize(new Dimension(CONSOLE_WIDTH, CONSOLE_HEIGHT));

		// Console
		helpConsole = new JTextArea(); // New TextArea where the user can freely type
		helpConsole.setWrapStyleWord(true);
		helpConsole.setLineWrap(true);
		helpConsole.setEditable(true);

		consolePane.setViewportView(helpConsole); // Makes it viewable
		mainPanel.add(consolePane);
		frame.pack();

		// KeyListener
		helpConsole.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					// Get the user's input from the new variable
					String input = userReply.trim().toUpperCase(); // Only saves the newest line input by the user

					botReply = getDefaultResponse(input);
					chatHistory.add(input);
					chatHistory.add(botReply);
					helpConsole.append("\n" + "Bot: " + botReply + "\n"); // Appending previous chat history and newest
																			// lines
					helpConsole.setCaretPosition(helpConsole.getDocument().getLength());
					helpConsole.setText(helpConsole.getText().trim()); // Remove gaps in console

					// Clear after adding to chatHistory (otherwise would append)
					userReply = "";
				} else {
					userReply += e.getKeyChar();
				}
			}// keyPressed
		});
	}// HelpLayout

	public String getDefaultResponse(String user) {

		switch (user) { // Switch cases
		case "HI":
			botReply = "Greetings!";
			break;
		case "HELP":
			botReply = "How can I assist you?";
			break;
		case "QUIT":
			botReply = "Ok. Goodbye.";
			break;
		case "":
			botReply = "Please enter what you need assistance with.";
			break;
		default:
			botReply = "Please try again, I was unable to comprehend what you entered.";
			break;
		}
		return botReply;

	}// getDefaultResponse
}// HelpLayout