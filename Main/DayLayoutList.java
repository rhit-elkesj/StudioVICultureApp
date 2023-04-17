package Main;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class DayLayoutList extends DayLayout {

	// Instantiated Variables & Components
	private int startLabel = 1;
	private int startDay = 1;
	private int specificDay;
	private String[] characteristics = { "Chesed", "Gevurah", "Tiferet", "Netzach", "Hod", "Yesod", "Malchut" };
	private JLabel[] dayLabels = new JLabel[50];
	private HashMap<Integer, DayContent> dayContentHashMap = new HashMap<Integer, DayContent>();
	private JFrame frame;

	public DayLayoutList(JFrame mainFrame, int clickedDay) {
		super(mainFrame, clickedDay);
		this.frame = mainFrame;
		this.specificDay = clickedDay;

		mainPanel.setLayout(new GridLayout(0, 1));

		for (int i = 0; i < characteristics.length; i++) {
			for (int j = 0; j < characteristics.length; j++) {
				String labelText = "<html><div style='text-align: center;'>Day " + startDay + "<br>"
						+ characteristics[j] + " within " + characteristics[i] + "</div></html>";
				dayLabels[startLabel] = new JLabel(labelText);
				dayLabels[startLabel].setHorizontalAlignment(SwingConstants.CENTER);

				JLabel oneLesson = new JLabel("<html>Lesson" + "<br>" + "<br>" + "<br>" + "<br>" + "<br>" + "<br>"
						+ "<br>" + "Activity" + "<br>" + "<br>" + "<br>" + "<br>" + "<br>" + "<br>" + "<br>"
						+ "Blessing" + "</html>");

				DayContent dayContent1 = new DayContent(dayLabels[startLabel], oneLesson);
				dayContentHashMap.put(startDay, dayContent1);
				startDay++;
				startLabel++;
			}
		}
		specificDayLayout(mainPanel, specificDay);
	}// DayLayoutList

	@Override
	protected void specificDayLayout(JPanel mainPanel, int clickedDay) {
		System.out.println(clickedDay);
		if (dayContentHashMap == null) {
			dayContentHashMap = new HashMap<Integer, DayContent>();
		}
		DayContent dayContent = getDayContentHashMap().get(clickedDay);

		if (dayContent != null) {
			JPanel dayPanel = new JPanel(new BorderLayout());
			dayPanel.add(dayContent.getLabel(), BorderLayout.NORTH);
			dayPanel.add(dayContent.getTextArea(), BorderLayout.CENTER);
			mainPanel.add(dayPanel);

			frame.add(mainPanel);
			frame.revalidate();
			frame.repaint();
		} else {
			System.out.println("No content found for the selected day.");
		}
	}// specificDayLayout

	@Override
	protected HashMap<Integer, DayContent> getDayContentHashMap() {
		return dayContentHashMap;

	}// getDayContent
}// DayLayout
