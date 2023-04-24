package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
/**
 * Class: DrawStar
 * 
 * @author Jacob Kandel <br>
 *         Purpose: Draws the Star of David, the left arrow, and the right arrow on each day of the Omer using Graphics <br>
 *         Restrictions: None
 */
public class Drawgraphics extends JComponent {
	@Override
	protected void paintComponent(Graphics graphics) {
	     super.paintComponent(graphics);
	     Graphics2D graphics2 = (Graphics2D) graphics;
	     // The left arrow
	     DrawLeftArrow DLA = new DrawLeftArrow(250,75/2,30,Color.blue);
	     DLA.drawon(graphics2);
	     // The Star of David
	     DrawStar DS = new DrawStar(760,75/2,10,Color.blue);
	     DS.drawon(graphics2);
	     // The right arrow
	     DrawRightArrow DRA = new DrawRightArrow(1270,75/2,30,Color.blue);
	     DRA.drawon(graphics2);
	 }
}
