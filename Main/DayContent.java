package Main;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class DayContent {

	// Instantiated Variables

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
	}
}
