package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Class: ButtonListener
 * 
 * @author Richelle Elkes <br>
 *         Purpose: Abstract ActionListener for the Buttons that clear the frame
 *         <br>
 *         Restrictions: None
 */
public abstract class ButtonListener implements ActionListener {

	// Instantiated Variables & Components
	private String buttonID;
	private JButton currentButton;
	private JFrame frame;

	/**
	 * Ensures: The ButtonListener is constructed (default constructor)
	 *
	 * <br>
	 * Requires: The ButtonListener and subsequent action components are created and
	 * displayed
	 */
	public ButtonListener(JButton buttonPressed, JFrame mainFrame) {
		this.currentButton = buttonPressed;
		this.buttonID = currentButton.getName();
		this.frame = mainFrame;

	}

	public abstract void handleButtonPress(ActionEvent e);

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println(buttonID); // TODO: Remove Eventually
		frame.getContentPane().removeAll(); // Clears all contents of the frame
		frame.getContentPane().repaint(); // Refreshes screen automatically (blanks)
		handleButtonPress(e);

	}// ActionPerformed
}// ButtonListener
