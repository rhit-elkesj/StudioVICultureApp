package Main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
/**
 * Class: DrawLeftArrow
 * 
 * @author Jacob Kandel <br>
 *         Purpose: Initializes the steps to draw the left arrow for the "Next Day" button on each day of the Omer using Graphics <br>
 *         Restrictions: None
 */
public class DrawRightArrow{
	private Color c;
	private int xcord;
	private int ycord;
	private int s;
	
	public DrawRightArrow(int x, int y, int size, Color color) {
		xcord = x;
		ycord = y;
		s = size;
		c = color;
		// Instantiated Variables & Components
	}
	
	public void drawon(Graphics2D g2) {        
        g2.setColor(this.c);     
		Rectangle2D.Double body = new Rectangle2D.Double(xcord-1.5*s, ycord-0.5*s, 2*s, s);
		g2.draw(body);
		g2.fill(body);
		int[] xPoints = {xcord+s/2, xcord+3*s/2, xcord+s/2};
		int[] yPoints = {ycord-s, ycord, ycord+s};
		g2.drawPolygon(xPoints, yPoints, 3);
		g2.fillPolygon(xPoints, yPoints, 3);
    }
}