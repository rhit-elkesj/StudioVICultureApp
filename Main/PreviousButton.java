package Main;

import javax.swing.*;
import java.awt.*;

/**
 * Class: PreviousButton
 * 
 * @author Richelle Elkes <br>
 *         Purpose: Class that creates the PreviousButton and uses Graphics2D to
 *         draw the backward arrow as the Button Image <br>
 *         Restrictions: None
 * @ReferencedClasses ButtonListenerImplemented
 */
public class PreviousButton extends JButton {

	// Instantiated Variables
	private Color color;

	public PreviousButton(Frame frame, int currentDayIndex, Color color) {
		super();
		this.color = color;
		
		// Creates Button, adds ButtonListenerImplemented, formats Button
		this.setName("Previous Day");
		this.setPreferredSize(new Dimension(100, 50));
		this.addActionListener(new ButtonListenerImplemented(this, (JFrame) frame, currentDayIndex));
		this.setOpaque(false);
		this.setContentAreaFilled(false);
		this.setBorderPainted(false);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(color);
		int[] xPoints = { 200, 220, 220, 200 };
		int[] yPoints = { 38, 28, 48, 38 };
		Polygon leftArrow = new Polygon(xPoints, yPoints, 4);
		g2.draw(leftArrow);
		g2.fill(leftArrow);
		
	}// paintComponent
}// PreviousButton