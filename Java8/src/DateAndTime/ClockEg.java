package DateAndTime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ClockEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock c = Clock.systemDefaultZone();
		System.out.println(c);
		Year y = Year.now();
		System.out.println(y);
		if(y.isLeap())
			System.out.println("leap");
		else
			System.out.println("Non Leap");
		MonthDay md = MonthDay.now();
		System.out.println(md);
		
		ZonedDateTime zone = ZonedDateTime.now();
		System.out.println(zone);
		
		ZoneId zi = ZoneId.of("Asia/Calcutta");
		LocalTime lt = LocalTime.now(zi);
		System.out.println(lt);
		
		LocalDate date = LocalDate.now();
		LocalDate d1 = LocalDate.of(2020, 5, 27);
		Period p = Period.between(d1, date);
		System.out.println(p.getDays());
		System.out.println(p.getMonths());
		System.out.println(p.getYears());
		Period p1 = Period.between(date, date);
		System.out.println(p1.getDays());
		System.out.println(p1.getMonths());
		System.out.println(p1.getYears());									
	}

}
