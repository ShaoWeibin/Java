import java.text.DateFormatSymbols;
import java.util.*;

/**
 * @version 1.0 2016-5-28
 * @author weibin.shao
 */
public class CalenderTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// construct a current date
		GregorianCalendar d = new GregorianCalendar();
		
		int today = d.get(Calendar.DAY_OF_MONTH);
		int month = d.get(Calendar.MONTH);
		
		// set d to start date of the month
		d.set(Calendar.DAY_OF_MONTH, 1);

		int weekday = d.get(Calendar.DAY_OF_WEEK);
		
		// get first day of week(Sunday in the U.S.)
		int firstDayOfWeek = d.getFirstDayOfWeek();
		
		// datermine the required indentation for the first line
		int indent = 0;
		while (weekday != firstDayOfWeek) 
		{
			indent++;
			d.add(Calendar.DAY_OF_MONTH, -1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		}
		
		// print weekday names
		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
		do 
		{
			System.out.printf("%4s", weekdayNames[weekday]);
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		} while (weekday != firstDayOfWeek);
		System.out.println();
		for (int i = 0; i < indent; ++i)
			System.out.print("    ");
		
		d.set(Calendar.DAY_OF_MONTH, 1);
		do 
		{
			// print day
			int day = d.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);
			
			// mark current day with *
			if (day == today) System.out.print("*");
			else System.out.print("  ");
			
			// advance d to the next day
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
			
			// start a line at the start of the week
			if (weekday == firstDayOfWeek) System.out.println();
		} while (d.get(Calendar.MONTH) == month);
		// the loop exit when d is day 1 of the next month
		
		// print final end of line if necessary
		if (weekday != firstDayOfWeek) System.out.println();
	}

}
