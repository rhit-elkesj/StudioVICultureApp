package Main;

import java.awt.*;
import javax.swing.*;

public class HomeScreen {

	private static final int SCREEN_WIDTH = 1520;
	private static final int SCREEN_HEIGHT = 820;
	private static final int SCALE_X = 180;
	private static final int SCALE_Y = 60;
	private static final int CENTER_POSITION = 50;
	private static final int INLET_GAP = 30;
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
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, CENTER_POSITION, 0)); // Centers all elements
		buttonPanel.setBackground(BACKGROUND_COLOUR);

		calendar = new JButton();
		calendar.setName("Start Counting"); // Set ButtonID
		calendar.addActionListener(new ButtonListener(calendar, frame)); // Add ActionListener
		calendar.setPreferredSize(new Dimension(SCALE_X, SCALE_Y)); // Set size
		String imagePath = "Main/ButtonImages/StartCounting.PNG"; // Accesses images from folder
		AddButtonImages.addImage(calendar, imagePath, SCALE_X, SCALE_Y);
		AddPressedImages.addPressed(calendar, imagePath, SCALE_X, SCALE_Y);
		calendar.setBorder(BorderFactory.createEmptyBorder()); // Ensures there is no border around Button

		about = new JButton();
		about.setName("About"); // Set ButtonID
		about.addActionListener(new ButtonListener(about, frame)); // AddActionListener
		about.setPreferredSize(new Dimension(SCALE_X, SCALE_Y)); // Set size
		String imagePath2 = "Main/ButtonImages/About.PNG"; // Accesses images from folder
		AddButtonImages.addImage(about, imagePath2, SCALE_X, SCALE_Y);
		AddPressedImages.addPressed(about, imagePath2, SCALE_X, SCALE_Y);
		about.setBorder(BorderFactory.createEmptyBorder()); // Ensures there is no border around Button

		buttonPanel.add(calendar);
		buttonPanel.add(about);

		c.gridx = 0; // Set x gap
		c.gridy = 1; // Set y gap
		c.anchor = GridBagConstraints.CENTER; // Set anchor
		c.fill = GridBagConstraints.NONE; // Does not adjust image when window is resized
		c.weightx = 0; // No extra gap
		c.insets = new Insets(INLET_GAP, 0, 0, 0); // Set gap between buttons

		homePanel.add(buttonPanel, c);
		frame.add(homePanel);
		frame.setVisible(true);
	}// HomeScreen
}// HomeScreen
