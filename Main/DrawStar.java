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
 *         Purpose: Initializes the steps to draw the Star of David for the "menu" button on each day of the Omer using Graphics <br>
 *         Restrictions: None
 */
public class DrawStar{
	private Color c;
	private int xcord;
	private int ycord;
	private int s;
	
	public DrawStar(int x, int y, int size, Color color) {
		xcord = x;
		ycord = y;
		s = size;
		c = color;
		// Instantiated Variables & Components
	}
	
	public void drawon(Graphics2D g2) {
		g2.setColor(this.c);
		g2.setStroke(new BasicStroke(3));
		g2.translate(xcord,ycord);
		g2.translate(0, -2*Math.pow(3,0.5)*s);
        g2.draw(new Line2D.Double(0, 0, -3*s, 3*Math.pow(3,0.5)*s));
        g2.draw(new Line2D.Double(0, 0, 3*s, 3*Math.pow(3,0.5)*s));
        g2.translate(-3*s, 3*Math.pow(3,0.5)*s);
        g2.drawLine(0, 0, 6*s, 0);
        g2.translate(3*s, Math.pow(3,0.5)*s);
        g2.draw(new Line2D.Double(0, 0, -3*s, -3*Math.pow(3,0.5)*s));
        g2.draw(new Line2D.Double(0, 0, 3*s, -3*Math.pow(3,0.5)*s));
        g2.translate(-3*s, -3*Math.pow(3,0.5)*s);
        g2.drawLine(0, 0, 6*s, 0);
        g2.translate(3*s, Math.pow(3,0.5)*s);
        g2.translate(-xcord,-ycord);
    }
}
