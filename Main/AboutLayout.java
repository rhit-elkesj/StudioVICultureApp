package Main;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AboutLayout {

	// Instantiated Variables & Components
	JFrame frame;
	JButton home;

	public AboutLayout(JFrame mainFrame) {
		this.frame = mainFrame;

		home = new JButton("Home");
		home.setName("Home");
		home.addActionListener(new ButtonListenerImplemented(home, frame));
		home.setOpaque(false);
		home.setContentAreaFilled(false);
		home.setBorderPainted(false);
		frame.add(home, BorderLayout.NORTH);

		JLabel about = new JLabel("<html>What Is It?" + "<br>" + "<br>" + "<br>" + "<br>" + "<br>" + "<br>" + "<br>"
				+ "What Are the Seven Characteristics" + "</html>");
		frame.add(about);

		frame.revalidate();
		frame.repaint();

	}// AboutLayout
}// AboutLayout