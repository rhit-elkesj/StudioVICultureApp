package Main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.HashMap;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class DayLayout extends JPanel {

	// Instantiated Variables & Components
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

		previous = new JButton("Previous Day");
		previous.setName("Previous Day");
		previous.setPreferredSize(new Dimension(100, 50));
		previous.addActionListener(new ButtonListenerImplemented(previous, frame, currentDayIndex));
		previous.setOpaque(false);
		previous.setContentAreaFilled(false);
		previous.setBorderPainted(false);

		next = new JButton("Next Day");
		next.setName("Next Day");
		next.addActionListener(new ButtonListenerImplemented(next, frame, currentDayIndex));
		next.setOpaque(false);
		next.setContentAreaFilled(false);
		next.setBorderPainted(false);

		home = new JButton("Home");
		home.setName("Home");
		home.addActionListener(new ButtonListenerImplemented(home, frame));
		home.setOpaque(false);
		home.setContentAreaFilled(false);
		home.setBorderPainted(false);

		toolbarPanel = new JPanel(new GridLayout(1, 3));
		toolbarPanel.add(previous);
		toolbarPanel.add(home);
		toolbarPanel.add(next);
		frame.add(toolbarPanel, BorderLayout.NORTH);

		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		frame.add(mainPanel, BorderLayout.CENTER);

		specificDayLayout(mainPanel, clickedDay);

		setVisible(true);

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
