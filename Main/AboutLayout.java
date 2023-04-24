package Main;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AboutLayout {

	// Instantiated Variables & Components
	private JFrame frame;
	private JButton home;
	private String aboutString;
	private String characteristicsString;
	private String whenString;
	private static final Color BACKGROUND_COLOUR = new Color(232, 244, 253);
	private static final int SCREEN_WIDTH = 1520;
	private int s = 8;
	private String whyString;
	private JPanel mainPanel;

	public AboutLayout(JFrame mainFrame) {
		this.frame = mainFrame;
		frame.getContentPane().setBackground(BACKGROUND_COLOUR);

		home = new JButton() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2 = (Graphics2D) g;
				g2.setColor(Color.BLACK);
				g2.setStroke(new BasicStroke(3));
				g2.translate(SCREEN_WIDTH / 2, 37);
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
				g2.translate(-SCREEN_WIDTH / 2, -3);
			}
		};

		home.setName("Home");
		home.setPreferredSize(new Dimension(100, 75));
		home.addActionListener(new ButtonListenerImplemented(home, frame));
		home.setOpaque(false);
		home.setContentAreaFilled(false);
		home.setBorderPainted(false);
		frame.add(home, BorderLayout.NORTH);

		aboutString = "The Counting of the Omer is a 49-day Jewish practice for reflection and improvement. It introduces seven character traits that can be paired to create 49 permutations, each representing an aspect of one's character that can be improved. Each day has a lesson and an activity to enforce it. The Count starts with a blessing in the evening and is counted by absolute number and by its number within each week.";
		characteristicsString = " Chesed (חֶסֶד) – <i> Loving-Kindness </i>" + "<br>"
				+ "Gevurah (גְּבוּרָה) – <i> Justice and Discipline </i>" + "<br>"
				+ "Tiferet (תִּפְאָרָה) – <i> Harmony and Compassion </i>" + "<br>"
				+ "Netzach (נֶצַח) – <i> Endurance </i>" + "<br>" + "Hod (הוֹד) – <i> Humility </i>" + "<br>"
				+ "Yesod (יְסוֹד) – <i> Bonding </i> " + "<br>"
				+ "Malchut (מַלְכוּת) – <i> Sovereignty and Leadership </i>";

		whyString = "The Seven human attributes are believed to be attributes of God, and the activities aim to develop those attributes. The 49-day practice leads to spiritual preparation and anticipation for the giving of the Torah, and upon completion, one receives the gift of true freedom. The day of receiving the Torah, or the 'Mattan Torah,' is celebrated as the ability to transcend human limitations and touch the divine. The blessings mark each day as a time for reflection, revelation, and change.";
		whenString = "The Counting of the Omer begins on the second day of Passover and ends 49 days later, on the holiday of Shavuot.";

		JLabel about = new JLabel("<html> <b> What is It? </b>" + "<br>" + aboutString + "<br>" + "<br>"
				+ "<b> What Are the Seven Characteristics? </b>" + "<br>" + characteristicsString + "<br>" + "<br>"
				+ "<b> Why is it Important? </b>" + "<br>" + whyString + "<br>" + "<br>"
				+ "<b> When Does it Start and End? </b>" + "<br>" + whenString + "</html>");

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