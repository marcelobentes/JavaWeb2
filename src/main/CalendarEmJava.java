package main;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarEmJava {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
		
		System.out.println("Calendar em milisegundos: "+ calendar.getTimeInMillis());
		System.out.println("Tipo de Calendar : "+ calendar.getCalendarType());
		System.out.println("Calendar: "+calendar.getFirstDayOfWeek());
		System.out.println("Calendar dia do mês: "+ calendar.get(calendar.DAY_OF_MONTH));

		System.out.println("Calendar dia da semana: "+ calendar.get(calendar.DAY_OF_WEEK));
		System.out.println("Calendar hora do dias: "+ calendar.get(calendar.HOUR_OF_DAY));
		
		System.out.println("Data em formato simpleDateformat: "
		+ simpleDateFormat.format(calendar.getTime()));
		
	}

}
