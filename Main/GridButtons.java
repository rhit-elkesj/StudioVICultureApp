package Main;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Class: GridButtons
 * 
 * @author IsraelGroup <br>
 *         Purpose: Creates all the Buttons and adds them to the GridLayout <br>
 *         Restrictions: None
 */
public class GridButtons extends Main {

	// Instantiated Variables
	JFrame frame;
	JPanel buttonPanel;
	GridLayout gridButtonLayout;
	JButton[] gridButtons = new JButton[50];

	/**
	 * Ensures: The GridLayout of buttons is constructed and associated ImageIcons
	 * are added
	 *
	 * <br>
	 * Requires: The JFrame, JPanel, GridLayout, JButton[], and subsequent action
	 * components are created and displayed
	 */
	public GridButtons(JFrame mainFrame, JPanel mainButtonPanel, GridLayout mainGridButtons) throws IOException {

		this.frame = mainFrame;
		this.buttonPanel = mainButtonPanel;
		this.gridButtonLayout = mainGridButtons;

		// Uses For Loop to create Buttons and add to ButtonPanel
		for (int i = 1; i < gridButtons.length; i++) {
			gridButtons[i] = new JButton();
			gridButtons[i].setName("" + i); // Button name is set to its associated value
			gridButtons[i].addActionListener(new ButtonListener(gridButtons[i], frame)); // Creates and adds the
																							// ButtonListener to the
																							// Button
			gridButtons[i].setBorder(BorderFactory.createEmptyBorder()); // Ensures there is no border around Button
			buttonPanel.add(gridButtons[i]);
			buttonPanel.setVisible(true);
			frame.setVisible(true);
		}

		// Uses For Loop to add ImageIcons to the Button
		for (int i = 1; i <= 49; i++) {
			String imagePath = "Main/ButtonImages/Day" + i + ".PNG"; // Accesses images from folder
			ImageIcon dayIcon = new ImageIcon(imagePath);
			Image image = dayIcon.getImage();
			Image scaledImage = image.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH); // Scales image
			ImageIcon scaledDayIcon = new ImageIcon(scaledImage);
			gridButtons[i].setIcon(scaledDayIcon);
		}

		// Uses For Loop to add ImageIcons to the Button when Pressed (Week 1)
		for (int i = 1; i <= 7; i++) {
			String imagePath = "Main/ButtonImages/Week1.PNG"; // Accesses images from folder
			ImageIcon weekIcon = new ImageIcon(imagePath);
			Image image = weekIcon.getImage();
			Image scaledWeekImage = image.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH); // Scales image
			ImageIcon scaledWeekIcon = new ImageIcon(scaledWeekImage);
			gridButtons[i].setPressedIcon(scaledWeekIcon);
		}

		// Uses For Loop to add ImageIcons to the Button when Pressed (Week 2)
		for (int i = 8; i <= 14; i++) {
			String imagePath = "Main/ButtonImages/Week2.PNG"; // Accesses images from folder
			ImageIcon weekIcon = new ImageIcon(imagePath);
			Image image = weekIcon.getImage();
			Image scaledWeekImage = image.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH); // Scales image
			ImageIcon scaledWeekIcon = new ImageIcon(scaledWeekImage);
			gridButtons[i].setPressedIcon(scaledWeekIcon);
		}

		// Uses For Loop to add ImageIcons to the Button when Pressed (Week 3)
		for (int i = 15; i <= 21; i++) {
			String imagePath = "Main/ButtonImages/Week3.PNG"; // Accesses images from folder
			ImageIcon weekIcon = new ImageIcon(imagePath);
			Image image = weekIcon.getImage();
			Image scaledWeekImage = image.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH); // Scales image
			ImageIcon scaledWeekIcon = new ImageIcon(scaledWeekImage);
			gridButtons[i].setPressedIcon(scaledWeekIcon);
		}

		// Uses For Loop to add ImageIcons to the Button when Pressed (Week 4)
		for (int i = 22; i <= 28; i++) {
			String imagePath = "Main/ButtonImages/Week4.PNG"; // Accesses images from folder
			ImageIcon weekIcon = new ImageIcon(imagePath);
			Image image = weekIcon.getImage();
			Image scaledWeekImage = image.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH); // Scales image
			ImageIcon scaledWeekIcon = new ImageIcon(scaledWeekImage);
			gridButtons[i].setPressedIcon(scaledWeekIcon);
		}

		// Uses For Loop to add ImageIcons to the Button when Pressed (Week 5)
		for (int i = 29; i <= 35; i++) {
			String imagePath = "Main/ButtonImages/Week5.PNG"; // Accesses images from folder
			ImageIcon weekIcon = new ImageIcon(imagePath);
			Image image = weekIcon.getImage();
			Image scaledWeekImage = image.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH); // Scales image
			ImageIcon scaledWeekIcon = new ImageIcon(scaledWeekImage);
			gridButtons[i].setPressedIcon(scaledWeekIcon);
		}

		// Uses For Loop to add ImageIcons to the Button when Pressed (Week 6)
		for (int i = 36; i <= 42; i++) {
			String imagePath = "Main/ButtonImages/Week6.PNG"; // Accesses images from folder
			ImageIcon weekIcon = new ImageIcon(imagePath);
			Image image = weekIcon.getImage();
			Image scaledWeekImage = image.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH); // Scales image
			ImageIcon scaledWeekIcon = new ImageIcon(scaledWeekImage);
			gridButtons[i].setPressedIcon(scaledWeekIcon);
		}

		// Uses For Loop to add ImageIcons to the Button when Pressed (Week 7)
		for (int i = 43; i <= 49; i++) {
			String imagePath = "Main/ButtonImages/Week7.PNG"; // Accesses images from folder
			ImageIcon weekIcon = new ImageIcon(imagePath);
			Image image = weekIcon.getImage();
			Image scaledWeekImage = image.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH); // Scales image
			ImageIcon scaledWeekIcon = new ImageIcon(scaledWeekImage);
			gridButtons[i].setPressedIcon(scaledWeekIcon);
		}
	}

} // GridButtons
