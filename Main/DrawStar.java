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
 * @author JacobK <br>
 *         Purpose: Draws the Star of David using Graphics <br>
 *         Restrictions: None
 */
public class DrawStar extends JPanel {

	// Instantiated Variables
	private static int x = 100;
	private static int y = 100;
	private static int size = 20;
	//private static int scale = 

	public DrawStar() {

	}

	@Override
	protected void paintComponent(Graphics graphics) {

		super.paintComponent(graphics);
        Graphics2D graphics2 = (Graphics2D) graphics;
        
        graphics2.setColor(Color.BLUE);
        graphics2.setStroke(new BasicStroke(3));
        graphics2.translate(x,y);
        graphics2.translate(0, -2*Math.pow(3,0.5)*size);
        graphics2.draw(new Line2D.Double(0, 0, -3*size, 3*Math.pow(3,0.5)*size));
        graphics2.draw(new Line2D.Double(0, 0, 3*size, 3*Math.pow(3,0.5)*size));
        graphics2.translate(-3*size, 3*Math.pow(3,0.5)*size);
        graphics2.drawLine(0, 0, 6*size, 0);
        graphics2.translate(3*size, Math.pow(3,0.5)*size);
        graphics2.draw(new Line2D.Double(0, 0, -3*size, -3*Math.pow(3,0.5)*size));
        graphics2.draw(new Line2D.Double(0, 0, 3*size, -3*Math.pow(3,0.5)*size));
        graphics2.translate(-3*size, -3*Math.pow(3,0.5)*size);
        graphics2.drawLine(0, 0, 6*size, 0);
        graphics2.translate(3*size, Math.pow(3,0.5)*size);

	}
}