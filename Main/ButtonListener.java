package Main;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Class: ButtonListener
 * 
 * @author elkesj <br>
 *         Purpose: ActionListener for the Buttons <br>
 *         Restrictions: None
 */
public class ButtonListener extends Main implements ActionListener {

	// Instantiated Variables
	private static final int TILE_AMOUNT = 7;
	private static final int TILE_GAP = 5;
	private static final int BORDER_GAP_WIDTH_T = 5;
	private static final int BORDER_GAP_WIDTH_L = 3;
	private static final int BORDER_GAP_WIDTH_B = 5;
	private static final int BORDER_GAP_WIDTH_R = 3;
	private String buttonID;

	JButton currentButton;
	JFrame frame;

	/**
	 * Ensures: The ButtonListener is constructed (default constructor)
	 *
	 * <br>
	 * Requires: The ButtonListener and subsequent action components are created and
	 * displayed
	 */

	public ButtonListener(JButton buttonPressed, JFrame mainFrame) {
		this.currentButton = buttonPressed;
		buttonID = currentButton.getName();
		this.frame = mainFrame;

	}// ButtonListener

	@Override
	public void actionPerformed(ActionEvent e) {

		if (buttonID.equals("1")) {

			System.out.println(buttonID);
		}
		if (buttonID.equals("2")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("3")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("4")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("5")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("6")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("7")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("8")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("9")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("10")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("11")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("12")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("13")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("14")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("15")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("16")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("17")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("18")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("19")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("20")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("21")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("22")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("23")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("24")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("25")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("26")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("27")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("28")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("29")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("30")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("31")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("32")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("33")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("34")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("35")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("36")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("37")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("38")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("39")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("40")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("41")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("42")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("43")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("44")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("45")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("46")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("47")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("48")) {
			System.out.println(buttonID);
		}
		if (buttonID.equals("49")) {
			System.out.println(buttonID);
		}

		if (buttonID.equals("About")) {
			System.out.println(buttonID);
			frame.getContentPane().removeAll();
			frame.getContentPane().repaint();
		}

		if (buttonID.equals("Start Counting")) {
			System.out.println(buttonID);
			frame.getContentPane().removeAll(); // Clears all contents of the frame
			frame.getContentPane().repaint(); // Refreshes screen automatically (blanks)

			// Constructing the buttonGrid, and mainButton Panel
			GridLayout buttonGrid = new GridLayout(TILE_AMOUNT, TILE_AMOUNT, TILE_GAP, TILE_GAP); // 7 x 7 Grid with
																									// gaps of 5 between
																									// each tile
			JPanel mainButtonPanel = new JPanel(buttonGrid);

			mainButtonPanel.setBorder(BorderFactory.createEmptyBorder(BORDER_GAP_WIDTH_T, BORDER_GAP_WIDTH_L,
					BORDER_GAP_WIDTH_B, BORDER_GAP_WIDTH_R)); // Adds gaps to outside border

			mainButtonPanel.setBackground(Color.BLACK);
			frame.setBackground(Color.BLACK);

			frame.add(mainButtonPanel);

			// IOException if the GridButtons cannot be constructed properly
			try {
				new GridButtons(frame, mainButtonPanel);
			} catch (IOException es) {
				es.printStackTrace();
			}
		}

	}// ActionPerformed
}// ButtonListener
