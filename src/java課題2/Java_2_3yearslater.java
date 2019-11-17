package java課題2;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;


public class Java_2_3yearslater {

	public static void main(String args[]) {

		LocalDateTime today = LocalDateTime.now().plusYears(3);
		DayOfWeek week = today.getDayOfWeek();
        String dayw = week.getDisplayName(TextStyle.FULL, Locale.JAPAN);

		System.out.println("3年後の今日は" + dayw + "です" );

	}

}
