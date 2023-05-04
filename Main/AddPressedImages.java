package Main;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Class: AddPressedImages
 * 
 * @author Richelle Elkes <br>
 *         Purpose: Abstract class that will set the Image when pressed to a
 *         specified Button <br>
 *         Restrictions: None
 */
public abstract class AddPressedImages {

	public AddPressedImages() {
		// Does nothing
	}

	public static void addPressed(JButton currentButton, String filePath, int x, int y) {
		
		// Accesses images from folder
		String imagePath = filePath;

		ImageIcon buttonImage = new ImageIcon(imagePath);
		Image originalImage = buttonImage.getImage();

		// Scales Image to specified X and Y value
		Image scaledButtonImage = originalImage.getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledButtonIcon = new ImageIcon(scaledButtonImage);

		// Sets Button to new Icon
		currentButton.setPressedIcon(scaledButtonIcon); 

	}// addImage
}// AddButtonImages
