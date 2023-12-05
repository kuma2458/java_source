package constructor;

public class StudentInfoMain {

	public static void main(String[] args) {
		StudentInfo st1 = new StudentInfo();
		StudentInfo st2 = new StudentInfo("20262255", "김철수", "경영학과", 4.0);
		StudentInfo st3 = new StudentInfo("20214444", "박철수");

//		System.out.println(st1.major + " " + st1.score + " " + st1.stname + " " + st1.stnum);
		System.out.println(st2.major + " " + st2.score + " " + st2.stname + " " + st2.stnum);
		System.out.println(st2);
//		System.out.println(st3.major + " " + st3.score + " " + st3.stname + " " + st3.stnum);

		StudentInfo[] arr = new StudentInfo[10];

	}

}
