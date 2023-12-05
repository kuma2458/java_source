package calender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateFormatMain {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		//날짜 서식 문자를 이용해서 원하는 형태로 날짜를 문자열로 만들어주는 클래스
		SimpleDateFormat sdf=new SimpleDateFormat();
		
//		sdf.applyPattern("yy-MM-dd h:mm:ss");
//		System.out.println(sdf.format(cal.getTime()));
//		sdf.applyPattern("MMM");//약자
//		System.out.println(sdf.format(cal.getTime()));
//		sdf.applyPattern("MMMM");//풀네임
//		System.out.println(sdf.format(cal.getTime()));
//		sdf.applyPattern("dd");
//		System.out.println(sdf.format(cal.getTime()));
//		sdf.applyPattern("E");//요일 형식
//		System.out.println(sdf.format(cal.getTime()));
//		sdf.applyPattern("EEE");//요일 형식
//		System.out.println(sdf.format(cal.getTime()));
//		sdf.applyPattern("EEEE");//x요일 형식
//		System.out.println(sdf.format(cal.getTime()));
//		sdf.applyPattern("h");//시간(hour) 12시간 형식
//		System.out.println(sdf.format(cal.getTime()));
//		sdf.applyPattern("H");//시간(hour) 24시간 형식
//		System.out.println(sdf.format(cal.getTime()));
//		sdf.applyPattern("a");//시간(hour) 24시간 형식
//		System.out.println(sdf.format(cal.getTime()));
		
		//2023-05-25 14:26:30
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		
		//2023년 05월 25일 14시 26분 30초
		sdf.applyPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(cal.getTime())) ;
		
		//2023_05_25_14_26_30
		sdf.applyPattern("yyyy_MM_dd_HH_mm_ss");
		System.out.println(sdf.format(cal.getTime()));
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy년 MMM dd일 HH시 mm분 ss초",Locale.ENGLISH);
		System.out.println(sdf1.format(cal.getTime()));
	
		String str="2021-02-19";
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
		
		
	
	}

}
