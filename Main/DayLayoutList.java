package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.HashMap;

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
	private String[] lessonString = new String[50];
	private String[] activityString = new String[50];
	private String[] blessingStringEnglish = new String[50];
	private String[] blessingStringHebrew = new String[50];
	private JLabel[] dayLabels = new JLabel[50];
	private JLabel[] lessonLabels = new JLabel[50];
	private DayContent[] dayContentArray = new DayContent[50];
	public static int lastDayGlobal;
	protected static HashMap<Integer, DayContent> dayContentHashMap = new HashMap<Integer, DayContent>();
	private JFrame frame;

	public DayLayoutList(JFrame mainFrame, int clickedDay) {
		super(mainFrame, clickedDay);
		this.frame = mainFrame;
		this.specificDay = clickedDay;
		this.lastDayGlobal = clickedDay;

		mainPanel.setLayout(new GridLayout(0, 1));

		// Adding all lessonStrings, activityStrings, and blessingStrings
		lessonString[1] = "Love is the single most vital component in life, for it is the origin and foundation of all human interaction. It’s both giving and receiving, to experience another person and to have that person experience you. It’s the tool which we learn to experience the highest reality, God.";
		activityString[1] = "Ask yourself questions that reflect yourself as a person and others that are around you in terms of love.";
		blessingStringEnglish[1] = "Today is Day One of the Omer.";

		lessonString[2] = "Healthy love must always include discipline, a degree of respect for one another. Love must be tempered and directed properly. Love with discretion is necessary to avoid giving it to those that don’t deserve it.";
		activityString[2] = "Help someone and follow their instructions to the letter, regardless of effort.";
		blessingStringEnglish[2] = "Today is Two Days of the Omer.";

		lessonString[3] = "There is love and there is beautiful love. True love includes empathy and compassion which makes it a beautiful love, which calls for helping all.";
		activityString[3] = "Offer a helping hand to a stranger.";
		blessingStringEnglish[3] = "Today is Three Days of the Omer.";

		lessonString[4] = "The strength of one’s love is determined by its spirit and valor. Strength to endure any challenge and set back to fight for the love that you have.";
		activityString[4] = "Do something that requires a lot of effort for someone you care about.";
		blessingStringEnglish[4] = "Today is Four Days of the Omer.";

		lessonString[5] = "Arrogant love is not love. One must be able to forgive or give in to the other you love just in the name of love even if the one you love isn’t right.";
		activityString[5] = "Make amends with someone you fought with and admit the wrong that you've committed, don’t blame the person you fought against.";
		blessingStringEnglish[5] = "Today is Five Days of the Omer.";

		lessonString[6] = "Eternal love requires bonding, a sense of togetherness which brings the love for one another in joint effort benefitting everyone.";
		activityString[6] = "Start a hobby that you will enjoy doing with someone you care about.";
		blessingStringEnglish[6] = "Today is Six Days of the Omer.";

		lessonString[7] = "Any love that breaks the human spirit isn’t love. Mature love comes with person dignity, where you are aware that you have a special place and contribution in this world.";
		activityString[7] = "Reflect and find an aspect about a relationship that makes it strong and celebrate that aspect.";
		blessingStringEnglish[7] = "Today is Seven Days, which is One Week of the Omer.";

		lessonString[8] = "The intention of discipline and punishment isn’t negative, but an expression of love. For we wish the best for our loved ones and therefore help them be aware of anything less good behavior.";
		activityString[8] = "Before you punish someone for doing something bad, consider if your reasoning for punishment is out of love or through some other means.";
		blessingStringEnglish[8] = "Today is Eight Days, which is One Week and One Day of the Omer.";

		lessonString[9] = "The amount of discipline that you give yourself is very important for a healthy life. Therefore, we must be aware of how much we give to ourselves and if we’re doing it in a healthy way.";
		activityString[9] = "Write out a day plan on what you would like to do today and see if you’ve completed your plan by the end of the day.";
		blessingStringEnglish[9] = "Today is Nine Days, which is One Week and Two Days of the Omer.";

		lessonString[10] = "Discipline is driven through love and through compassion. Compassion is unconditional love, it’s just for the sake of love and not for recognizing one’s merits and positive qualities. You love for no reason; you love because you reflect God.";
		activityString[10] = "Show sympathy or concern for someone you have scolded or disapproved of.";
		blessingStringEnglish[10] = "Today is Ten Days, which is One Week and Three Days of the Omer.";

		lessonString[11] = "Effective discipline must be enduring and tenacious.";
		activityString[11] = "Extend the plan that you wrote on day 9 for a longer period, including goals of various length in terms of time. Check if you are completing the plan and update the plan each day based on how you did.";
		blessingStringEnglish[11] = "Today is Eleven Days, which is One Week and Four Days of the Omer.";

		lessonString[12] = "A judge must be the humblest of creatures, recognizing that he sits in judgment not by his own merit but only because God gave him the right to judge.";
		activityString[12] = "Attempt to describe someone from their perspective and not your own. In other words, be selfless and not biased.";
		blessingStringEnglish[12] = "Today is Twelve Days, which is One Week and Five Days of the Omer.";

		lessonString[13] = "For discipline to be effective, it must be coupled with bonding. Both in disciplining yourself and others one can gain a sense that the discipling is important for developing a stronger bond.";
		activityString[13] = "Explain to a younger sibling or to someone who looks up to you why your relationship with him/her is important in terms of growth and discipline.";
		blessingStringEnglish[13] = "Today is Thirteen Days, which is One Week and Six Days of the Omer.";

		lessonString[14] = "Discipline must be able to enhance personal dignity, like love. Through healthy discipline, one can bolder one's self-esteem and help bring out the best in themselves.";
		activityString[14] = "Make sure to treat others fairly and with respect, especially when there’s discipline involved.";
		blessingStringEnglish[14] = "Today is Fourteen Days, which is Two Weeks of the Omer.";

		lessonString[15] = "One must be able to examine the love aspect of compassion and understand how others perceive the compassion that you give.";
		activityString[15] = "When helping others, make sure to offer a smile or loving gesture and give it your all.";
		blessingStringEnglish[15] = "Today is Fifteen Days, which is Two Weeks and One Day of the Omer.";

		lessonString[16] = "For compassion to be effective and healthy, it requires discipline and focus. You must be able to recognize how much compassion should be expressed to others and to yourself in any situation.";
		activityString[16] = "Help someone by addressing their specific needs, whatever the needs might be.";
		blessingStringEnglish[16] = "Today is Sixteen Days, which is Two Weeks and Two Days of the Omer.";

		lessonString[17] = "True compassion is limitless. It’s not an extension of your needs or limited perspective. Compassion for others is achieved by having a selfless attitude, rising above yourself and placing yourself in the other person’s situation.";
		activityString[17] = "Express concern to someone whom you were hard on, whether it was intentional or by mistake.";
		blessingStringEnglish[17] = "Today is Seventeen Days, which is Two Weeks and Three Days of the Omer.";

		lessonString[18] = "You need to be aware if your compassion is consistent and reliable.";
		activityString[18] = "Take a moment of your day and help bring someone’s spirit up or provide sympathy for that individual, even if your day is a busy one.";
		blessingStringEnglish[18] = "Today is Eighteen Days, which is Two Weeks and Four Days of the Omer.";

		lessonString[19] = "Compassion must include humility, for it’s the acknowledgement that by creating one who needs compassion, God gave me the gift of being able to bestow compassion.";
		activityString[19] = "Express concern to someone with no reward in mind. Do so anonymously in other words.";
		blessingStringEnglish[19] = "Today is Nineteen Days, which is Two Weeks and Five Days of the Omer.";

		lessonString[20] = "For true compassion, it required bonding. It requires creating a bond between giver and receiver that lives beyond the moment of need.";
		activityString[20] = "Express concern to someone such that the issue is resolved and doesn’t appear again.";
		blessingStringEnglish[20] = "Today is Twenty Days, which is Two Weeks and Six Days of the Omer.";

		lessonString[21] = "For compassion to be complete, it must recognize and appreciate one as an individual. It should boost self-esteem and help cultivate human dignity.";
		activityString[21] = "When expressing concern to someone, do so in a way that helps boost that person’s confidence that all will be alright.";
		blessingStringEnglish[21] = "Today is Twenty-One Days, which is Three Weeks of the Omer.";

		lessonString[22] = "For anything to endure, it needs a loving and caring attitude, it requires patience and not aggression.";
		activityString[22] = "When reaching a goal or completing a task, make sure that you're taking a non-violent approach.";
		blessingStringEnglish[22] = "Today is Twenty-Two Days, which is Three Weeks and One Day of the Omer.";

		lessonString[23] = "Endurance must be directed toward productive goals and expressed in a constructive manner.";
		activityString[23] = "Break one bad habit that you're known to make.";
		blessingStringEnglish[23] = "Today is Twenty-Three Days, which is Three Weeks and Two Days of the Omer.";

		lessonString[24] = "The compassion of endurance reflects the beautiful quality of endurance that an enduring commitment is to help another grow, especially for those who are less fortunate. Otherwise, it would be misguided and selfish.";
		activityString[24] = "Have a conversation with someone who usually makes you impatient and try to be more patient while ensuring that you're listening to that person.";
		blessingStringEnglish[24] = "Today is Twenty-Four Days, which is Three Weeks and Three Days of the Omer.";

		lessonString[25] = "Every human being has the willpower and capacity to endure much more than we can imagine, to prevail under the most trying of circumstances.";
		activityString[25] = "Make it a goal to develop a new good habit.";
		blessingStringEnglish[25] = "Today is Twenty-Five Days, which is Three Weeks and Four Days of the Omer. ";

		lessonString[26] = "Yielding, which is a result of humility, is a crucial part of endurance, for it is fueled by one’s inner strength.";
		activityString[26] = "Before starting your day, thank God for being with you and giving you the strength to get through the great day you're going to have today.";
		blessingStringEnglish[26] = "Today is Twenty-Six Days, which is Three Weeks and Five Days of the Omer.";

		lessonString[27] = "Bonding is an essential quality of endurance, for it expresses your commitment to the person or experience you’re bond with, a commitment so powerful that you will ensure all to preserve it.";
		activityString[27] = "Perform a deed that shows your commitment to God.";
		blessingStringEnglish[27] = "Today is Twenty-Seven Days, which is Three Weeks and Six Days of the Omer.";

		lessonString[28] = "Sovereignty is the cornerstone of endurance, for it helps you check if your endurance is dignified.";
		activityString[28] = "Support a just cause.";
		blessingStringEnglish[28] = "Today is Twenty-Eight Days, which is Four Weeks of the Omer";

		lessonString[29] = "Humility brings love and joy, giving you the ability to rise above yourself and love another.";
		activityString[29] = "Before praying to God, make sure to provide charity to others, which will enhance your prayers.";
		blessingStringEnglish[29] = "Today is Twenty-Nine Days, which is Four Weeks and One Day of the Omer.";

		lessonString[30] = "Humility must be disciplined to ensure that includes respect and awe for the person or experience you stand humble for.";
		activityString[30] = "Attempt to get over your reluctance to do something in a safe and healthy manner.";
		blessingStringEnglish[30] = "Today is Thirty Days, which is Four Weeks and Two Days of the Omer.";

		lessonString[31] = "Just as humility brings compassion, compassion can lead one to humility.";
		activityString[31] = "Be sure to be modest when expressing concern for someone.";
		blessingStringEnglish[31] = "Today is Thirty-One Days, which is Four Weeks and Three Days of the Omer.";

		lessonString[32] = "Humility shouldn’t cause one to feel weak and insecure, it should instead give you enduring strength.";
		activityString[32] = "Start or participate in a good cause.";
		blessingStringEnglish[32] = "Today is Thirty-Two Days, which is Four Weeks and Four Days of the Omer.";

		lessonString[33] = "Everyone has humility and modesty in their hearts. The question is the measure and way in which one feels it.  In general, one must be sure that their humility is genuine.";
		activityString[33] = "Be humble with whatever you do.";
		blessingStringEnglish[33] = "Today is Thirty-Three Days, which is Four Weeks and Five Days of the Omer.";

		lessonString[34] = "Humility shouldn’t be a lonely experience. It should instead result in deep bonding and commitment. There’s no stronger bond than one that comes out of humility.";
		activityString[34] = "Make sure that the humble deed you perform had a lasting effect instead of fading away after a little while.";
		blessingStringEnglish[34] = "Today is Thirty-Four Days, which is Four Weeks and Six Days of the Omer.";

		lessonString[35] = "Dignity is the essence of humility and modesty. Humility that suppresses the human spirit isn’t humility at all.";
		activityString[35] = "Teach someone why being humble and modest makes you a better human being.";
		blessingStringEnglish[35] = "Today is Thirty-Five Days, which is Five Weeks of the Omer. ";

		lessonString[36] = "Love is the heart of bonding, for it establishes a base which allows bonding to build on.";
		activityString[36] = "Demonstrate how much you care about someone through a friendly or loving manner.";
		blessingStringEnglish[36] = "Today is Thirty-Six Days, which is Five Weeks and One Day of the Omer.";

		lessonString[37] = "Bonding must be done with careful consideration with whom and with what you bond. You need to know when to respect someone’s personal space.";
		activityString[37] = "Reflect on your relationship with someone and see if closure is needed. Closure as in you talk about any problems that you have with the relationship and make it a goal to fix it.";
		blessingStringEnglish[37] = "Today is Thirty-Seven Days, which is Five Weeks and Two Days of the Omer.";

		lessonString[38] = "Bonding needs to be compassionate and loving, feeling and understanding one’s pain.";
		activityString[38] = "Offer help to someone who went through a bad ordeal of some kind.";
		blessingStringEnglish[38] = "Today is Thirty-Eight Days, which is Five Weeks and Three Days of the Omer.";

		lessonString[39] = "An essential component of bonding is its endurance, its ability to withstand setbacks and challenges.";
		activityString[39] = "If there’s a problem in your relationship with someone, do what you can to overcome it.";
		blessingStringEnglish[39] = "Today is Thirty-Nine Days, which is Five Weeks and Four Days of the Omer.";

		lessonString[40] = "Humility is essential in healthy bonding, for it allows you to appreciate another person. Healthy bonding is the union of two distinct people, with independent personalities, who join for a higher purpose than satisfying their own needs.";
		activityString[40] = "When performing your next prayer, thank God for helping you bond with specific individuals.";
		blessingStringEnglish[40] = "Today is Forty Days, which is Five Weeks and Five Days of the Omer.";

		lessonString[41] = "Every person needs and has the capacity to bond with other people, with significant undertakings and with meaningful experiences. When you bond in one area of your life, it helps you bond in other areas. Remember, God gave you a divine soul that is nurturing and loving, so you must learn to recognize the voice within so that you can experience other people’s souls and hearts, which can help you recognize the people who you can truly trust.";
		activityString[41] = "Commit sometime during each day or week to bonding with someone new or expressing your love for someone.";
		blessingStringEnglish[41] = "Today is Forty-One Days, which is Five Weeks and Six Days of the Omer.";

		lessonString[42] = "Bonding should help nurture and strengthen your own dignity and the dignity of the one you bond with.";
		activityString[42] = "Highlight various strengths of someone you know and emphasize them.";
		blessingStringEnglish[42] = "Today is Forty-Two Days, which is Six Weeks of the Omer.";

		lessonString[43] = "An effective leader needs to be warm and considerate.";
		activityString[43] = "Do something kind for someone who's less fortunate.";
		blessingStringEnglish[43] = "Today is Forty-Three Days, which is Six Weeks and One Day of the Omer.";

		lessonString[44] = "Effective leadership is built on authority and discipline, so you need to be aware of how you express the two to others and which areas in which you have proper jurisdiction and authority.";
		activityString[44] = "Before taking charge of something, make sure that you have what it takes to live up to the task.";
		blessingStringEnglish[44] = "Today is Forty-Four Days, which is Six Weeks and Two Days of the Omer.";

		lessonString[45] = "A good leader is a compassionate one, for harmony is critical for successful leadership.";
		activityString[45] = "Look back on how you take charge in something and see if there are ways to improve your current approach.";
		blessingStringEnglish[45] = "Today is Forty-Five Days, which is Six Weeks and Three Days of the Omer";

		lessonString[46] = "A person’s dignity and a leader’s success are through his level of endurance, for one’s determination and will reflect the power of his/her human spirit.";
		activityString[46] = "If you want to try something new, do it and take the chance.";
		blessingStringEnglish[46] = "Today is Forty-Six Days, which is Six Weeks and Four Days of the Omer.";

		lessonString[47] = "The ability to lead is God’s gift to everyone.";
		activityString[47] = "Thank God for creating you with respect for yourself.";
		blessingStringEnglish[47] = "Today is Forty-Seven Days, which is Six Weeks and Five Days of the Omer.";

		lessonString[48] = "Healthy independence shouldn't prevent you from bonding with others. On the contrary, self-confidence allows you to respect and trust another’s power and ultimately bond with him. As a result, the bond will strengthen your own power rather than weaken it.";
		activityString[48] = "Make a commitment to increasing your relationship with someone you're close to.";
		blessingStringEnglish[48] = "Today is Forty-Eight Days, which is Six Weeks and Six Days of the Omer.";

		lessonString[49] = "As a leader, you need to be aware of your uniqueness as a person.";
		activityString[49] = "Take a moment and concentrate on your true inner self, not on your performance or how you project to others; and be at peace knowing that God created you as a special person.";
		blessingStringEnglish[49] = "Today is Forty-Nine Days, which is Seven Weeks of the Omer.";

		blessingStringHebrew[1] = "Hayom yom echad la’omer.";
		blessingStringHebrew[2] = "Hayom yom sheni la’omer.";
		blessingStringHebrew[3] = "Hayom yom shlishi la’omer.";
		blessingStringHebrew[4] = "Hayom yom revi’i la’omer.";
		blessingStringHebrew[5] = "Hayom yom chamishi la’omer.";
		blessingStringHebrew[6] = "Hayom yom shishi la’omer.";
		blessingStringHebrew[7] = "Hayom yom shabbat la’omer.";
		blessingStringHebrew[8] = "Hayom yom rishon sh’b’shavuah echad la’omer.";
		blessingStringHebrew[9] = "Hayom yom sheni sh’b’shavuah echad la’omer.";
		blessingStringHebrew[10] = "Hayom yom shlishi sh’b’shavuah echad la’omer.";
		blessingStringHebrew[11] = "Hayom yom revi’i sh’b’shavuah echad la’omer.";
		blessingStringHebrew[12] = "Hayom yom chamishi sh’b’shavuah echad la’omer.";
		blessingStringHebrew[13] = "Hayom yom shishi sh’b’shavuah echad la’omer.";
		blessingStringHebrew[14] = "Hayom yom shabbat sh’b’shavuah echad la’omer.";
		blessingStringHebrew[15] = "Hayom yom rishon sh’b’shavuah shni la’omer.";
		blessingStringHebrew[16] = "Hayom yom sheni sh’b’shavuah shni la’omer.";
		blessingStringHebrew[17] = "Hayom yom shlishi sh’b’shavuah shni la’omer.";
		blessingStringHebrew[18] = "Hayom yom revi’i sh’b’shavuah shni la’omer.";
		blessingStringHebrew[19] = "Hayom yom chamishi sh’b’shavuah shni la’omer.";
		blessingStringHebrew[20] = "Hayom yom shishi sh’b’shavuah shni la’omer.";
		blessingStringHebrew[21] = "Hayom yom shabbat sh’b’shavuah shni la’omer.";
		blessingStringHebrew[22] = "Hayom yom rishon sh’b’shavuah shlishi la’omer.";
		blessingStringHebrew[23] = "Hayom yom sheni sh’b’shavuah shlishi la’omer.";
		blessingStringHebrew[24] = "Hayom yom shlishi sh’b’shavuah shlishi la’omer.";
		blessingStringHebrew[25] = "Hayom yom revi’i sh’b’shavuah shlishi la’omer.";
		blessingStringHebrew[26] = "Hayom yom esrim ve'sheva la'omer.";
		blessingStringHebrew[27] = "Hayom shloshim yom, she'hem shlosha shavuot v'yom echad la'omer.";
		blessingStringHebrew[28] = "Hayom shloshim ve'yom echad la'omer.";
		blessingStringHebrew[29] = "Hayom shloshim u'shtayim yom, she'hem arba'ah shavuot v'yom echad la'omer.";
		blessingStringHebrew[30] = "Hayom shloshim u'sheloshah yamim la'omer.";
		blessingStringHebrew[31] = "Hayom shloshim ve'arba'ah yom la'omer.";
		blessingStringHebrew[32] = "Hayom shloshim ve'chamishah yom la'omer.";
		blessingStringHebrew[33] = "Hayom shloshim ve'shesh yom la'omer.";
		blessingStringHebrew[34] = "Hayom shloshim u'shiva yom, she'hem shavuah echad v'shloshah yamim la'omer.";
		blessingStringHebrew[35] = "Hayom arbaim yom, she'hem shisha shavuot la'omer.";
		blessingStringHebrew[36] = "Hayom arbaim ve'yom echad la'omer.";
		blessingStringHebrew[37] = "Hayom arbaim u'shtayim yom, she'hem shivah shavuot v'yom echad la'omer.";
		blessingStringHebrew[38] = "Hayom arbaim u'sheloshah yamim la'omer.";
		blessingStringHebrew[39] = "Hayom arbaim ve'arba'ah yom la'omer.";
		blessingStringHebrew[40] = "Hayom arbaim ve'chamishah yom la'omer.";
		blessingStringHebrew[41] = "Hayom arbaim ve'shesh yom la'omer.";
		blessingStringHebrew[42] = "Hayom arbaim u'shiva yom, she'hem shavuah echad v'shloshah yamim la'omer.";
		blessingStringHebrew[43] = "Hayom chamishim yom la'omer.";
		blessingStringHebrew[44] = "Hayom chamishim u'shtayim yom la'omer.";
		blessingStringHebrew[45] = "Hayom chamishim u'sheloshah yamim la'omer.";
		blessingStringHebrew[46] = "Hayom chamishim ve'arba'ah yom la'omer.";
		blessingStringHebrew[47] = "Hayom chamishim ve'chamishah yom la'omer.";
		blessingStringHebrew[48] = "Hayom chamishim ve'shesh yom la'omer.";
		blessingStringHebrew[49] = "Hayom chamishim u'shiva yom la'omer.";

		// Adds all lessonLabels to the lessonLabelsArray
		for (int i = 1; i <= 49; i++) {
			lessonLabels[i] = new JLabel("<html><b>Lesson</b>" + "<br>" + lessonString[i] + "<br>" + "<br>" + "<br>"
					+ "<br>" + "<b>Activity</b>" + "<br>" + activityString[i] + "<br>" + "<br>" + "<br>" + "<br>"
					+ "<b>Blessing</b>" + "<br>"
					+ "Barukh ata Adonai Eloheinu Melekh ha’Olam asher kid’shanu b’mitzvotav v’tizivanu al sefirat ha’omer."
					+ "<br>" + blessingStringHebrew[i] + "<br>"
					+ "Blessed are you, lord our God, Ruler of the universe, who sanctifies us with holy laws, and commands us to be aware of the Counting of the Omer."
					+ "<br>" + blessingStringEnglish[i] + "</html>");
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