package Main;

import java.awt.Color;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Class: GridButtons
 * 
 * @author Richelle Elkes <br>
 *         Purpose: Creates all the Buttons and adds them to the GridLayout <br>
 *         Restrictions: None
 */
public class GridButtons {

	// Instantiated Variables
	private static final int IMAGE_SCALE_X = 214;
	private static final int IMAGE_SCALE_Y = 108;
	private Color BACKGROUND_COLOUR = Color.BLACK;

	private JFrame frame;
	private JPanel buttonPanel;
	private JButton[] gridButtons = new JButton[50];

	/**
	 * Ensures: The GridButtons is a grid of buttons that constructs the 49 buttons
	 * and the associated ImageIcons (added using inheritance)
	 *
	 * <br>
	 * Requires: The JFrame, JPanel, GridLayout, JButton[], and subsequent action
	 * components are created and displayed
	 */
	public GridButtons(JFrame mainFrame, JPanel mainButtonPanel) throws IOException {

		this.frame = mainFrame;
		this.buttonPanel = mainButtonPanel;

		// Uses For Loop to create Buttons and add to ButtonPanel
		for (int i = 1; i < gridButtons.length; i++) {
			gridButtons[i] = new JButton();
			gridButtons[i].setName("" + i); // Button name is set to its associated value
			gridButtons[i].addActionListener(new ButtonListenerImplemented(gridButtons[i], frame)); // Creates and adds
																									// ButtonListener
			gridButtons[i].setBorder(BorderFactory.createEmptyBorder()); // Ensures there is no border around Button
			buttonPanel.add(gridButtons[i]);
			buttonPanel.setBackground(BACKGROUND_COLOUR);
			frame.setBackground(BACKGROUND_COLOUR);
			buttonPanel.setVisible(true);
			frame.setVisible(true);
		}

		// Uses For Loop to add ImageIcons to the Button
		for (int i = 1; i <= 49; i++) {
			String imagePath = "Main/ButtonImages/Day" + i + ".PNG"; // Accesses images from folder
			AddButtonImages.addImage(gridButtons[i], imagePath, IMAGE_SCALE_X, IMAGE_SCALE_Y); // Uses Abstract Class to
																								// add ButtonImage
		}

		// Uses For Loop to add ImageIcons to the Button when Pressed (Week 1)
		for (int i = 1; i <= 7; i++) {
			String imagePath = "Main/ButtonImages/Week1.PNG"; // Accesses images from folder
			AddPressedImages.addPressed(gridButtons[i], imagePath, IMAGE_SCALE_X, IMAGE_SCALE_Y); // Uses Abstract Class
																									// to set
																									// PressedImage
		}

		// Uses For Loop to add ImageIcons to the Button when Pressed (Week 2)
		for (int i = 8; i <= 14; i++) {
			String imagePath = "Main/ButtonImages/Week2.PNG"; // Accesses images from folder
			AddPressedImages.addPressed(gridButtons[i], imagePath, IMAGE_SCALE_X, IMAGE_SCALE_Y); // Uses Abstract Class
																									// to set
																									// PressedImage
		}

		// Uses For Loop to add ImageIcons to the Button when Pressed (Week 3)
		for (int i = 15; i <= 21; i++) {
			String imagePath = "Main/ButtonImages/Week3.PNG"; // Accesses images from folder
			AddPressedImages.addPressed(gridButtons[i], imagePath, IMAGE_SCALE_X, IMAGE_SCALE_Y); // Uses Abstract Class
																									// to set
																									// PressedImage
		}

		// Uses For Loop to add ImageIcons to the Button when Pressed (Week 4)
		for (int i = 22; i <= 28; i++) {
			String imagePath = "Main/ButtonImages/Week4.PNG"; // Accesses images from folder
			AddPressedImages.addPressed(gridButtons[i], imagePath, IMAGE_SCALE_X, IMAGE_SCALE_Y); // Uses Abstract Class
																									// to set
																									// PressedImage
		}

		// Uses For Loop to add ImageIcons to the Button when Pressed (Week 5)
		for (int i = 29; i <= 35; i++) {
			String imagePath = "Main/ButtonImages/Week5.PNG"; // Accesses images from folder
			AddPressedImages.addPressed(gridButtons[i], imagePath, IMAGE_SCALE_X, IMAGE_SCALE_Y); // Uses Abstract Class
																									// to set
																									// PressedImage
		}

		// Uses For Loop to add ImageIcons to the Button when Pressed (Week 6)
		for (int i = 36; i <= 42; i++) {
			String imagePath = "Main/ButtonImages/Week6.PNG"; // Accesses images from folder
			AddPressedImages.addPressed(gridButtons[i], imagePath, IMAGE_SCALE_X, IMAGE_SCALE_Y); // Uses Abstract Class
																									// to set
																									// PressedImage
		}

		// Uses For Loop to add ImageIcons to the Button when Pressed (Week 7)
		for (int i = 43; i <= 49; i++) {
			String imagePath = "Main/ButtonImages/Week7.PNG"; // Accesses images from folder
			AddPressedImages.addPressed(gridButtons[i], imagePath, IMAGE_SCALE_X, IMAGE_SCALE_Y); // Uses Abstract Class
																									// to set
																									// PressedImage
		}

	}// GridButtons
}// GridButtons
