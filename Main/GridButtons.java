package Main;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
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
	 * Ensures: The GridLayout of buttons is constructed
	 *
	 * <br>
	 * Requires: The JFrame, JPanel, GridLayout, JButton[], and subsequent action
	 * components are created and displayed
	 */
	public GridButtons(JFrame mainFrame, JPanel mainButtonPanel, GridLayout mainGridButtons) throws IOException {

		this.frame = mainFrame;
		this.buttonPanel = mainButtonPanel;
		this.gridButtonLayout = mainGridButtons;

		for (int i = 1; i < gridButtons.length; i++) {
			gridButtons[i] = new JButton(i + "");
			gridButtons[i].addActionListener(new ButtonListener());
			gridButtons[i].setBorder(BorderFactory.createEmptyBorder());
			buttonPanel.add(gridButtons[i]);
			buttonPanel.setVisible(true);
			frame.setVisible(true);
		}

		ImageIcon icon1 = new ImageIcon("///C:/Users/elkesj/git/StudioVICultureApp/Main/ButtonImages/Week1.PNG");
		Image image1 = icon1.getImage();
		Image scaledImage1 = image1.getScaledInstance(228, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledIcon1 = new ImageIcon(scaledImage1);

		gridButtons[1].setIcon(scaledIcon1);
		gridButtons[1].setIcon(scaledIcon1);
		gridButtons[2].setIcon(scaledIcon1);
		gridButtons[3].setIcon(scaledIcon1);
		gridButtons[4].setIcon(scaledIcon1);
		gridButtons[5].setIcon(scaledIcon1);
		gridButtons[6].setIcon(scaledIcon1);
		gridButtons[7].setIcon(scaledIcon1);

		ImageIcon icon2 = new ImageIcon("///C:/Users/elkesj/git/StudioVICultureApp/Main/ButtonImages/Week2.PNG");
		Image image2 = icon2.getImage();
		Image scaledImage2 = image2.getScaledInstance(228, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledIcon2 = new ImageIcon(scaledImage2);

		gridButtons[8].setIcon(scaledIcon2);
		gridButtons[9].setIcon(scaledIcon2);
		gridButtons[10].setIcon(scaledIcon2);
		gridButtons[11].setIcon(scaledIcon2);
		gridButtons[12].setIcon(scaledIcon2);
		gridButtons[13].setIcon(scaledIcon2);
		gridButtons[14].setIcon(scaledIcon2);

		ImageIcon icon3 = new ImageIcon("///C:/Users/elkesj/git/StudioVICultureApp/Main/ButtonImages/Week3.PNG");
		Image image3 = icon3.getImage();
		Image scaledImage3 = image3.getScaledInstance(228, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledIcon3 = new ImageIcon(scaledImage3);

		gridButtons[15].setIcon(scaledIcon3);
		gridButtons[16].setIcon(scaledIcon3);
		gridButtons[17].setIcon(scaledIcon3);
		gridButtons[18].setIcon(scaledIcon3);
		gridButtons[19].setIcon(scaledIcon3);
		gridButtons[20].setIcon(scaledIcon3);
		gridButtons[21].setIcon(scaledIcon3);

		ImageIcon icon4 = new ImageIcon("///C:/Users/elkesj/git/StudioVICultureApp/Main/ButtonImages/Week4.PNG");
		Image image4 = icon4.getImage();
		Image scaledImage4 = image4.getScaledInstance(228, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledIcon4 = new ImageIcon(scaledImage4);

		gridButtons[22].setIcon(scaledIcon4);
		gridButtons[23].setIcon(scaledIcon4);
		gridButtons[24].setIcon(scaledIcon4);
		gridButtons[25].setIcon(scaledIcon4);
		gridButtons[26].setIcon(scaledIcon4);
		gridButtons[27].setIcon(scaledIcon4);
		gridButtons[28].setIcon(scaledIcon4);

		ImageIcon icon5 = new ImageIcon("///C:/Users/elkesj/git/StudioVICultureApp/Main/ButtonImages/Week5.PNG");
		Image image5 = icon5.getImage();
		Image scaledImage5 = image5.getScaledInstance(228, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledIcon5 = new ImageIcon(scaledImage5);

		gridButtons[29].setIcon(scaledIcon5);
		gridButtons[30].setIcon(scaledIcon5);
		gridButtons[31].setIcon(scaledIcon5);
		gridButtons[32].setIcon(scaledIcon5);
		gridButtons[33].setIcon(scaledIcon5);
		gridButtons[34].setIcon(scaledIcon5);
		gridButtons[35].setIcon(scaledIcon5);

		ImageIcon icon6 = new ImageIcon("///C:/Users/elkesj/git/StudioVICultureApp/Main/ButtonImages/Week6.PNG");
		Image image6 = icon6.getImage();
		Image scaledImage6 = image6.getScaledInstance(228, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledIcon6 = new ImageIcon(scaledImage6);

		gridButtons[36].setIcon(scaledIcon6);
		gridButtons[37].setIcon(scaledIcon6);
		gridButtons[38].setIcon(scaledIcon6);
		gridButtons[39].setIcon(scaledIcon6);
		gridButtons[40].setIcon(scaledIcon6);
		gridButtons[41].setIcon(scaledIcon6);
		gridButtons[42].setIcon(scaledIcon6);

		ImageIcon icon7 = new ImageIcon("///C:/Users/elkesj/git/StudioVICultureApp/Main/ButtonImages/Week7.PNG");
		Image image7 = icon7.getImage();
		Image scaledImage7 = image7.getScaledInstance(228, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledIcon7 = new ImageIcon(scaledImage7);

		gridButtons[43].setIcon(scaledIcon7);
		gridButtons[44].setIcon(scaledIcon7);
		gridButtons[45].setIcon(scaledIcon7);
		gridButtons[46].setIcon(scaledIcon7);
		gridButtons[47].setIcon(scaledIcon7);
		gridButtons[48].setIcon(scaledIcon7);
		gridButtons[49].setIcon(scaledIcon7);
	}
} // GridButtons
