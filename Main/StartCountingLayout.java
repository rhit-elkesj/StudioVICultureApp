package Main;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Class: StartCountingLayout
 * 
 * @author  <br>
 *         Purpose: Adds the necessary components to create the GridButtons <br>
 *         Restrictions: None
 */
public class StartCountingLayout {

	// Instantiated Variables & Components
	private static final int TILE_AMOUNT = 7;
	private static final int TILE_GAP = 5;
	private static final int BORDER_GAP_WIDTH_T = 5;
	private static final int BORDER_GAP_WIDTH_L = 3;
	private static final int BORDER_GAP_WIDTH_B = 5;
	private static final int BORDER_GAP_WIDTH_R = 3;
	private Color BACKGROUND_COLOUR = Color.BLACK;
	private JFrame frame;

	public StartCountingLayout(JFrame mainFrame) {
		this.frame = mainFrame;

		// Constructing the buttonGrid, and mainButton Panel
		GridLayout buttonGrid = new GridLayout(TILE_AMOUNT, TILE_AMOUNT, TILE_GAP, TILE_GAP); // 7 x 7 Grid with
																								// gaps of 5 between
																								// each tile
		JPanel mainButtonPanel = new JPanel(buttonGrid);

		mainButtonPanel.setBorder(BorderFactory.createEmptyBorder(BORDER_GAP_WIDTH_T, BORDER_GAP_WIDTH_L,
				BORDER_GAP_WIDTH_B, BORDER_GAP_WIDTH_R)); // Adds gaps to outside border

		mainButtonPanel.setBackground(BACKGROUND_COLOUR);
		frame.setBackground(BACKGROUND_COLOUR);

		frame.add(mainButtonPanel);

		// IOException if the GridButtons cannot be constructed properly
		try {
			new GridButtons(frame, mainButtonPanel);
		} catch (IOException es) {
			es.printStackTrace();
		
		}

	}// StartCountingLayout
}// StartCountingLayout
