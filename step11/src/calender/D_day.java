package calender;

import java.util.Calendar;
import java.util.Date;

public class D_day {

	public static void main(String[] args) {
		// 오늘 날짜 기준으로 수능까지 몇일 남았는지 출력
		// getTime이용, 밀리초(1000이면 1초)
		// case1. calendar사용

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.set(2023, 10, 16);
		int d_day = (int) (c1.getTimeInMillis() - c2.getTimeInMillis()) / (1000 * 60 * 60 * 24) + 1;
		System.out.println("D-day : " + d_day);

		// case2. date 사용
		Date date1 = new Date(123, 10, 16);
		Date date2 = new Date();
		int dhour = (int) (date1.getTime() - date2.getTime()) / (1000 * 60 * 60);
		int dday = (int) (date1.getTime() - date2.getTime()) / (1000 * 60 * 60 * 24) + 1;
		int dday1 = c1.get(Calendar.DAY_OF_YEAR)-c2.get(Calendar.DAY_OF_YEAR);
		System.out.println("D-day : " + dhour);
		System.out.println("D-day : " + dday);
		System.out.println("D-day : " + dday1);

	}

}
