package calender;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();//이거 싱글턴인듯
		System.out.println(calendar.get(Calendar.YEAR));//월(month)는 0~11로 저장됨
		System.out.println(calendar.get(Calendar.MONTH)+1);
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.AM_PM));
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.MINUTE));
		System.out.println(calendar.get(Calendar.SECOND));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.DAY_OF_MONTH, 24);
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		calendar.set(Calendar.MONTH, 1);
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.getTime().getTime());
		
		
	}

}
