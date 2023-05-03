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
	private static final int SCREEN_WIDTH = 1520;
	protected int currentDayIndex;
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

		previous = new PreviousButton(frame, currentDayIndex, foregroundColor);
		next = new NextButton(frame, currentDayIndex, foregroundColor);
		if (clickedDay == 1) {
			previous.setName("Start Counting");
		}

		if (clickedDay == 49) {
			next.setName("Start Counting");
		}

		// Home Button
		home = new HomeButton(frame, SCREEN_WIDTH, foregroundColor);

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

	protected abstract void specificDayLayout(JPanel mainPanel, int clickedDay); // specificDayLayout

}// DayLayout