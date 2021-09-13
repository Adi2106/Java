package DateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		 System.out.println("Date is " + date);
		 System.out.println("Day of Month " + date.getDayOfMonth());
		 System.out.println("Year is " + date.getYear());
		 System.out.println("Month is " + date.getMonth());
		 System.out.println("Yesterday was  " + date.minusDays(1));
		 System.out.println("Tomorrow will be  " + date.plusDays(1));
		
		 
	}

}
