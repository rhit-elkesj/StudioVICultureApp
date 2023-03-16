package Main;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;   

public class GridButtons extends Main {
	
	JFrame frame;
	JButton[] gridButtons = new JButton[50];
	
	public GridButtons( JFrame mainFrame) {
		this.frame = mainFrame;
		
		for(int i = 1; i < gridButtons.length; i++) {
			gridButtons[i] = new JButton(i + "");
			gridButtons[i].setText(i + "");
			gridButtons[i].addActionListener(new ButtonListener());
			frame.add(gridButtons[i]);
			frame.setLayout(new GridLayout(7, 7, 5, 5));  
			frame.setVisible(true);
		}
	}

} //GridButtons
