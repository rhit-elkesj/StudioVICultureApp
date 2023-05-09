package Main;

import java.awt.*;
import java.awt.geom.Line2D;
import javax.swing.*;

/**
 * Class: HomeButton
 * 
 * @author Richelle Elkes, Jacob Kandel <br>
 *         Purpose: Class that creates the HomeButton and uses Graphics2D to
 *         draw the 'Star of David' as the Button Image <br>
 *         Restrictions: None
 * @ReferencedClasses HomeButton, dayContent, ButtonListenerImplemented
 */
public class HomeButton extends JButton {

	// Instantiated Variables
	private Color color;
	private static final int SCALE_FACTOR = 10;
	private static final double FONT_SIZE = 10.5;
	private static final int FONT_SIZE_HEB = 16;
	private static final int BANNER_HEIGHT = 75;
	private static final double STROKE_THICKNESS = 2.75;
	private String selectedLanguage = Main.selectedLanguage;

	public HomeButton(JFrame frame, int SCREEN_WIDTH, Color color) {
		super("HOME");
		this.color = color;
		setName("Home");

		// Formats Text, adds ButtonListenerImplemented, formats Button
		setForeground(color);

		if (selectedLanguage.equals("Hebrew")) {
			this.setText("בית");
			this.setFont(new Font(getText(), Font.BOLD, FONT_SIZE_HEB));
		} else {
			setFont(new Font(getText(), Font.BOLD, (int) FONT_SIZE));
		}

		setVerticalTextPosition(SwingConstants.CENTER);
		setHorizontalTextPosition(SwingConstants.CENTER);
		addActionListener(new ButtonListenerImplemented(this, frame));
		setPreferredSize(new Dimension(SCREEN_WIDTH, BANNER_HEIGHT));
		setOpaque(false);
		setContentAreaFilled(false);
		setBorderPainted(false);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(color);
		g2.setStroke(new BasicStroke((float) STROKE_THICKNESS));

		// Calculates X and Y coordinate, centers Button
		int centerX = getWidth() / 2;
		int centerY = getHeight() / 2;
		g2.translate(centerX, centerY);
		g2.translate(0, -2 * Math.pow(3, 0.5) * SCALE_FACTOR);
		g2.draw(new Line2D.Double(0, 0, -3 * SCALE_FACTOR, 3 * Math.pow(3, 0.5) * SCALE_FACTOR));
		g2.draw(new Line2D.Double(0, 0, 3 * SCALE_FACTOR, 3 * Math.pow(3, 0.5) * SCALE_FACTOR));
		g2.translate(-3 * SCALE_FACTOR, 3 * Math.pow(3, 0.5) * SCALE_FACTOR);
		g2.drawLine(0, 0, 6 * SCALE_FACTOR, 0);
		g2.translate(3 * SCALE_FACTOR, Math.pow(3, 0.5) * SCALE_FACTOR);
		g2.draw(new Line2D.Double(0, 0, -3 * SCALE_FACTOR, -3 * Math.pow(3, 0.5) * SCALE_FACTOR));
		g2.draw(new Line2D.Double(0, 0, 3 * SCALE_FACTOR, -3 * Math.pow(3, 0.5) * SCALE_FACTOR));
		g2.translate(-3 * SCALE_FACTOR, -3 * Math.pow(3, 0.5) * SCALE_FACTOR);
		g2.drawLine(0, 0, 6 * SCALE_FACTOR, 0);
		g2.translate(3 * SCALE_FACTOR, Math.pow(3, 0.5) * SCALE_FACTOR);

		// Translates to original position
		g2.translate(-centerX, -centerY);
	}// paintComponent
}// HomeButton
