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

/**
 * Class: DayLayoutList
 * 
 * @author Richelle Elkes <br>
 *         Purpose: Class that creates and stores each Day's specific content
 *         and layout in a HashMap and displays the clickedDay's content <br>
 *         Restrictions: None
 * @ReferencedClasses DayLayout, DayContent
 */
public class DayLayoutList extends DayLayout {

	// Instantiated Variables & Components
	private static final int GRID_COLUMN = 1;
	private static final int HEADER_FONT_SIZE = 25;
	private static final int FONT_SIZE = 20;
	private static final int VERTICAL_GAP = 40;
	private static final int HORIZONTAL_GAP = 220;
	private static final int LAST_DAY = 49;
	private int startLoop = 1;
	private int startDay = 1;
	private static int specificDay;
	public static int lastDayGlobal;
	private String selectedLanguage = Main.selectedLanguage;
	protected static HashMap<Integer, DayContent> dayContentHashMap = new HashMap<Integer, DayContent>();
	private String[] characteristics = { "Chesed", "Gevurah", "Tiferet", "Netzach", "Hod", "Yesod", "Malchut" };
	private String[] characteristicsHebrew = { "חסד", "גבורה", "תפארת", "נצח", "הוד", "יסוד", "מלכות" };
	private DayContent[] dayContentArray = new DayContent[50];
	private JLabel[] dayLabels = new JLabel[50];
	private JLabel[] lessonLabels = new JLabel[50];

