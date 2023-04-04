package Main;

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

		if (buttonID == "Start Counting") {
			new StartCountingLayout(frame);

		}
	}// handleButtonPress

}// ButtonListenerImplemented
