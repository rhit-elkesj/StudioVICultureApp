package Main;

import javax.swing.JLabel;

public class DayContent {

	// Instantiated Variables & Components
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