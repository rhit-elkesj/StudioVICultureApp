package Main;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Class: MainLabel
 * 
 * @author Richelle Elkes <br>
 *         Purpose: Creates all the labels at the top of the screen and adds
 *         them to the the MainPanel <br>
 *         Restrictions: None
 */
public class MainLabel {

	// Instantiated Variables & Components
	JFrame panelFrame;
	JPanel topPanel;
	Font labelFont = new Font("Sans Serif", Font.BOLD, 20);

	/**
	 * Ensures: The labels are constructed and added to the MainPanel
	 *
	 * <br>
	 * Requires: The JFrame, JPanel, and subsequent constructed labels, the
	 * components are created and displayed
	 */
	public MainLabel(JFrame mainFrame, JPanel labelPanel) {

		this.panelFrame = mainFrame;
		this.topPanel = labelPanel;

		JLabel chesedLabel = new JLabel("                CHESED");
		chesedLabel.setFont(labelFont);
		JLabel gevurahLabel = new JLabel("            GEVURAH");
		gevurahLabel.setFont(labelFont);
		JLabel tiferetLabel = new JLabel("            TIFERET");
		tiferetLabel.setFont(labelFont);
		JLabel netzachLabel = new JLabel("         NETZACH");
		JLabel hodLabel = new JLabel("            HOD");
		hodLabel.setFont(labelFont);
		netzachLabel.setFont(labelFont);
		JLabel yesodLabel = new JLabel("        YESOD");
		yesodLabel.setFont(labelFont);
		JLabel malchutLabel = new JLabel("     MALCHUT");
		malchutLabel.setFont(labelFont);

		topPanel.add(chesedLabel);
		topPanel.add(gevurahLabel);
		topPanel.add(tiferetLabel);
		topPanel.add(netzachLabel);
		topPanel.add(hodLabel);
		topPanel.add(yesodLabel);
		topPanel.add(malchutLabel);

	}// MainLabel
}// MainLabel
