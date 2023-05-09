package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Class: AboutLayout
 * 
 * @author Richelle Elkes <br>
 *         Purpose: Class that formats information read from a Text File and
 *         displays it on the corresponding Frame with a Scanner <br>
 *         Restrictions: None
 * @referencedClasses HomeButton
 */
public class AboutLayout {

	// Instantiated Variables & Components
	private static final Color BACKGROUND_COLOUR = new Color(232, 244, 253);
	private static final int SCREEN_WIDTH = 1520;
	private static final int VERTICAL_GAP = 40;
	private static final int HORIZONTAL_GAP = 220;
	private static final int FONT_SIZE = 16;
	private static final int FONT_SIZE_HEB = 17;
	private String selectedLanguage = Main.selectedLanguage;
	private JFrame frame;
	private JPanel mainPanel;
	private JLabel about;
	private HomeButton home;

	public AboutLayout(JFrame mainFrame) {
		this.frame = mainFrame;
		frame.getContentPane().setBackground(BACKGROUND_COLOUR);

		// Home Button
		home = new HomeButton(frame, SCREEN_WIDTH, Color.BLACK);
		frame.add(home, BorderLayout.NORTH);

		try {

			File file = new File("Main/DayFiles/About");
			Scanner scanner = new Scanner(file);

			// Read the individual lines from the Text File
			String whatIsString = scanner.nextLine();
			String aboutString = scanner.nextLine();
			String WhatSevenString = scanner.nextLine();
			String characteristicsString = scanner.nextLine();
			String whyIsString = scanner.nextLine();
			String whyString = scanner.nextLine();
			String howStart = scanner.nextLine();
			String startString = scanner.nextLine();
			String whyColoursString = scanner.nextLine();
			String colorString = scanner.nextLine();

			scanner.nextLine();

			String whatIsStringHeb = scanner.nextLine();
			String aboutStringHeb = scanner.nextLine();
			String WhatSevenStringHeb = scanner.nextLine();
			String characteristicsStringHeb = scanner.nextLine();
			String whyIsStringHeb = scanner.nextLine();
			String whyStringHeb = scanner.nextLine();
			String howStartHeb = scanner.nextLine();
			String startStringHeb = scanner.nextLine();
			String whyColoursStringHeb = scanner.nextLine();
			String colorStringHeb = scanner.nextLine();

			// Uses HTML formatting for how text is displayed

			if (selectedLanguage.equals("Hebrew")) {
				about = new JLabel("<html><div style='text-align: right;'>" + whatIsStringHeb + aboutStringHeb + WhatSevenStringHeb
						+ characteristicsStringHeb + whyIsStringHeb + whyStringHeb + howStartHeb + startStringHeb
						+ whyColoursStringHeb + colorStringHeb + "</div></html>");
			} else {
				about = new JLabel(
						"<html>" + whatIsString + aboutString + WhatSevenString + characteristicsString + whyIsString
								+ whyString + howStart + startString + whyColoursString + colorString + "</html>");
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Aligns the placement of JLabel, adds the appropriate Components, and repaints
		// the updated Frame
		about.setVerticalAlignment(JLabel.TOP);
		about.setHorizontalAlignment(JLabel.CENTER);
		if(selectedLanguage.equals("Hebrew")) {
			about.setFont(new Font(about.getText(), Font.PLAIN, FONT_SIZE_HEB));
		}
		else {
			about.setFont(new Font(about.getText(), Font.PLAIN, FONT_SIZE));
		}
		mainPanel = new JPanel();
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setLayout(new BorderLayout());
		mainPanel
				.setBorder(BorderFactory.createEmptyBorder(VERTICAL_GAP, HORIZONTAL_GAP, VERTICAL_GAP, HORIZONTAL_GAP));
		mainPanel.add(about, BorderLayout.CENTER);
		frame.add(mainPanel);
		frame.revalidate();
		frame.repaint();

	}// AboutLayout
}// AboutLayout