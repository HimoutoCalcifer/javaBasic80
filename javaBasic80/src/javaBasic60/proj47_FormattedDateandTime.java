package javaBasic60;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class proj47_FormattedDateandTime {

	public static void main(String[] args) {
		
		
		timeupdate();
		System.out.println();


	}
	
	static void timeupdate() {
		
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		
		System.out.println("The current time: " + cdt.format(System.currentTimeMillis()));
	}

}
