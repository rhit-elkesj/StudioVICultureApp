package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.Random;
import javax.swing.JPanel;

/**
 * Class: DrawStar
 * 
 * @author elkesj <br>
 *         Purpose: Draws the Star of David using Graphics <br>
 *         Restrictions: None
 */
public class DrawStar extends JPanel {

	// Instantiated Variables

	public DrawStar() {
		Random random = new Random(); // Will generate random values

	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

	}
}