package Main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class DrawLeftArrow extends JComponent {

	// Instantiated Variables & Components
	private Color color;

	@Override
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		Graphics2D graphics2 = (Graphics2D) graphics;

		int x = 100;
		int y = 100;
		int size = 50;
		this.color = Color.blue;

		graphics2.setColor(this.color);
		graphics2.translate(x, y);
		Rectangle2D.Double body = new Rectangle2D.Double(-0.5 * size, -0.5 * size, 2 * size, size);
		graphics2.draw(body);
		graphics2.fill(body);
		int[] xPoints = { -size / 2, -3 * size / 2, -size / 2 };
		int[] yPoints = { -size, 0, size };
		graphics2.drawPolygon(xPoints, yPoints, 3);
		graphics2.fillPolygon(xPoints, yPoints, 3);
	}// paintComponent
}// DrawLeftArrow
