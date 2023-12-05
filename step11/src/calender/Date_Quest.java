package calender;

import java.time.DayOfWeek;
import java.util.Calendar;

public class Date_Quest {

	public static void main(String[] args) {
		//오늘 날짜 기준으로 택배가 영업일 기준 4일이 소모됨
		//택배가 도착할날짜를 계산해서 출력
		Calendar today=Calendar.getInstance();
		for(int i=0; i<4; i++) {
			int d=today.get(Calendar.DAY_OF_WEEK)+1;
			if(d>6)
				d=0;
			System.out.println(d);
			if(d==0||d==6)
			{ 
				i--;
			}
			today.set(Calendar.DATE, today.get(Calendar.DATE)+1);	
		}
		System.out.println("---");
		System.out.println(today.get(Calendar.DAY_OF_WEEK));
		System.out.println(today.get(Calendar.DATE));
		
	}

}
