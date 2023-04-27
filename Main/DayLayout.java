package Main;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Polygon;
import java.awt.geom.Line2D;
import java.util.HashMap;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public abstract class DayLayout extends JPanel {

	// Instantiated Variables & Components
	private static final Color BACKGROUND_COLOUR1 = new Color(29, 29, 94);
	private static final Color BACKGROUND_COLOUR2 = new Color(46, 63, 173);
	private static final Color BACKGROUND_COLOUR3 = new Color(53, 100, 204);
	private static final Color BACKGROUND_COLOUR4 = new Color(92, 142, 228);
	private static final Color BACKGROUND_COLOUR5 = new Color(158, 184, 241);
	private static final Color BACKGROUND_COLOUR6 = new Color(204, 224, 255);
	private static final Color BACKGROUND_COLOUR7 = new Color(242, 248, 255);
	private static final int SCREEN_WIDTH = 1520;
	protected int currentDayIndex;
	private int s = 10;
	private Color foregroundColor;
	protected JFrame frame;
	protected JPanel mainPanel;
	protected JPanel toolbarPanel;
	private JButton previous;
	private JButton next;
	private JButton home;

	public DayLayout(JFrame mainFrame, int clickedDay) {
		this.frame = mainFrame;
		this.currentDayIndex = clickedDay;

		frame.setLayout(new BorderLayout());
		frame.getContentPane().setBackground(Color.white);

		if (clickedDay <= 7) {
			foregroundColor = Color.WHITE;
		} else {
			foregroundColor = Color.BLACK;
		}

		previous = new JButton() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2 = (Graphics2D) g;
				g2.setColor(foregroundColor);
				int[] xPoints = { 200, 220, 220, 200 };
				int[] yPoints = { 38, 28, 48, 38 };
				Polygon leftArrow = new Polygon(xPoints, yPoints, 4);
				g2.draw(leftArrow);
				g2.fill(leftArrow);
			}
		};

		previous.setName("Previous Day");
		previous.setPreferredSize(new Dimension(100, 50));
		previous.addActionListener(new ButtonListenerImplemented(previous, frame, currentDayIndex));
		previous.setOpaque(false);
		previous.setContentAreaFilled(false);
		previous.setBorderPainted(false);
		previous.setForeground(Color.BLACK);

		next = new JButton() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2 = (Graphics2D) g;
				g2.setColor(foregroundColor);
				int[] xPoints = { 300, 280, 280, 300 };
				int[] yPoints = { 38, 28, 48, 38 };
				Polygon rightArrow = new Polygon(xPoints, yPoints, 4);
				g2.draw(rightArrow);
				g2.fill(rightArrow);
			}
		};

		next.setName("Next Day");
		next.addActionListener(new ButtonListenerImplemented(next, frame, currentDayIndex));
		next.setOpaque(false);
		next.setContentAreaFilled(false);
		next.setBorderPainted(false);

		// Home Button
		home = new JButton() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2 = (Graphics2D) g;
				g2.setColor(foregroundColor);
				g2.setStroke(new BasicStroke((float) 2.75));
				g2.translate(SCREEN_WIDTH / 6 + 1/2, 37);
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
				g2.translate(-SCREEN_WIDTH / 6 - 1/2, -37);
			}
		};

		home.setName("Home");
		home.setText("HOME");
		home.setForeground(foregroundColor);
		home.setFont(new Font(home.getText(), Font.BOLD, 10));
		home.setVerticalTextPosition(SwingConstants.CENTER);
		home.setHorizontalTextPosition(SwingConstants.CENTER);
		home.addActionListener(new ButtonListenerImplemented(home, frame));
		home.setOpaque(false);
		home.setContentAreaFilled(false);
		home.setBorderPainted(false);

		toolbarPanel = new JPanel(new GridLayout(1, 3));
		toolbarPanel.setPreferredSize(new Dimension(SCREEN_WIDTH, 75));
		toolbarPanel.add(previous);
		toolbarPanel.add(home);
		toolbarPanel.add(next);
		frame.add(toolbarPanel, BorderLayout.NORTH);

		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		frame.add(mainPanel, BorderLayout.CENTER);

		specificDayLayout(mainPanel, clickedDay);
		frame.revalidate();
		frame.repaint();

		// Change Colour Depending on Day
		if (clickedDay <= 7) {
			toolbarPanel.setBackground(BACKGROUND_COLOUR1);
		} else if (clickedDay <= 14) {
			toolbarPanel.setBackground(BACKGROUND_COLOUR2);
		} else if (clickedDay <= 21) {
			toolbarPanel.setBackground(BACKGROUND_COLOUR3);
		} else if (clickedDay <= 28) {
			toolbarPanel.setBackground(BACKGROUND_COLOUR4);
		} else if (clickedDay <= 35) {
			toolbarPanel.setBackground(BACKGROUND_COLOUR5);
		} else if (clickedDay <= 42) {
			toolbarPanel.setBackground(BACKGROUND_COLOUR6);
		} else if (clickedDay <= 49) {
			toolbarPanel.setBackground(BACKGROUND_COLOUR7);
		}

		frame.revalidate();
		frame.repaint();
	}// DayLayout

	protected abstract HashMap<Integer, DayContent> getDayContentHashMap();

	protected abstract void specificDayLayout(JPanel mainPanel, int clickedDay);// specificDayLayout

}// DayLayout