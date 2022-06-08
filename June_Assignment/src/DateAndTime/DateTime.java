package DateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
public class DateTime
{

	public static void main(String[] args) 
	{
		LocalDate currDate = LocalDate.now();
		DayOfWeek dayOfWeek = currDate.getDayOfWeek();
		int dayOfMonth = currDate.getDayOfMonth();
		int dayOfYear = currDate.getDayOfYear();
		
		System.out.println("Date:: " +currDate);
		System.out.println("Day of Week:: "+dayOfWeek);
		System.out.println("Day of Month:: "+dayOfMonth);
		System.out.println("Day of Year:: "+dayOfYear);

	}

}
