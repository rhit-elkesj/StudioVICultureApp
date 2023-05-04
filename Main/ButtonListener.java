package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Class: ButtonListener
 * 
 * @author Richelle Elkes <br>
 *         Purpose: Abstract ActionListener for the Buttons that clears the
 *         contents of the frame frame <br>
 *         Restrictions: None
 */
public abstract class ButtonListener implements ActionListener {

	// Instantiated Components
	private JFrame frame;
	private JButton currentButton;
	
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

		// Clears all contents of the Frame and repaints (blanks)
		frame.getContentPane().removeAll(); 
		frame.getContentPane().repaint();
		handleButtonPress(e);

	}// actionPerformed
}// ButtonListener