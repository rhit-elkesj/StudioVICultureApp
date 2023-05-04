package Main;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Class: AddButtonImages
 * 
 * @author Richelle Elkes <br>
 *         Purpose: Abstract class that will add an Image to a specified Button <br>
 *         Restrictions: None
 */
public abstract class AddButtonImages {

	public AddButtonImages() {
		// Does nothing
	}

	public static void addImage(JButton currentButton, String filePath, int x, int y) {

		// Accesses images from folder
		String imagePath = filePath;

		ImageIcon buttonImage = new ImageIcon(imagePath);
		Image originalImage = buttonImage.getImage();

		// Scales Image
		Image scaledButtonImage = originalImage.getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledButtonIcon = new ImageIcon(scaledButtonImage);

		// Sets Button to new Icon
		currentButton.setIcon(scaledButtonIcon);

	}// addImage
}// AddButtonImages
