package Main;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AboutLayout {

	// Instantiated Variables & Components
	JFrame frame;
	JButton home;
	String aboutString;
	String characteristicsString;
	String whyString;

	public AboutLayout(JFrame mainFrame) {
		this.frame = mainFrame;

		home = new JButton("Home");
		home.setName("Home");
		home.addActionListener(new ButtonListenerImplemented(home, frame));
		home.setOpaque(false);
		home.setContentAreaFilled(false);
		home.setBorderPainted(false);
		frame.add(home, BorderLayout.NORTH);

		aboutString = "The counting of the Omer is a 49-day practice that occurs in Judaism. It’s considered as a period for semi-mourning, where you can reflect, learn, and improve yourself as a human being. It introduces the seven characteristics of a human being, which are shown below. The seven characteristics can be paired with one another to make 49 permutations, where each permutation represents an aspect of a person’s character that can be improved upon. Each permutation is represented on each day, where each day introduces the main lesson that reflects the permutation and an activity that enforces the lesson. The Omer count is made starting the evening of each day. When the count happens at night, a blessing is said. When the count happens during the daytime, the blessing isn’t said. After the blessing, the day is counted by absolute number and by its number within each week.";
		characteristicsString = " Chesed (חֶסֶד) – Loving-kindness  \r\n"
				+ "<br>"
				+ "Gevurah (גְּבוּרָה) – Justice and Discipline  \r\n"
				+ "<br>"
				+ "Tiferet (תִּפְאָרָה) – Harmony and compassion \r\n"
				+ "<br>"
				+ "Netzach (נֶצַח) – Endurance \r\n"
				+ "<br>"
				+ "Hod (הוֹד) – Humility \r\n"
				+ "<br>"
				+ "Yesod (יְסוֹד) – Bonding \r\n"
				+ "<br>"
				+ "Malchut (מַלְכוּת) – Sovereignty and leadership";
		whyString = "The seven characteristics of a human being are considered attributes of God, and the activities are designed to get you to be more like him. So, by the end of it, the user would have gone through the spiritual preparation and anticipation for the giving of the Torah, or true freedom. The idea is that once you pass the 49th day, you arrive at the “Mattan Torah,” the 50th day. The Mattan Torah, or the gift of true freedom, can only be celebrated once you go through all 49 days using your own initiative, traversing and refining every emotional corner of our psyche. On this day, you receive the Torah, the ability to transcend our human limitations and touch what’s considered to be divine, which can only be achieved with our own limited faculties. The purpose of the blessings is that they mark the day you're on as a period meant for reflection, revelation, and change.";
		JLabel about = new JLabel(
				"<html> What Is It?" + "<br>" + aboutString + "<br>" + "<br>" + "<br>" + "<br>" + "<br>" + "<br>"

						+ "What Are the Seven Characteristics?" + "<br>" + characteristicsString + "<br>" + "<br>" + "<br>" + "<br>" + "<br>" + "<br>"
						
						+ "Why is it Important?" + "<br>" + whyString+ "</html>");
		frame.add(about);
		frame.revalidate();
		frame.repaint();

	}// AboutLayout
}// AboutLayout