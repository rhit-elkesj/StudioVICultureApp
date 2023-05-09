package Main;

import java.awt.*;
import javax.swing.*;

/**
 * Class: HomeScreen
 * 
 * @author Richelle Elkes <br>
 *         Purpose: Creates and displays all elements needed for the initial
 *         screen when program is ran <br>
 *         Restrictions: None
 * @ReferencedClasses AddButtonImages, AddPressedImages,
 *                    ButtonListenerImplemented
 */
public class HomeScreen {

	// Instantiated Variables & Components
	private static final int SCREEN_WIDTH = 1520;
	private static final int SCREEN_HEIGHT = 820;
	private static final int SCALE_X = 180;
	private static final int SCALE_Y = 60;
	private static final int CENTER_POSITION = 50;
	private static final int INLET_GAP = 10;
	private static final int GRID_GAP_Y = 1;
	private static final Color BACKGROUND_COLOUR = new Color(232, 244, 253);
	private String selectedLanguage;
	private String buttonImagePath1;
	private String buttonImagePath2;
	private String buttonImagePath3;
	private JFrame frame;
	private JPanel homePanel;
	private JPanel buttonPanel;
	private JButton about;
	private JButton calendar;
	private JButton help;

	public HomeScreen(JFrame mainFrame, String selectedLanguage) {

		this.selectedLanguage = selectedLanguage;

		// Frame
		this.frame = mainFrame;
		frame.setBackground(BACKGROUND_COLOUR);

		// Creating the design constraints of GridBagLayout
		GridBagConstraints c = new GridBagConstraints();

		// Main image that displays on screen
		ImageIcon icon = new ImageIcon("Main/ButtonImages/HomeImage.PNG");
		JLabel imageLabel = new JLabel(icon);

		// HomePanel
		homePanel = new JPanel(new GridBagLayout());
		homePanel.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		homePanel.setBackground(BACKGROUND_COLOUR);
		homePanel.add(imageLabel, c);

		// Start Counting Button, added ButtonListenerImplemented, formatted Button
		calendar = new JButton();
		calendar.setName("Start Counting");
		calendar.addActionListener(new ButtonListenerImplemented(calendar, frame));
		calendar.setPreferredSize(new Dimension(SCALE_X, SCALE_Y));

		if (selectedLanguage.equals("Hebrew")) {
			buttonImagePath1 = "Main/ButtonImages/StartCountingHeb.PNG";
		} else {
			buttonImagePath1 = "Main/ButtonImages/StartCounting.PNG";
		}

		AddButtonImages.addImage(calendar, buttonImagePath1, SCALE_X, SCALE_Y);
		String pressedImagePath = "Main/ButtonImages/Week7.PNG";
		AddPressedImages.addPressed(calendar, pressedImagePath, SCALE_X, SCALE_Y);
		calendar.setBorder(BorderFactory.createEmptyBorder());

		// About Button, added ButtonListenerImplemented, formatted Button
		about = new JButton();
		about.setName("About"); // Set ButtonID
		about.addActionListener(new ButtonListenerImplemented(about, frame));
		about.setPreferredSize(new Dimension(SCALE_X, SCALE_Y));

		if (selectedLanguage.equals("Hebrew")) {
			buttonImagePath2 = "Main/ButtonImages/AboutHeb.PNG";
		} else {
			buttonImagePath2 = "Main/ButtonImages/About.PNG";
		}

		AddButtonImages.addImage(about, buttonImagePath2, SCALE_X, SCALE_Y);
		AddPressedImages.addPressed(about, pressedImagePath, SCALE_X, SCALE_Y);
		about.setBorder(BorderFactory.createEmptyBorder());

		// Help Button, added ButtonListenerImplemented, formatted Button
		help = new JButton();
		help.setName("Help"); // Set ButtonID
		help.addActionListener(new ButtonListenerImplemented(help, frame));
		help.setPreferredSize(new Dimension(SCALE_X, SCALE_Y));

		if (selectedLanguage.equals("Hebrew")) {
			buttonImagePath3 = "Main/ButtonImages/HelpHeb.PNG";
		} else {
			buttonImagePath3 = "Main/ButtonImages/Help.PNG";
		}

		AddButtonImages.addImage(help, buttonImagePath3, SCALE_X, SCALE_Y);
		AddPressedImages.addPressed(help, pressedImagePath, SCALE_X, SCALE_Y);
		help.setBorder(BorderFactory.createEmptyBorder());

		// ButtonPanel, centers all Components
		buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, CENTER_POSITION, 0));
		buttonPanel.setBackground(BACKGROUND_COLOUR);
		buttonPanel.add(calendar);
		buttonPanel.add(about);
		buttonPanel.add(help);

		// Positioning and Constraints
		c.gridx = 0;
		c.gridy = GRID_GAP_Y;
		c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.NONE;
		c.weightx = 0;
		c.insets = new Insets(INLET_GAP, 0, 0, 0);

		// Adding Everything
		homePanel.add(buttonPanel, c);
		frame.add(homePanel);
		frame.setVisible(true);

	}// HomeScreen
}// HomeScreen
