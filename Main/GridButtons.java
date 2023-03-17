package Main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridButtons extends Main {

	// Instantiated Variables
	JFrame frame;
	JPanel buttonPanel;
	GridLayout gridButtonLayout;
	JButton[] gridButtons = new JButton[50];

	/**
	 * Ensures: The GridLayout of buttons is constructed
	 *
	 * <br>
	 * Requires: The JFrame, JPanel, GridLayout, JButton[], and subsequent action
	 * components are created and displayed
	 */
	public GridButtons(JFrame mainFrame, JPanel mainButtonPanel, GridLayout mainGridButtons) {

		this.frame = mainFrame;
		this.buttonPanel = mainButtonPanel;
		this.gridButtonLayout = mainGridButtons;

		for (int i = 1; i < gridButtons.length; i++) {
			gridButtons[i] = new JButton(i + "");
			gridButtons[i].setText(i + "");
			gridButtons[i].addActionListener(new ButtonListener());
			buttonPanel.add(gridButtons[i]);

			buttonPanel.setVisible(true);
			frame.setVisible(true);
		}
	}
} // GridButtons
