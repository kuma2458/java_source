package calender;

import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		System.out.println(date.getHours());
		Date date2=new Date(1);
		System.out.println(date2);
		System.out.println(date2.getTime());
		Date date3=new Date(1234, 9, 10);
		System.out.println(date3);
		System.out.println(date3.getTime());
		
	}

}
