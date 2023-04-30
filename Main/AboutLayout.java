package Main;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class AboutLayout {

	// Instantiated Variables & Components
	private JFrame frame;
	private JButton home;
	private JLabel about;
	private static final Color BACKGROUND_COLOUR = new Color(232, 244, 253);
	private static final int SCREEN_WIDTH = 1520;
	private int s = 10;
	private JPanel mainPanel;

	public AboutLayout(JFrame mainFrame) {
		this.frame = mainFrame;
		frame.getContentPane().setBackground(BACKGROUND_COLOUR);

		// Home Button
		home = new JButton("HOME") {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2 = (Graphics2D) g;
				g2.setColor(Color.BLACK);
				g2.setStroke(new BasicStroke((float) 2.75));
				int centerX = getWidth() / 2; // calculate center x-coordinate
				int centerY = getHeight() / 2; // calculate center y-coordinate
				g2.translate(centerX, centerY); // translate to center of button
				g2.translate(0, -2 * Math.pow(3, 0.5) * s);
				g2.draw(new Line2D.Double(0, 0, -3 * s, 3 * Math.pow(3, 0.5) * s));
				g2.draw(new Line2D.Double(0, 0, 3 * s, 3 * Math.pow(3, 0.5) * s));
				g2.translate(-3 * s, 3 * Math.pow(3, 0.5) * s);
				g2.drawLine(0, 0, 6 * s, 0);
				g2.translate(3 * s, Math.pow(3, 0.5) * s);
				g2.draw(new Line2D.Double(0, 0, -3 * s, -3 * Math.pow(3, 0.5) * s));
				g2.draw(new Line2D.Double(0, 0, 3 * s, -3 * Math.pow(3, 0.5) * s));
				g2.translate(-3 * s, -3 * Math.pow(3, 0.5) * s);
				g2.drawLine(0, 0, 6 * s, 0);
				g2.translate(3 * s, Math.pow(3, 0.5) * s);
				g2.translate(-centerX, -centerY); // translate back to original position
			}
		};

		home.setName("Home");
		home.setForeground(Color.BLACK);
		home.setFont(new Font(home.getText(), Font.BOLD, 10));
		home.setVerticalTextPosition(SwingConstants.CENTER);
		home.setHorizontalTextPosition(SwingConstants.CENTER);
		home.setPreferredSize(new Dimension(100, 75));
		home.addActionListener(new ButtonListenerImplemented(home, frame));
		home.setOpaque(false);
		home.setContentAreaFilled(false);
		home.setBorderPainted(false);
		frame.add(home, BorderLayout.NORTH);
		try {

			File file = new File("Main/DayFiles/About");
			Scanner scanner = new Scanner(file);

			String aboutString = scanner.nextLine();
			String characteristicsString = scanner.nextLine();
			String whyString = scanner.nextLine();
			String whenString = scanner.nextLine();

			about = new JLabel("<html> <b> What is It? </b>" + "<br>" + aboutString + "<br>" + "<br>"
					+ "<b> What Are the Seven Characteristics? </b>" + "<br>" + characteristicsString + "<br>" + "<br>"
					+ "<b> Why is it Important? </b>" + "<br>" + whyString + "<br>" + "<br>"
					+ "<b> When Does it Start and End? </b>" + "<br>" + whenString + "</html>");

			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		about.setVerticalAlignment(JLabel.TOP);
		about.setHorizontalAlignment(JLabel.CENTER);
		about.setFont(new Font(about.getText(), Font.PLAIN, 20));

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