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
				g2.translate(-SCREEN_WIDTH / 2, -37);
			}
		};

		home.setName("Home");
		home.setPreferredSize(new Dimension(100, 75));
		home.addActionListener(new ButtonListenerImplemented(home, frame));
		home.setOpaque(false);
		home.setContentAreaFilled(false);
		home.setBorderPainted(false);
		frame.add(home, BorderLayout.NORTH);

		aboutString = "The Counting of the Omer is a 49-day practice that occurs in Judaism. It’s considered a period for semi-mourning, where you can reflect, learn, and improve your being. It introduces the seven characteristics, which are shown below. The seven characteristics can be paired with one another to make 49 permutations, where each represents an aspect of a person’s character that can be improved upon. A permutation is represented on each day, where each day introduces the main lesson and an activity that enforces the lesson. The Omer Count is made starting the evening, where a blessing is said. After the blessing, the day is counted by absolute number and by its number within each week.";
		characteristicsString = " Chesed (חֶסֶד) – <i> Loving-Kindness </i>" + "<br>"
				+ "Gevurah (גְּבוּרָה) – <i> Justice and Discipline </i>" + "<br>"
				+ "Tiferet (תִּפְאָרָה) – <i> Harmony and Compassion </i>" + "<br>"
				+ "Netzach (נֶצַח) – <i> Endurance </i>" + "<br>" + "Hod (הוֹד) – <i> Humility </i>" + "<br>"
				+ "Yesod (יְסוֹד) – <i> Bonding </i> " + "<br>"
				+ "Malchut (מַלְכוּת) – <i> Sovereignty and Leadership </i>";

		whyString = "The seven characteristics of a human being are considered attributes of God, and the activities are designed to get you to be more like Him. By the end of it, the user would have gone through the spiritual preparation and anticipation for the giving of the Torah (true freedom). The idea is once you pass the 49th day, you arrive at the <i> “Mattan Torah,” </i> the 50th day. The Mattan Torah, or the gift of true freedom, can only be celebrated once you go through all 49 days using your own initiative, traversing and refining every emotional corner of our psyche. On this day, you receive the Torah, the ability to transcend our human limitations and touch what’s considered to be divine, which can only be achieved with our own limited faculties. The purpose of the blessings is that they mark the day you're on as a period meant for reflection, revelation, and change.";

		JLabel about = new JLabel("<html> <b> What is It? </b>" + "<br>" + aboutString + "<br>" + "<br>"
				+ "<b> What Are the Seven Characteristics? </b>" + "<br>" + characteristicsString + "<br>" + "<br>"
				+ "<b> Why is it Important? </b>" + "<br>" + whyString + "</html>");

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