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

/**
 * Class: DayContent
 * 
 * @author Richelle Elkes <br>
 *         Purpose: Abstract Class that creates the components and general
 *         layout of content to be displayed on the Frame, specificDayLayout()
 *         handles each Day's specific content <br>
 *         Restrictions: None
 * @referencedClasses PreviousButton, HomeButton, NextButton
 */
public abstract class DayLayout extends JPanel {

	// Instantiated Variables & Components
	private static final Color BACKGROUND_COLOUR1 = new Color(29, 29, 94);
	private static final Color BACKGROUND_COLOUR2 = new Color(46, 63, 173);
	private static final Color BACKGROUND_COLOUR3 = new Color(53, 100, 204);
	private static final Color BACKGROUND_COLOUR4 = new Color(92, 142, 228);
	private static final Color BACKGROUND_COLOUR5 = new Color(158, 184, 241);
	private static final Color BACKGROUND_COLOUR6 = new Color(204, 224, 255);
	private static final Color BACKGROUND_COLOUR7 = new Color(242, 248, 255);
	private Color foregroundColour;
	private static final int SCREEN_WIDTH = 1520;
	private static final int GRID_ROW = 1;
	private static final int GRID_COLUMN = 3;
	private static final int TOOLBAR_HEIGHT = 75;
	private static final int WEEK_ONE = 7;
	private static final int WEEK_TWO = 14;
	private static final int WEEK_THREE = 21;
	private static final int WEEK_FOUR = 28;
	private static final int WEEK_FIVE = 35;
	private static final int WEEK_SIX = 42;
	private static final int WEEK_SEVEN = 49;
	private static final int FIRST_DAY = 1;
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
		frame.getContentPane().setBackground(Color.WHITE);

		// foregroundColor is set to White for the first 7 seven Days, Black for the
		// remaining
		if (clickedDay <= WEEK_ONE) {
			foregroundColour = Color.WHITE;
		} else {
			foregroundColour = Color.BLACK;
		}

		// Create Previous, Next, and Home Buttons, add them to a toolbarPanel
		previous = new PreviousButton(frame, currentDayIndex, foregroundColour);
		next = new NextButton(frame, currentDayIndex, foregroundColour);
		if (clickedDay == FIRST_DAY) {
			previous.setName("Start Counting");
		}
		if (clickedDay == WEEK_SEVEN) {
			next.setName("Start Counting");
		}
		home = new HomeButton(frame, SCREEN_WIDTH, foregroundColour);
		toolbarPanel = new JPanel(new GridLayout(GRID_ROW, GRID_COLUMN));
		toolbarPanel.setPreferredSize(new Dimension(SCREEN_WIDTH, TOOLBAR_HEIGHT));
		toolbarPanel.add(previous);
		toolbarPanel.add(home);
		toolbarPanel.add(next);
		frame.add(toolbarPanel, BorderLayout.NORTH);
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		frame.add(mainPanel, BorderLayout.CENTER);

		// Implements the specific day's content
		specificDayLayout(mainPanel, clickedDay);

		// Change Colour depending on Day
		if (clickedDay <= WEEK_ONE) {
			toolbarPanel.setBackground(BACKGROUND_COLOUR1);
		} else if (clickedDay <= WEEK_TWO) {
			toolbarPanel.setBackground(BACKGROUND_COLOUR2);
		} else if (clickedDay <= WEEK_THREE) {
			toolbarPanel.setBackground(BACKGROUND_COLOUR3);
		} else if (clickedDay <= WEEK_FOUR) {
			toolbarPanel.setBackground(BACKGROUND_COLOUR4);
		} else if (clickedDay <= WEEK_FIVE) {
			toolbarPanel.setBackground(BACKGROUND_COLOUR5);
		} else if (clickedDay <= WEEK_SIX) {
			toolbarPanel.setBackground(BACKGROUND_COLOUR6);
		} else if (clickedDay <= WEEK_SEVEN) {
			toolbarPanel.setBackground(BACKGROUND_COLOUR7);
		}

		// Repaints the updated Frame
		frame.revalidate();
		frame.repaint();
	}// DayLayout

	// Returns the HashMap with all DayContents stored and associated Day
	protected abstract HashMap<Integer, DayContent> getDayContentHashMap();

	// Abstract specificDayLayout
	protected abstract void specificDayLayout(JPanel mainPanel, int clickedDay);

}// DayLayout