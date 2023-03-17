package Main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridButtons extends Main {

	JFrame frame;
	JPanel buttonPanel;
	GridLayout gridButtonLayout;
	JButton[] gridButtons = new JButton[50];

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
