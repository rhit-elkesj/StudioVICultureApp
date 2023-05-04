package Main;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Class: ButtonListenerImplemented
 * 
 * @author Richelle Elkes <br>
 *         Purpose: Class that will handle the individual actions for the Button <br>
 *         Restrictions: None
 * @referencedClasses StartCountingLayout, AboutLayout, HelpLayout, HomeScreen,
 *                    DayLayoutList
 */
public class ButtonListenerImplemented extends ButtonListener {

	// Instantiated Variables
	private int currentDay;
	private static final int FIRST_DAY = 1;
	private static final int LAST_DAY = 49;
	private static final int EDGE_DAY = 50;

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

		// Creates new StartCountingLayout
		if (buttonID.equals("Start Counting")) {
			new StartCountingLayout(frame);
		}

		// Creates new AboutLayout
		if (buttonID.equals("About")) {
			new AboutLayout(frame);
		}

		// Creates new HelpLayout
		if (buttonID.equals("Help")) {
			new HelpLayout(frame);
		}

		// Creates new HomeScreen
		if (buttonID.equals("Home")) {
			new HomeScreen(frame);
		}

		// Creates new DayLayoutList with given CurrentDay value
		for (int i = FIRST_DAY; i < EDGE_DAY; i++) {
			if (buttonID.equals(String.valueOf(i))) {
				new DayLayoutList(frame, i);
			}
		}

		// Creates new DayLayoutList with given CurrentDay value - 1
		if (buttonID.equals("Previous Day")) {
			if (currentDay == FIRST_DAY) {
				new DayLayoutList(frame, currentDay);
			} else if (currentDay > FIRST_DAY) {
				currentDay--;
				// Prevents from going to Day 0
				new DayLayoutList(frame, currentDay);
			}
		}

		// Creates new DayLayoutList with given CurrentDay value + 1
		if (buttonID.equals("Next Day")) {
			if (currentDay == LAST_DAY) {
				new DayLayoutList(frame, currentDay);
			} else if (currentDay < EDGE_DAY) {
				currentDay++;
				// Prevents from going to Day 50
				new DayLayoutList(frame, currentDay);
			}
		}

	}// handleButtonPress
}// buttonListenerImplemented
