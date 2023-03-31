package Main;

import java.awt.*;
import javax.swing.*;

/**
 * Class: HomeScreen
 * 
 * @author elkesj <br>
 *         Purpose: Creates and displays all elements needed for the initial
 *         screen when program is ran <br>
 *         Restrictions: None
 */
public class HomeScreen {

	private static final int SCREEN_WIDTH = 1520;
	private static final int SCREEN_HEIGHT = 820;
	private static final int SCALE_X = 180;
	private static final int SCALE_Y = 60;
	private static final int CENTER_POSITION = 50;
	private static final int INLET_GAP = 10;
	private static final Color BACKGROUND_COLOUR = new Color(232, 244, 253);

	private JFrame frame;
	private JPanel homePanel;
	private JPanel buttonPanel;
	private JButton about;
	private JButton calendar;

	public HomeScreen(JFrame mainFrame) {

		// Frame
		this.frame = mainFrame;
		frame.setBackground(BACKGROUND_COLOUR);

		// Graphics
		GridBagConstraints c = new GridBagConstraints(); // Creating the design constraints of GridBagLayout
		ImageIcon icon = new ImageIcon("Main/ButtonImages/HomeTest1.PNG"); // Main image that displays on screen
		JLabel imageLabel = new JLabel(icon);

		// HomePanel
		homePanel = new JPanel(new GridBagLayout());
		homePanel.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		homePanel.setBackground(BACKGROUND_COLOUR);
		homePanel.add(imageLabel, c);

		// Start Counting
		calendar = new JButton();
		calendar.setName("Start Counting"); // Set ButtonID
		calendar.addActionListener(new ButtonListenerImplemented(calendar, frame)); // Add ActionListener
		calendar.setPreferredSize(new Dimension(SCALE_X, SCALE_Y)); // Set size
		String buttonImagePath1 = "Main/ButtonImages/StartCounting.PNG"; // Accesses images from folder
		AddButtonImages.addImage(calendar, buttonImagePath1, SCALE_X, SCALE_Y);
		String pressedImagePath = "Main/ButtonImages/Week7.PNG";
		AddPressedImages.addPressed(calendar, pressedImagePath, SCALE_X, SCALE_Y);
		calendar.setBorder(BorderFactory.createEmptyBorder()); // Ensures there is no border around Button

		// About
		about = new JButton();
		about.setName("About"); // Set ButtonID
		about.addActionListener(new ButtonListenerImplemented(about, frame)); // AddActionListener
		about.setPreferredSize(new Dimension(SCALE_X, SCALE_Y)); // Set size
		String buttonImagePath2 = "Main/ButtonImages/About.PNG"; // Accesses images from folder
		AddButtonImages.addImage(about, buttonImagePath2, SCALE_X, SCALE_Y);
		AddPressedImages.addPressed(about, pressedImagePath, SCALE_X, SCALE_Y);
		about.setBorder(BorderFactory.createEmptyBorder()); // Ensures there is no border around Button

		// ButtonPanel
		buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, CENTER_POSITION, 0)); // Centers all elements
		buttonPanel.setBackground(BACKGROUND_COLOUR);
		buttonPanel.add(calendar);
		buttonPanel.add(about);

		// Positioning and Constraints
		c.gridx = 0; // Set x gap
		c.gridy = 1; // Set y gap
		c.anchor = GridBagConstraints.CENTER; // Set anchor
		c.fill = GridBagConstraints.NONE; // Does not adjust image when window is resized
		c.weightx = 0; // No extra gap
		c.insets = new Insets(INLET_GAP, 0, 0, 0); // Set gap between buttons

		// Adding Everything
		homePanel.add(buttonPanel, c);
		frame.add(homePanel);
		frame.setVisible(true);

	}// HomeScreen
}// HomeScreen
