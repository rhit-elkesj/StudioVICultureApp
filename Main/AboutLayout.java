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
				+ "\r\n"
				+ "Gevurah (גְּבוּרָה) – Justice and Discipline  \r\n"
				+ "\r\n"
				+ "Tiferet (תִּפְאָרָה) – Harmony and compassion \r\n"
				+ "\r\n"
				+ "Netzach (נֶצַח) – Endurance \r\n"
				+ "\r\n"
				+ "Hod (הוֹד) – Humility \r\n"
				+ "\r\n"
				+ "Yesod (יְסוֹד) – Bonding \r\n"
				+ "\r\n"
				+ "Malchut (מַלְכוּת) – Sovereignty and leadership";
		JLabel about = new JLabel(
				"<html> What Is It?" + "<br>" + aboutString + "<br>" + "<br>" + "<br>" + "<br>" + "<br>" + "<br>"

						+ "What Are the Seven Characteristics?" + characteristicsString + "</html>");
		frame.add(about);

		frame.revalidate();
		frame.repaint();

	}// AboutLayout
}// AboutLayout