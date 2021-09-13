package DateAndTime;

import java.time.LocalTime;

public class LocalTimeEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime lt = LocalTime.now();
		System.out.println("Time  " + lt);
		System.out.println("Hour " + lt.getHour());
		System.out.println("Minutes " + lt.getMinute());
		System.out.println("Sec " + lt.getSecond());
		System.out.println("NanoSec " + lt.getNano());		
	}

}
