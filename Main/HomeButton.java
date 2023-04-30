package Main;

import java.awt.*;
import java.awt.geom.Line2D;
import javax.swing.*;

public class HomeButton extends JButton {

	// Instantiated Variables
	private int s = 10;
	private Color color;

	public HomeButton(JFrame frame, int SCREEN_WIDTH, Color color) {
		super("HOME");
		this.color = color;
		setName("Home");
		setForeground(color);
		setFont(new Font(getText(), Font.BOLD, 10));
		setVerticalTextPosition(SwingConstants.CENTER);
		setHorizontalTextPosition(SwingConstants.CENTER);
		addActionListener(new ButtonListenerImplemented(this, frame));
		setPreferredSize(new Dimension(SCREEN_WIDTH, 75));
		setOpaque(false);
		setContentAreaFilled(false);
		setBorderPainted(false);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(color);
		g2.setStroke(new BasicStroke((float) 2.75));
		int centerX = getWidth() / 2; // calculate center x-coordinate
		int centerY = getHeight() / 2; // calculate center y-coordinate
		g2.translate(centerX, centerY); // translate to center of button
		g2.translate(0, -2 * Math.pow(3, 0.5) * s);
		g2.draw(new Line2D.Double(0, 0, -3 * s, 3 * Math.pow(3, 0.5) * s));
		g2.draw(new Line2D.Double(0, 0, 3 * s, 3 * Math.pow(3, 0.5) * s));
		g2.translate(-3 * s, 3 * Math.pow(3, 0.5) * s);
		g2.drawLine(0, 0, 6 * s, 0);
		g2.translate(3 * s, Math.pow(3, 0.5) * s);
		g2.draw(new Line2D.Double(0, 0, -3 * s, -3 * Math.pow(3, 0.5) * s));
		g2.draw(new Line2D.Double(0, 0, 3 * s, -3 * Math.pow(3, 0.5) * s));
		g2.translate(-3 * s, -3 * Math.pow(3, 0.5) * s);
		g2.drawLine(0, 0, 6 * s, 0);
		g2.translate(3 * s, Math.pow(3, 0.5) * s);
		g2.translate(-centerX, -centerY); // translate back to original position
	}
}
