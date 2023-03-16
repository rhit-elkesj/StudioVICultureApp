package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonListener implements ActionListener {

	JButton currentButton;
	JFrame mainFrame;
	
	public ButtonListener() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println(e.getSource());
	}

}
