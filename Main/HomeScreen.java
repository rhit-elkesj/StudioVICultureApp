package Main;

import java.awt.*;
import javax.swing.*;

public class HomeScreen {

	private static final int SCREEN_WIDTH = 1520;
	private static final int SCREEN_HEIGHT = 820;
	private JFrame frame;
	private JPanel buttonPanel;
	private JButton about;
	private JButton calendar;

	/**
	 * Class: HomeScreen
	 * 
	 * @author elkesj <br>
	 *         Purpose: Creates and displays all elements needed for the initial
	 *         screen when program is ran <br>
	 *         Restrictions: None
	 */
	public HomeScreen(JFrame mainFrame) {

		this.frame = mainFrame;

		frame.setBackground(Color.WHITE);

		JPanel homePanel = new JPanel(new GridBagLayout());
		homePanel.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		homePanel.setBackground(Color.WHITE);

		ImageIcon icon = new ImageIcon("Main/ButtonImages/HomeTest1.PNG"); // Main image that displays on screen
		JLabel imageLabel = new JLabel(icon);
		GridBagConstraints c = new GridBagConstraints(); // Creating the design constraints of GridBagLayout
		c.insets = new Insets(0, 0, 0, 0); // No gaps

		homePanel.add(imageLabel, c);

		buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 0)); // Centers all elements
		buttonPanel.setBackground(Color.WHITE);

		calendar = new JButton("Start Counting");
		calendar.setName("Start Counting"); // Set ButtonID
		calendar.setPreferredSize(new Dimension(200, 60)); // Set size
		calendar.addActionListener(new ButtonListener(calendar, frame)); // Add ActionListener
		calendar.setBorder(BorderFactory.createEmptyBorder()); // Ensures there is no border around Button

		about = new JButton("About");
		about.setName("About"); // Set ButtonID
		about.setPreferredSize(new Dimension(200, 60)); // Set size
		about.addActionListener(new ButtonListener(about, frame)); // AddActionListener
		about.setBorder(BorderFactory.createEmptyBorder()); // Ensures there is no border around Button

		buttonPanel.add(calendar);
		buttonPanel.add(about);

		c.gridx = 0; // Set x gap
		c.gridy = 1; // Set y gap
		c.anchor = GridBagConstraints.CENTER; // Set anchor
		c.fill = GridBagConstraints.NONE; // Does not adjust image when window is resized
		c.weightx = 0; // No extra gap
		c.insets = new Insets(30, 0, 0, 0); // Set gap between buttons

		homePanel.add(buttonPanel, c);
		frame.add(homePanel);
		frame.setVisible(true);
	}
}
