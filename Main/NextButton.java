package Main;

import java.awt.*;
import javax.swing.*;

public class NextButton extends JButton {

	// Instantiated Variables
	private Color color;

	public NextButton(Frame frame, int currentDayIndex, Color color) {
		super();
		this.color = color;
		setPreferredSize(new Dimension(100, 50));
		setName("Next Day");
		setOpaque(false);
		setContentAreaFilled(false);
		setBorderPainted(false);
		addActionListener(new ButtonListenerImplemented(this, (JFrame) frame, currentDayIndex));
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(color);
		int[] xPoints = { 300, 280, 280, 300 };
		int[] yPoints = { 38, 28, 48, 38 };
		Polygon rightArrow = new Polygon(xPoints, yPoints, 4);
		g2.draw(rightArrow);
		g2.fill(rightArrow);
	}
}