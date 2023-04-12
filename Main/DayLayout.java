package Main;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class DayLayout extends JPanel {

	// Instantiated Variables

	protected JFrame frame;
	protected JPanel mainPanel;
	protected JPanel toolbarPanel;
	protected int currentDayIndex;
	private JButton previous;
	private JButton next;
	private JButton home;

	public DayLayout(JFrame mainFrame, int clickedDay) {
		this.frame = mainFrame;
		this.currentDayIndex = clickedDay;

		setLayout(new BorderLayout());

		previous = new JButton("Previous Day");
		previous.setName("Previous Day");
		previous.addActionListener(new ButtonListenerImplemented(previous, frame));

		next = new JButton("Next Day");
		next.setName("Next Day");
		next.addActionListener(new ButtonListenerImplemented(next, frame));

		home = new JButton("Home");
		home.setName("Home");
		home.addActionListener(new ButtonListenerImplemented(home, frame));

		toolbarPanel = new JPanel(new GridLayout(1, 3));
		toolbarPanel.add(previous);
		toolbarPanel.add(next);
		toolbarPanel.add(home);
		add(toolbarPanel, BorderLayout.NORTH);

		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(0, 1));
		add(mainPanel, BorderLayout.SOUTH);

		specificDayLayout(mainPanel, clickedDay);
		
		frame.revalidate();
		frame.repaint();
		setVisible(true);

	}

	protected abstract HashMap<Integer, DayContent> getDayContentHashMap();

	protected void specificDayLayout(JPanel mainPanel, int clickedDay) {

		DayContent dayContent = getDayContentHashMap().get(clickedDay);
		mainPanel.add(dayContent.getLabel());
		mainPanel.add(dayContent.getTextArea());
	}

}
