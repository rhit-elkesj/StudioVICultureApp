package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Class: ButtonListener
 * 
 * @author <br>
 * 
 *         Purpose: Abstract ActionListener for the Buttons that clear the frame
 * 
 *         Restrictions: None
 */
public abstract class ButtonListener implements ActionListener {

	private JButton currentButton;
	private JFrame frame;

	public ButtonListener(JButton buttonPressed, JFrame mainFrame) {
		this.currentButton = buttonPressed;
		this.frame = mainFrame;
	}

	public JButton getCurrentButton() {
		return currentButton;
	}

	public JFrame getFrame() {
		return frame;
	}

	public abstract void handleButtonPress(ActionEvent e);

	@Override
	public void actionPerformed(ActionEvent e) {

		frame.getContentPane().removeAll(); // Clears all contents of the frame
		frame.getContentPane().repaint(); // Refreshes screen automatically (blanks)
		handleButtonPress(e);

	}// actionPerformed
}// ButtonListener