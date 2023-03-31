package Main;

import java.awt.*;
import javax.swing.*;

public class HomeScreen {

	private static final int SCREEN_WIDTH = 1520;
	private static final int SCREEN_HEIGHT = 820;
	private static final Color BACKGROUND_COLOUR = new Color(232, 244, 253);
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

		frame.setBackground(BACKGROUND_COLOUR);

		JPanel homePanel = new JPanel(new GridBagLayout());
		homePanel.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		homePanel.setBackground(BACKGROUND_COLOUR);

		ImageIcon icon = new ImageIcon("Main/ButtonImages/HomeTest1.PNG"); // Main image that displays on screen
		JLabel imageLabel = new JLabel(icon);
		GridBagConstraints c = new GridBagConstraints(); // Creating the design constraints of GridBagLayout
		c.insets = new Insets(0, 0, 0, 0); // No gaps

		homePanel.add(imageLabel, c);

		buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 0)); // Centers all elements
		buttonPanel.setBackground(BACKGROUND_COLOUR);

		calendar = new JButton();
		calendar.setName("Start Counting"); // Set ButtonID
		calendar.setPreferredSize(new Dimension(180, 60)); // Set size
		calendar.addActionListener(new ButtonListener(calendar, frame)); // Add ActionListener

		String imagePath = "Main/ButtonImages/StartCounting.PNG"; // Accesses images from folder
		ImageIcon calendarIcon = new ImageIcon(imagePath);
		Image calendarImage = calendarIcon.getImage();
		Image scaledImage = calendarImage.getScaledInstance(180, 60, java.awt.Image.SCALE_SMOOTH); // Scales image
		ImageIcon scaledCalendarIcon = new ImageIcon(scaledImage);
		calendar.setIcon(scaledCalendarIcon);

		String imagePath2 = "Main/ButtonImages/Week7.PNG"; // Accesses images from folder
		ImageIcon weekIcon = new ImageIcon(imagePath2);
		Image image = weekIcon.getImage();
		Image scaledWeekImage = image.getScaledInstance(180, 60, java.awt.Image.SCALE_SMOOTH); // Scales image
		ImageIcon scaledWeekIcon = new ImageIcon(scaledWeekImage);
		calendar.setPressedIcon(scaledWeekIcon);

		calendar.setBorder(BorderFactory.createEmptyBorder()); // Ensures there is no border around Button

		about = new JButton();
		about.setName("About"); // Set ButtonID
		about.setPreferredSize(new Dimension(180, 60)); // Set size
		about.addActionListener(new ButtonListener(about, frame)); // AddActionListener

		String imagePath3 = "Main/ButtonImages/About.PNG"; // Accesses images from folder
		ImageIcon aboutIcon = new ImageIcon(imagePath3);
		Image aboutImage = aboutIcon.getImage();
		Image scaledImage2 = aboutImage.getScaledInstance(180, 60, java.awt.Image.SCALE_SMOOTH); // Scales image
		ImageIcon scaledAboutIcon = new ImageIcon(scaledImage2);
		about.setIcon(scaledAboutIcon);
		about.setPressedIcon(scaledWeekIcon);
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
