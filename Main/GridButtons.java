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
			gridButtons[i] = new JButton();
			gridButtons[i].addActionListener(new ButtonListener());
			gridButtons[i].setBorder(BorderFactory.createEmptyBorder());
			buttonPanel.add(gridButtons[i]);
			buttonPanel.setVisible(true);
			frame.setVisible(true);
		}

		// Day 1
		ImageIcon day1 = new ImageIcon("///C:/Users/elkesj/git/StudioVICultureApp/Main/ButtonImages/Day1.PNG");
		Image image1 = day1.getImage();
		Image scaledImage1 = image1.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay1 = new ImageIcon(scaledImage1);
		gridButtons[1].setIcon(scaledDay1);

		// Day 2
		ImageIcon day2 = new ImageIcon("///C:/Users/elkesj/git/StudioVICultureApp/Main/ButtonImages/Day2.PNG");
		Image image2 = day2.getImage();
		Image scaledImage2 = image2.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay2 = new ImageIcon(scaledImage2);
		gridButtons[2].setIcon(scaledDay2);

		// Day 3
		ImageIcon day3 = new ImageIcon("///C:/Users/elkesj/git/StudioVICultureApp/Main/ButtonImages/Day3.PNG");
		Image image3 = day3.getImage();
		Image scaledImage3 = image3.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay3 = new ImageIcon(scaledImage3);
		gridButtons[3].setIcon(scaledDay3);

		// Day 4
		ImageIcon day4 = new ImageIcon("///C:/Users/elkesj/git/StudioVICultureApp/Main/ButtonImages/Day4.PNG");
		Image image4 = day4.getImage();
		Image scaledImage4 = image4.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay4 = new ImageIcon(scaledImage4);
		gridButtons[4].setIcon(scaledDay4);

		// Day 5
		ImageIcon day5 = new ImageIcon("///C:/Users/elkesj/git/StudioVICultureApp/Main/ButtonImages/Day5.PNG");
		Image image5 = day5.getImage();
		Image scaledImage5 = image5.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay5 = new ImageIcon(scaledImage5);
		gridButtons[5].setIcon(scaledDay5);

		// Day 6
		ImageIcon day6 = new ImageIcon("///C:/Users/elkesj/git/StudioVICultureApp/Main/ButtonImages/Day6.PNG");
		Image image6 = day6.getImage();
		Image scaledImage6 = image6.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay6 = new ImageIcon(scaledImage6);
		gridButtons[6].setIcon(scaledDay6);

		// Day 7
		ImageIcon day7 = new ImageIcon("///C:/Users/elkesj/git/StudioVICultureApp/Main/ButtonImages/Day7.PNG");
		Image image7 = day7.getImage();
		Image scaledImage7 = image7.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay7 = new ImageIcon(scaledImage7);
		gridButtons[7].setIcon(scaledDay7);

	}
} // GridButtons
