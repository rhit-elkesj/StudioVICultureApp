package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.HashMap;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class DayLayout extends JPanel {

	// Instantiated Variables & Components
	private static final Color BACKGROUND_COLOUR1 = new Color(29, 29, 94);
	private static final Color BACKGROUND_COLOUR2 = new Color(46, 63, 173);
	private static final Color BACKGROUND_COLOUR3 = new Color(53, 100, 204);
	private static final Color BACKGROUND_COLOUR4 = new Color(92, 142, 228);
	private static final Color BACKGROUND_COLOUR5 = new Color(158, 184, 241);
	private static final Color BACKGROUND_COLOUR6 = new Color(204, 224, 255);
	private static final Color BACKGROUND_COLOUR7 = new Color(242, 248, 255);
	protected int currentDayIndex;
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
		// The graphics are applied here
		frame.add(new Drawgraphics());
		frame.setVisible(true);

		previous = new JButton("Previous Day");
		previous.setName("Previous Day");
		previous.setPreferredSize(new Dimension(100, 75));
		previous.addActionListener(new ButtonListenerImplemented(previous, frame, currentDayIndex));
		previous.setOpaque(false);
		previous.setContentAreaFilled(false);
		previous.setBorderPainted(false);
		previous.setForeground(Color.BLACK);

		next = new JButton("Next Day");
		next.setName("Next Day");
		next.addActionListener(new ButtonListenerImplemented(next, frame, currentDayIndex));
		next.setOpaque(false);
		next.setContentAreaFilled(false);
		next.setBorderPainted(false);
		next.setForeground(Color.BLACK);

		home = new JButton("Home");
		home.setName("Home");
		home.addActionListener(new ButtonListenerImplemented(home, frame));
		home.setOpaque(false);
		home.setContentAreaFilled(false);
		home.setBorderPainted(false);
		home.setForeground(Color.black);

		toolbarPanel = new JPanel(new GridLayout(1, 3));
		toolbarPanel.add(previous);
		toolbarPanel.add(home);
		toolbarPanel.add(next);
		frame.add(toolbarPanel, BorderLayout.NORTH);

		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		frame.add(mainPanel, BorderLayout.CENTER);

		specificDayLayout(mainPanel, clickedDay);

		// Change Colour Depending on Day
		if (clickedDay <= 7) {
			toolbarPanel.setBackground(BACKGROUND_COLOUR1);
			previous.setForeground(Color.WHITE);
			next.setForeground(Color.WHITE);
			home.setForeground(Color.WHITE);
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

	protected void specificDayLayout(JPanel mainPanel, int clickedDay) {
		mainPanel.removeAll();
		DayContent dayContent = getDayContentHashMap().get(clickedDay);

		JPanel labelPanel = new JPanel(new BorderLayout());
		labelPanel.add(dayContent.getLabel(), BorderLayout.CENTER);
		mainPanel.add(labelPanel);
		mainPanel.add(dayContent.getTextArea());
		mainPanel.revalidate();
		mainPanel.repaint();

	}// specificDayLayout
}// DayLayout
