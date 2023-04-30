package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class DayLayoutList extends DayLayout {

	// Instantiated Variables & Components
	private int startLoop = 1;
	private int startDay = 1;
	private int specificDay;
	private String[] characteristics = { "Chesed", "Gevurah", "Tiferet", "Netzach", "Hod", "Yesod", "Malchut" };
	private JLabel[] dayLabels = new JLabel[50];
	private JLabel[] lessonLabels = new JLabel[50];
	private DayContent[] dayContentArray = new DayContent[50];
	public static int lastDayGlobal;
	protected static HashMap<Integer, DayContent> dayContentHashMap = new HashMap<Integer, DayContent>();

	public DayLayoutList(JFrame mainFrame, int clickedDay) {
		super(mainFrame, clickedDay);
		this.frame = mainFrame;
		this.specificDay = clickedDay;
		this.lastDayGlobal = clickedDay;

		mainPanel.setLayout(new GridLayout(0, 1));

		try {
			for (int i = 1; i <= 49; i++) {
				File file = new File("Main/DayFiles/Day" + i);
				Scanner scanner = new Scanner(file);

				String lessonString = scanner.nextLine();
				String activityString = scanner.nextLine();
				String blessingStringEnglish = scanner.nextLine();
				String blessingStringHebrew = scanner.nextLine();

				lessonLabels[i] = new JLabel("<html><b>Lesson</b>" + "<br>" + lessonString + "<br>" + "<br>" + "<br>"
						+ "<br>" + "<b>Activity</b>" + "<br>" + activityString + "<br>" + "<br>" + "<br>" + "<br>"
						+ "<b>Blessing</b>" + "<br>"
						+ "Barukh ata Adonai Eloheinu Melekh ha’Olam asher kid’shanu b’mitzvotav v’tizivanu al sefirat ha’omer."
						+ "<br>" + blessingStringHebrew + "<br>"
						+ "Blessed are you, lord our God, Ruler of the universe, who sanctifies us with holy laws, and commands us to be aware of the Counting of the Omer."
						+ "<br>" + blessingStringEnglish + "</html>");

				scanner.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// All DayLabels, lessonLabels, and DayContents
		for (int i = 0; i < characteristics.length; i++) {
			for (int j = 0; j < characteristics.length; j++) {
				String labelText = "<html><div style='text-align: center;'>Day " + startDay + "<br>"
						+ characteristics[j] + " within " + characteristics[i] + "</div></html>";
				dayLabels[startLoop] = new JLabel(labelText);
				dayLabels[startLoop].setHorizontalAlignment(SwingConstants.CENTER);
				DayContent dayContent = new DayContent(dayLabels[startLoop], lessonLabels[startLoop]);
				dayContentArray[startLoop] = dayContent;
				dayContentHashMap.put(startLoop, dayContentArray[startLoop]);
				startLoop++;
				startDay++;
			}
		}

		specificDayLayout(mainPanel, specificDay);
	}

	@Override
	protected void specificDayLayout(JPanel mainPanel, int clickedDay) {

		if (dayContentHashMap == null) {
			System.out.println("HashMap is Empty");
		}

		DayContent dayContent = getDayContentHashMap().get(clickedDay);

		if (dayContent != null) {
			JPanel dayPanel = new JPanel(new BorderLayout());
			dayContent.getLabel().setForeground(Color.BLACK);
			dayContent.getLabel().setFont(new Font(dayContent.getLabel().getText(), Font.BOLD, 25));
			dayContent.getTextArea().setForeground(Color.BLACK);
			dayContent.getTextArea().setFont(new Font(dayContent.getTextArea().getText(), Font.PLAIN, 20));
			dayContent.getLabel().setHorizontalAlignment(JLabel.CENTER);
			dayContent.getTextArea().setHorizontalAlignment(JLabel.CENTER);
			dayPanel.add(dayContent.getLabel(), BorderLayout.NORTH);
			dayPanel.add(dayContent.getTextArea(), BorderLayout.CENTER);
			dayPanel.setBackground(Color.white);
			dayContent.getLabel().setForeground(Color.BLACK);
			dayContent.getTextArea().setForeground(Color.BLACK);

			mainPanel.removeAll();
			mainPanel.setBorder(BorderFactory.createEmptyBorder(40, 220, 40, 220));
			mainPanel.setBackground(Color.white);
			mainPanel.add(dayPanel);
			mainPanel.revalidate();
			mainPanel.repaint();
		}
	}

	@Override
	protected HashMap<Integer, DayContent> getDayContentHashMap() {
		return dayContentHashMap;
	}// getDayContentHashMap
}// DayLayoutList