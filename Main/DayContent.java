package Main;

import javax.swing.JLabel;

/**
 * Class: DayContent
 * 
 * @author Richelle Elkes <br>
 *         Purpose: Class that uses JLabels to store the relevant information
 *         associated with a Day <br>
 *         Restrictions: None
 */
public class DayContent {

	// Instantiated Components
	private JLabel daylabel;
	private JLabel lessonText;

	public DayContent(JLabel mainLabel, JLabel mainTextArea) {
		this.daylabel = mainLabel;
		this.lessonText = mainTextArea;
	}

	public JLabel getLabel() {
		return daylabel;
	}

	public JLabel getTextArea() {
		return lessonText;

	}// getTextArea
}// DayContent