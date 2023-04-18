package Main;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Class: ButtonListenerImplemented
 * 
 * @author <br>
 *         Purpose: Class that will handle the individual actions for the Button
 *         <br>
 *         Restrictions: None
 */
public class ButtonListenerImplemented extends ButtonListener {

	// Instantiated Variables & Components
	private int currentDay;

	public ButtonListenerImplemented(JButton button, JFrame mainFrame) {
		super(button, mainFrame);
	}

	public ButtonListenerImplemented(JButton button, JFrame mainFrame, int currentDay) {
		super(button, mainFrame);
		this.currentDay = currentDay;
	}

	@Override
	public void handleButtonPress(ActionEvent e) {
		String buttonID = getCurrentButton().getName();
		JFrame frame = getFrame();

		if (buttonID.equals("Start Counting")) {
			new StartCountingLayout(frame);
		}

		if (buttonID.equals("About")) {
			new AboutLayout(frame);
		}

		if (buttonID.equals("Help")) {
			new HelpLayout(frame);
		}

		if (buttonID.equals("Home")) {
			new HomeScreen(frame);
		}

		for (int i = 1; i <= 50; i++) {
			if (buttonID.equals(String.valueOf(i))) {
				new DayLayoutList(frame, i);
			}
		}

		if (buttonID.equals("Previous Day")) {
			if (currentDay == 1) {
				new DayLayoutList(frame, currentDay);
			} else if (currentDay > 1) {
				currentDay--;
				new DayLayoutList(frame, currentDay);
			}
		}

		if (buttonID.equals("Next Day")) {
			if (currentDay == 49) {
				new DayLayoutList(frame, currentDay);
			} else if (currentDay < 50) {

				currentDay++;
				new DayLayoutList(frame, currentDay);
			}
		}

	}// handleButtonPress
}// buttonListenerImplemented
