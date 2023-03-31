package Main;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Class: AddButtonImages
 * 
 * @author Richelle Elkes <br>
 *         Purpose: Abstract class that will add an Image to a specified Button
 *         <br>
 *         Restrictions: None
 */
public abstract class AddButtonImages {

	public AddButtonImages() {
	}

	public static void addImage(JButton currentButton, String filePath, int x, int y) {

		String imagePath = filePath; // Accesses images from folder

		ImageIcon buttonImage = new ImageIcon(imagePath);
		Image originalImage = buttonImage.getImage();

		Image scaledButtonImage = originalImage.getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH); // Scales
																										// image
		ImageIcon scaledButtonIcon = new ImageIcon(scaledButtonImage);

		currentButton.setIcon(scaledButtonIcon); // Sets Button to new Icon

	}// addImage
}// AddButtonImages
