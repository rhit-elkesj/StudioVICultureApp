package Main;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Class: AddPressedImages
 * 
 * @author elkesj <br>
 *         Purpose: Abstract class that will set the Image when pressed on a specified Button <br>
 *         Restrictions: None
 */
public abstract class AddPressedImages {

	public AddPressedImages() {
	}

	public static void addPressed(JButton currentButton, String filePath, int x, int y) {

		String imagePath = filePath; // Accesses images from folder

		ImageIcon buttonImage = new ImageIcon(imagePath);
		Image originalImage = buttonImage.getImage();

		Image scaledButtonImage = originalImage.getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH); // Scales
																											// image

		ImageIcon scaledButtonIcon = new ImageIcon(scaledButtonImage);

		currentButton.setPressedIcon(scaledButtonIcon); // Sets Button to new Icon

	}// addImage
}// AddButtonImages
