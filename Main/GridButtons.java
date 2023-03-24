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
		ImageIcon day1 = new ImageIcon("Main/ButtonImages/Day1.PNG");
		Image image1 = day1.getImage();
		Image scaledImage1 = image1.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay1 = new ImageIcon(scaledImage1);
		gridButtons[1].setIcon(scaledDay1);

		// Day 2
		ImageIcon day2 = new ImageIcon("Main/ButtonImages/Day2.PNG");
		Image image2 = day2.getImage();
		Image scaledImage2 = image2.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay2 = new ImageIcon(scaledImage2);
		gridButtons[2].setIcon(scaledDay2);

		// Day 3
		ImageIcon day3 = new ImageIcon("Main/ButtonImages/Day3.PNG");
		Image image3 = day3.getImage();
		Image scaledImage3 = image3.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay3 = new ImageIcon(scaledImage3);
		gridButtons[3].setIcon(scaledDay3);

		// Day 4
		ImageIcon day4 = new ImageIcon("Main/ButtonImages/Day4.PNG");
		Image image4 = day4.getImage();
		Image scaledImage4 = image4.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay4 = new ImageIcon(scaledImage4);
		gridButtons[4].setIcon(scaledDay4);

		// Day 5
		ImageIcon day5 = new ImageIcon("Main/ButtonImages/Day5.PNG");
		Image image5 = day5.getImage();
		Image scaledImage5 = image5.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay5 = new ImageIcon(scaledImage5);
		gridButtons[5].setIcon(scaledDay5);

		// Day 6
		ImageIcon day6 = new ImageIcon("Main/ButtonImages/Day6.PNG");
		Image image6 = day6.getImage();
		Image scaledImage6 = image6.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay6 = new ImageIcon(scaledImage6);
		gridButtons[6].setIcon(scaledDay6);

		// Day 7
		ImageIcon day7 = new ImageIcon("Main/ButtonImages/Day7.PNG");
		Image image7 = day7.getImage();
		Image scaledImage7 = image7.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay7 = new ImageIcon(scaledImage7);
		gridButtons[7].setIcon(scaledDay7);

		// Day 8
		ImageIcon day8 = new ImageIcon("Main/ButtonImages/Day8.PNG");
		Image image8 = day8.getImage();
		Image scaledImage8 = image8.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay8 = new ImageIcon(scaledImage8);
		gridButtons[8].setIcon(scaledDay8);

		// Day 9
		ImageIcon day9 = new ImageIcon("Main/ButtonImages/Day9.PNG");
		Image image9 = day9.getImage();
		Image scaledImage9 = image9.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay9 = new ImageIcon(scaledImage9);
		gridButtons[9].setIcon(scaledDay9);

		// Day 10
		ImageIcon day10 = new ImageIcon("Main/ButtonImages/Day10.PNG");
		Image image10 = day10.getImage();
		Image scaledImage10 = image10.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay10 = new ImageIcon(scaledImage10);
		gridButtons[10].setIcon(scaledDay10);

		// Day 11
		ImageIcon day11 = new ImageIcon("Main/ButtonImages/Day11.PNG");
		Image image11 = day11.getImage();
		Image scaledImage11 = image11.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay11 = new ImageIcon(scaledImage11);
		gridButtons[11].setIcon(scaledDay11);

		// Day 12
		ImageIcon day12 = new ImageIcon("Main/ButtonImages/Day12.PNG");
		Image image12 = day12.getImage();
		Image scaledImage12 = image12.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay12 = new ImageIcon(scaledImage12);
		gridButtons[12].setIcon(scaledDay12);

		// Day 13
		ImageIcon day13 = new ImageIcon("Main/ButtonImages/Day13.PNG");
		Image image13 = day13.getImage();
		Image scaledImage13 = image13.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay13 = new ImageIcon(scaledImage13);
		gridButtons[13].setIcon(scaledDay13);

		// Day 14
		ImageIcon day14 = new ImageIcon("Main/ButtonImages/Day14.PNG");
		Image image14 = day14.getImage();
		Image scaledImage14 = image14.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay14 = new ImageIcon(scaledImage14);
		gridButtons[14].setIcon(scaledDay14);

		// Day 15
		ImageIcon day15 = new ImageIcon("Main/ButtonImages/Day15.PNG");
		Image image15 = day15.getImage();
		Image scaledImage15 = image15.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay15 = new ImageIcon(scaledImage15);
		gridButtons[15].setIcon(scaledDay15);

		// Day 16
		ImageIcon day16 = new ImageIcon("Main/ButtonImages/Day16.PNG");
		Image image16 = day16.getImage();
		Image scaledImage16 = image16.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay16 = new ImageIcon(scaledImage16);
		gridButtons[16].setIcon(scaledDay16);

		// Day 17
		ImageIcon day17 = new ImageIcon("Main/ButtonImages/Day17.PNG");
		Image image17 = day17.getImage();
		Image scaledImage17 = image17.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay17 = new ImageIcon(scaledImage17);
		gridButtons[17].setIcon(scaledDay17);

		// Day 18
		ImageIcon day18 = new ImageIcon("Main/ButtonImages/Day18.PNG");
		Image image18 = day18.getImage();
		Image scaledImage18 = image18.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay18 = new ImageIcon(scaledImage18);
		gridButtons[18].setIcon(scaledDay18);

		// Day 19
		ImageIcon day19 = new ImageIcon("Main/ButtonImages/Day19.PNG");
		Image image19 = day19.getImage();
		Image scaledImage19 = image19.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay19 = new ImageIcon(scaledImage19);
		gridButtons[19].setIcon(scaledDay19);

		// Day 20
		ImageIcon day20 = new ImageIcon("Main/ButtonImages/Day20.PNG");
		Image image20 = day20.getImage();
		Image scaledImage20 = image20.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay20 = new ImageIcon(scaledImage20);
		gridButtons[20].setIcon(scaledDay20);

		// Day 21
		ImageIcon day21 = new ImageIcon("Main/ButtonImages/Day21.PNG");
		Image image21 = day21.getImage();
		Image scaledImage21 = image21.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay21 = new ImageIcon(scaledImage21);
		gridButtons[21].setIcon(scaledDay21);

		// Day 22
		ImageIcon day22 = new ImageIcon("Main/ButtonImages/Day22.PNG");
		Image image22 = day22.getImage();
		Image scaledImage22 = image22.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay22 = new ImageIcon(scaledImage22);
		gridButtons[22].setIcon(scaledDay22);

		// Day 23
		ImageIcon day23 = new ImageIcon("Main/ButtonImages/Day23.PNG");
		Image image23 = day23.getImage();
		Image scaledImage23 = image23.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay23 = new ImageIcon(scaledImage23);
		gridButtons[23].setIcon(scaledDay23);

		// Day 24
		ImageIcon day24 = new ImageIcon("Main/ButtonImages/Day24.PNG");
		Image image24 = day24.getImage();
		Image scaledImage24 = image24.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay24 = new ImageIcon(scaledImage24);
		gridButtons[24].setIcon(scaledDay24);

		// Day 25
		ImageIcon day25 = new ImageIcon("Main/ButtonImages/Day25.PNG");
		Image image25 = day25.getImage();
		Image scaledImage25 = image25.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay25 = new ImageIcon(scaledImage25);
		gridButtons[25].setIcon(scaledDay25);

		// Day 26
		ImageIcon day26 = new ImageIcon("Main/ButtonImages/Day26.PNG");
		Image image26 = day26.getImage();
		Image scaledImage26 = image26.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay26 = new ImageIcon(scaledImage26);
		gridButtons[26].setIcon(scaledDay26);

		// Day 27
		ImageIcon day27 = new ImageIcon("Main/ButtonImages/Day27.PNG");
		Image image27 = day27.getImage();
		Image scaledImage27 = image27.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay27 = new ImageIcon(scaledImage27);
		gridButtons[27].setIcon(scaledDay27);

		// Day 28
		ImageIcon day28 = new ImageIcon("Main/ButtonImages/Day28.PNG");
		Image image28 = day28.getImage();
		Image scaledImage28 = image28.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay28 = new ImageIcon(scaledImage28);
		gridButtons[28].setIcon(scaledDay28);

		// Day 29
		ImageIcon day29 = new ImageIcon("Main/ButtonImages/Day29.PNG");
		Image image29 = day29.getImage();
		Image scaledImage29 = image29.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay29 = new ImageIcon(scaledImage29);
		gridButtons[29].setIcon(scaledDay29);

		// Day 30
		ImageIcon day30 = new ImageIcon("Main/ButtonImages/Day30.PNG");
		Image image30 = day30.getImage();
		Image scaledImage30 = image30.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay30 = new ImageIcon(scaledImage30);
		gridButtons[30].setIcon(scaledDay30);

		// Day 31
		ImageIcon day31 = new ImageIcon("Main/ButtonImages/Day31.PNG");
		Image image31 = day31.getImage();
		Image scaledImage31 = image31.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay31 = new ImageIcon(scaledImage31);
		gridButtons[31].setIcon(scaledDay31);

		// Day 32
		ImageIcon day32 = new ImageIcon("Main/ButtonImages/Day32.PNG");
		Image image32 = day32.getImage();
		Image scaledImage32 = image32.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay32 = new ImageIcon(scaledImage32);
		gridButtons[32].setIcon(scaledDay32);

		// Day 33
		ImageIcon day33 = new ImageIcon("Main/ButtonImages/Day33.PNG");
		Image image33 = day33.getImage();
		Image scaledImage33 = image33.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay33 = new ImageIcon(scaledImage33);
		gridButtons[33].setIcon(scaledDay33);

		// Day 34
		ImageIcon day34 = new ImageIcon("Main/ButtonImages/Day34.PNG");
		Image image34 = day34.getImage();
		Image scaledImage34 = image34.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay34 = new ImageIcon(scaledImage34);
		gridButtons[34].setIcon(scaledDay34);

		// Day 35
		ImageIcon day35 = new ImageIcon("Main/ButtonImages/Day35.PNG");
		Image image35 = day35.getImage();
		Image scaledImage35 = image35.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay35 = new ImageIcon(scaledImage35);
		gridButtons[35].setIcon(scaledDay35);

		// Day 36
		ImageIcon day36 = new ImageIcon("Main/ButtonImages/Day36.PNG");
		Image image36 = day36.getImage();
		Image scaledImage36 = image36.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay36 = new ImageIcon(scaledImage36);
		gridButtons[36].setIcon(scaledDay36);

		// Day 37
		ImageIcon day37 = new ImageIcon("Main/ButtonImages/Day37.PNG");
		Image image37 = day37.getImage();
		Image scaledImage37 = image37.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay37 = new ImageIcon(scaledImage37);
		gridButtons[37].setIcon(scaledDay37);

		// Day 38
		ImageIcon day38 = new ImageIcon("Main/ButtonImages/Day38.PNG");
		Image image38 = day38.getImage();
		Image scaledImage38 = image38.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay38 = new ImageIcon(scaledImage38);
		gridButtons[38].setIcon(scaledDay38);

		// Day 39
		ImageIcon day39 = new ImageIcon("Main/ButtonImages/Day39.PNG");
		Image image39 = day39.getImage();
		Image scaledImage39 = image39.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay39 = new ImageIcon(scaledImage39);
		gridButtons[39].setIcon(scaledDay39);

		// Day 40
		ImageIcon day40 = new ImageIcon("Main/ButtonImages/Day40.PNG");
		Image image40 = day40.getImage();
		Image scaledImage40 = image40.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay40 = new ImageIcon(scaledImage40);
		gridButtons[40].setIcon(scaledDay40);

		// Day 41
		ImageIcon day41 = new ImageIcon("Main/ButtonImages/Day41.PNG");
		Image image41 = day41.getImage();
		Image scaledImage41 = image41.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay41 = new ImageIcon(scaledImage41);
		gridButtons[41].setIcon(scaledDay41);

		// Day 42
		ImageIcon day42 = new ImageIcon("Main/ButtonImages/Day42.PNG");
		Image image42 = day42.getImage();
		Image scaledImage42 = image42.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay42 = new ImageIcon(scaledImage42);
		gridButtons[42].setIcon(scaledDay42);

		// Day 43
		ImageIcon day43 = new ImageIcon("Main/ButtonImages/Day43.PNG");
		Image image43 = day43.getImage();
		Image scaledImage43 = image43.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay43 = new ImageIcon(scaledImage43);
		gridButtons[43].setIcon(scaledDay43);

		// Day 44
		ImageIcon day44 = new ImageIcon("Main/ButtonImages/Day44.PNG");
		Image image44 = day44.getImage();
		Image scaledImage44 = image44.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay44 = new ImageIcon(scaledImage44);
		gridButtons[44].setIcon(scaledDay44);

		// Day 45
		ImageIcon day45 = new ImageIcon("Main/ButtonImages/Day45.PNG");
		Image image45 = day45.getImage();
		Image scaledImage45 = image45.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay45 = new ImageIcon(scaledImage45);
		gridButtons[45].setIcon(scaledDay45);

		// Day 46
		ImageIcon day46 = new ImageIcon("Main/ButtonImages/Day46.PNG");
		Image image46 = day46.getImage();
		Image scaledImage46 = image46.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay46 = new ImageIcon(scaledImage46);
		gridButtons[46].setIcon(scaledDay46);

		// Day 47
		ImageIcon day47 = new ImageIcon("Main/ButtonImages/Day47.PNG");
		Image image47 = day47.getImage();
		Image scaledImage47 = image47.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay47 = new ImageIcon(scaledImage47);
		gridButtons[47].setIcon(scaledDay47);

		// Day 48
		ImageIcon day48 = new ImageIcon("Main/ButtonImages/Day48.PNG");
		Image image48 = day48.getImage();
		Image scaledImage48 = image48.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay48 = new ImageIcon(scaledImage48);
		gridButtons[48].setIcon(scaledDay48);

		// Day 49
		ImageIcon day49 = new ImageIcon("Main/ButtonImages/Day49.PNG");
		Image image49 = day49.getImage();
		Image scaledImage49 = image49.getScaledInstance(214, 108, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledDay49 = new ImageIcon(scaledImage49);
		gridButtons[49].setIcon(scaledDay49);
	}

} // GridButtons
