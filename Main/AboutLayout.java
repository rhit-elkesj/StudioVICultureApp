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

public class AboutLayout {

	// Instantiated Variables & Components
	private JFrame frame;
	private HomeButton home;
	private JLabel about;
	private static final Color BACKGROUND_COLOUR = new Color(232, 244, 253);
	private static final int SCREEN_WIDTH = 1520;
	private JPanel mainPanel;

	public AboutLayout(JFrame mainFrame) {
		this.frame = mainFrame;
		frame.getContentPane().setBackground(BACKGROUND_COLOUR);

		// Home Button
		home = new HomeButton(frame, SCREEN_WIDTH, Color.black);
		frame.add(home, BorderLayout.NORTH);

		try {

			File file = new File("Main/DayFiles/About");
			Scanner scanner = new Scanner(file);

			String aboutString = scanner.nextLine();
			String characteristicsString = scanner.nextLine();
			String whyString = scanner.nextLine();
			String StartString = scanner.nextLine();
			String ColorString = scanner.nextLine();

			about = new JLabel("<html> <b> What is It? </b>" + "<br>" + aboutString + "<br>" + "<br>"
					+ "<b> What Are the Seven Characteristics? </b>" + "<br>" + characteristicsString + "<br>" + "<br>"
					+ "<b> Why is it Important? </b>" + "<br>" + whyString + "<br>" + "<br>"
					+ "<b> What started the counting of the Omer? ? </b>" + "<br>" + StartString + "<br>" + "<br>"
					+ "<b> What's the rationale for the color scheme? </b>" + "<br>" + ColorString + "</html>");

			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		about.setVerticalAlignment(JLabel.TOP);
		about.setHorizontalAlignment(JLabel.CENTER);
		about.setFont(new Font(about.getText(), Font.PLAIN, 16));

		mainPanel = new JPanel();
		mainPanel.setBackground(Color.white);
		mainPanel.setLayout(new BorderLayout());
		mainPanel.setBorder(BorderFactory.createEmptyBorder(40, 220, 40, 220));
		mainPanel.add(about, BorderLayout.CENTER);

		frame.add(mainPanel);
		frame.revalidate();
		frame.repaint();

	}// AboutLayout
}// AboutLayout