	public DayLayoutList(JFrame mainFrame, int clickedDay) {
		super(mainFrame, clickedDay);
		this.frame = mainFrame;
		DayLayoutList.specificDay = clickedDay;
		DayLayoutList.lastDayGlobal = clickedDay;

		mainPanel.setLayout(new GridLayout(0, GRID_COLUMN));

		// Reads individual lines from Day file to get the Lesson, Activity, and
		// Blessing Strings

		try {

			// Creates individual JLabels for each Day's contents
			if (selectedLanguage.equals("Hebrew")) {

				for (int i = startLoop; i <= LAST_DAY; i++) {
					File file = new File("Main/DayFiles/Day" + i);
					Scanner scanner = new Scanner(file);

					scanner.nextLine();
					scanner.nextLine();
					scanner.nextLine();
					String blessingStringHebrew = scanner.nextLine();
					scanner.nextLine();
					String lessonStringHeb = scanner.nextLine();
					String activityStringHeb = scanner.nextLine();
					String blessingStringEnglishHeb = scanner.nextLine();

					lessonLabels[i] = new JLabel("<html><div style='text-align: right;'><b>שִׁיעוּר</b>" + "<br>"
							+ lessonStringHeb + "<br>" + "<br>" + "<br>" + "<br>" + "<b>פעילות</b>" + "<br>"
							+ activityStringHeb + "<br>" + "<br>" + "<br>" + "<br>" + "<b>ברכה</b>" + "<br>"
							+ "Barukh ata Adonai Eloheinu Melekh ha’Olam asher kid’shanu b’mitzvotav v’tizivanu al sefirat ha’omer."
							+ "<br>" + blessingStringEnglishHeb + "<br>"
							+ "בָּרוּךְ אַתָּה יְהוָה אֱלֹהֵינוּ מֶלֶךְ הָעוֹלָם, אֲשֶׁר קִדְּשָׁנוּ בְּמִצְוֹתָיו וְצִוָּנוּ עַל סְפִירַת הָעֹמֶר."
							+ "<br>" + blessingStringHebrew + "</div></html>");
					scanner.close();

				}
			}

			else {
				for (int i = startLoop; i <= LAST_DAY; i++) {
					File file = new File("Main/DayFiles/Day" + i);
					Scanner scanner = new Scanner(file);

					String lessonString = scanner.nextLine();
					String activityString = scanner.nextLine();
					String blessingStringEnglish = scanner.nextLine();
					String blessingStringHebrew = scanner.nextLine();

					lessonLabels[i] = new JLabel("<html><b>Lesson</b>" + "<br>" + lessonString + "<br>" + "<br>"
							+ "<br>" + "<br>" + "<b>Activity</b>" + "<br>" + activityString + "<br>" + "<br>" + "<br>"
							+ "<br>" + "<b>Blessing</b>" + "<br>"
							+ "Barukh ata Adonai Eloheinu Melekh ha’Olam asher kid’shanu b’mitzvotav v’tizivanu al sefirat ha’omer."
							+ "<br>" + blessingStringHebrew + "<br>"
							+ "Blessed are you, lord our God, Ruler of the universe, who sanctifies us with holy laws, and commands us to be aware of the Counting of the Omer."
							+ "<br>" + blessingStringEnglish + "</html>");
					scanner.close();

				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// All dayLabels, lessonLabels, and dayContents
		if (selectedLanguage.equals("Hebrew")) {
			for (int i = 0; i < characteristicsHebrew.length; i++) {
				for (int j = 0; j < characteristicsHebrew.length; j++) {
					// Convert i (Day number) to Hebrew
					 String hebrewDay = toHebrewNumber(startDay); 
					 String labelText = "<html><div style='text-align: right;'>יום " + hebrewDay
                             + "<br>" + characteristicsHebrew[j] + " בתוך " + characteristicsHebrew[i] 
                             + "</div></html>";

				        dayLabels[startLoop] = new JLabel(labelText);
				        dayLabels[startLoop].setHorizontalAlignment(SwingConstants.RIGHT);
				        DayContent dayContent = new DayContent(dayLabels[startLoop], lessonLabels[startLoop]);
				        dayContentArray[startLoop] = dayContent;

				        // HashMap for mapping the dayContent to the associated Day
				        dayContentHashMap.put(startLoop, dayContentArray[startLoop]);
				        startLoop++;
				        startDay++;
				    }
				}
		}

		else {
			for (int i = 0; i < characteristics.length; i++) {
				for (int j = 0; j < characteristics.length; j++) {
					String labelText = "<html><div style='text-align: center;'>Day " + startDay + "<br>"
							+ characteristics[j] + " within " + characteristics[i] + "</div></html>";
					dayLabels[startLoop] = new JLabel(labelText);
					dayLabels[startLoop].setHorizontalAlignment(SwingConstants.CENTER);
					DayContent dayContent = new DayContent(dayLabels[startLoop], lessonLabels[startLoop]);
					dayContentArray[startLoop] = dayContent;

					// HashMap for mapping the dayContent to the associated Day
					dayContentHashMap.put(startLoop, dayContentArray[startLoop]);
					startLoop++;
					startDay++;
				}
			}
		}

		// Calls specificDayLayout to implement the specific Day's content
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
			dayContent.getLabel().setFont(new Font(dayContent.getLabel().getText(), Font.BOLD, HEADER_FONT_SIZE));
			dayContent.getTextArea().setForeground(Color.BLACK);
			dayContent.getTextArea().setFont(new Font(dayContent.getTextArea().getText(), Font.PLAIN, FONT_SIZE));
			dayContent.getLabel().setHorizontalAlignment(JLabel.CENTER);
			dayContent.getTextArea().setHorizontalAlignment(JLabel.CENTER);
			dayPanel.add(dayContent.getLabel(), BorderLayout.NORTH);
			dayPanel.add(dayContent.getTextArea(), BorderLayout.CENTER);
			dayPanel.setBackground(Color.WHITE);
			dayContent.getLabel().setForeground(Color.BLACK);
			dayContent.getTextArea().setForeground(Color.BLACK);

			// Clears mainPanel from previous content, sets the layout, repaints updated
			// Panel
			mainPanel.removeAll();
			mainPanel.setBorder(
					BorderFactory.createEmptyBorder(VERTICAL_GAP, HORIZONTAL_GAP, VERTICAL_GAP, HORIZONTAL_GAP));
			mainPanel.setBackground(Color.WHITE);
			mainPanel.add(dayPanel);
			mainPanel.revalidate();
			mainPanel.repaint();
		}
	}

	@Override
	protected HashMap<Integer, DayContent> getDayContentHashMap() {
		return dayContentHashMap;
	}

	// Converts English numbers to Hebrew nunbers
	public static String toHebrewNumber(int number) {
		String[] hebrewOnes = { "", "א", "ב", "ג", "ד", "ה", "ו", "ז", "ח", "ט" };
		String[] hebrewTens = { "", "י", "כ", "ל", "מ", "נ", "ס", "ע", "פ", "צ" };
		String[] hebrewTensAbove20 = { "", "עשר", "עשרים", "שלושים", "ארבעים", "חמישים" };
		StringBuilder sb = new StringBuilder();
		if (number == 50) {
			return "נ";
		}
		int ones = number % 10;
		int tens = number / 10;
		if (tens == 5) {
			sb.append(hebrewTensAbove20[5]);
		} else {
			if (tens > 0) {
				sb.append(hebrewTens[tens]);
			}
		}
		if (ones > 0 || number == 0) {
			sb.append(hebrewOnes[ones]);
		}
		return sb.toString();
		
	}// toHebrewNumber
}// DayLayoutList