package Main;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Class: ButtonListenerImplemented
 * 
 * @author Richelle Elkes <br>
 *         Purpose: Class that will handle the individual actions for the Button
 *         <br>
 *         Restrictions: None
 */
public class ButtonListenerImplemented extends ButtonListener {

	// Instantiated Variables
	private String buttonID;
	private static final int SCREEN_WIDTH = 1520;
	private static final int SCREEN_HEIGHT = 820;

	JFrame frame;
	JButton currentButton;

	public ButtonListenerImplemented(JButton button, JFrame mainFrame) {
		super(button, mainFrame);
		this.currentButton = button;
		this.frame = mainFrame;
		buttonID = currentButton.getName();
	}

	@Override
	public void handleButtonPress(ActionEvent e) {

		if (buttonID.equals("Start Counting")) {
			new StartCountingLayout(frame);
		}

		if (buttonID.equals("Help")) {
			new HelpLayout(frame);
		}

		if (buttonID.equals("Home")) {
			new HomeScreen(frame);
		}

		if (buttonID.equals("1")) {
			// Testing DayLayout, DayLayoutList, DayContent
			frame.add(new DayLayoutList(frame, 1));
		}

		if (buttonID.equals("2")) {
			// Testing DayLayout, DayLayoutList, DayContent
			frame.add(new DayLayoutList(frame, 2));
		}
		
	}// handleButtonPress
}// ButtonListenerImplemented
