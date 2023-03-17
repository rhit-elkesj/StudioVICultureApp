package Main;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainLabel extends Main {

	// Instantiated Variables
	JFrame panelFrame;
	JPanel topPanel;

	public MainLabel(JFrame mainFrame, JPanel mainPanel) {

		this.panelFrame = mainFrame;
		this.topPanel = mainPanel;

		JLabel chesedLabel = new JLabel("CHESED");
		JLabel gevurahLabel = new JLabel("GEVURAH");
		JLabel tiferetLabel = new JLabel("TIFERET");
		JLabel netzachLabel = new JLabel("NETZACH");
		JLabel yesodLabel = new JLabel("YESOD");
		JLabel malchutLabel = new JLabel("MALCHUT");

		chesedLabel.setPreferredSize(new Dimension(30, 30));

//		JPanel topLabelPanel = new JPanel();
//		topLabelPanel.setPreferredSize(new Dimension(1520, 60));
//		topPanel.add(topLabelPanel);
//		topLabelPanel.setVisible(true);
//		topLabelPanel.add(chesedLabel);
		panelFrame.add(chesedLabel);
		chesedLabel.setVisible(true);

	}

}
