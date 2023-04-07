package Main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JPanel;

/**
 * Class: DrawStar
 * 
 * @author Jacob Kandel <br>
 *         Purpose: Draws the Star of David using Graphics <br>
 *         Restrictions: None
 */
public class DrawStar extends JPanel {

	// Instantiated Variables
	private static int x = 100;
	private static int y = 100;
	private static int SCALE_1 = 6;
	private static int SCALE_2 = -2;
	private static int STAR_SIZE = 20;
	private static int TRANSLATE_X = 3;
	private static double TRANSLATE_Y = 0.5;
	private static int STROKE_SIZE = 3;

	// private static int scale =

	public DrawStar() {

	}

	@Override
	protected void paintComponent(Graphics graphics) {

		super.paintComponent(graphics);
		Graphics2D graphics2 = (Graphics2D) graphics;

		graphics2.setColor(Color.BLUE);
		graphics2.setStroke(new BasicStroke(STROKE_SIZE));
		graphics2.translate(x, y);
		graphics2.translate(0, SCALE_2 * Math.pow(TRANSLATE_X, TRANSLATE_Y) * STAR_SIZE);
		graphics2.draw(new Line2D.Double(0, 0, -TRANSLATE_X * STAR_SIZE,
				TRANSLATE_X * Math.pow(TRANSLATE_X, TRANSLATE_Y) * STAR_SIZE));
		graphics2.draw(new Line2D.Double(0, 0, TRANSLATE_X * STAR_SIZE,
				TRANSLATE_X * Math.pow(TRANSLATE_X, TRANSLATE_Y) * STAR_SIZE));
		graphics2.translate(-TRANSLATE_X * STAR_SIZE, TRANSLATE_X * Math.pow(TRANSLATE_X, TRANSLATE_Y) * STAR_SIZE);
		graphics2.drawLine(0, 0, SCALE_1 * STAR_SIZE, 0);
		graphics2.translate(TRANSLATE_X * STAR_SIZE, Math.pow(TRANSLATE_X, TRANSLATE_Y) * STAR_SIZE);
		graphics2.draw(new Line2D.Double(0, 0, -TRANSLATE_X * STAR_SIZE,
				-TRANSLATE_X * Math.pow(TRANSLATE_X, TRANSLATE_Y) * STAR_SIZE));
		graphics2.draw(new Line2D.Double(0, 0, TRANSLATE_X * STAR_SIZE,
				-TRANSLATE_X * Math.pow(TRANSLATE_X, TRANSLATE_Y) * STAR_SIZE));
		graphics2.translate(-TRANSLATE_X * STAR_SIZE, -TRANSLATE_X * Math.pow(TRANSLATE_X, TRANSLATE_Y) * STAR_SIZE);
		graphics2.drawLine(0, 0, SCALE_1 * STAR_SIZE, 0);
		graphics2.translate(TRANSLATE_X * STAR_SIZE, Math.pow(TRANSLATE_X, TRANSLATE_Y) * STAR_SIZE);

	}// paintComponent
}// DrawStar