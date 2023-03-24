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
			gridButtons[i].addActionListener(new ButtonListener()); // New ButtonListener for each Button
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
	}

} // GridButtons
