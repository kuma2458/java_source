package io;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NotePad {

	public static void main(String[] args) {
		// 파일명을 사용자로부터 입력 받아서 파일을 생성한 후
		// 사용자로부터 문자열을 입력받아서 입력 받은 내용을 생성한 파일에 출력.
		// 단, exit라는 단어를 입력하면 사용자로부터 입력 종료. 오픈한 파일 역시 close 작업을 수행
		// 사용 클래스 : Filewriter , PrintWriter, Scanner

		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		PrintWriter pw = null;
		System.out.print("저장할 파일명을 입력하세요 : ");
		try {
			fw = new FileWriter(sc.nextLine() + ".txt");
			pw = new PrintWriter(fw);
			System.out.println("저장할 내용을 입력하세요 : ");
			System.out.println("'exit' 입력시 입력종료");
			while (true) {
				String str = sc.nextLine();
				if (str.equals("exit")) {
					break;
				}					
				pw.println(str);
				pw.flush();
			}
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} finally {
			try {
				if (pw != null)
					pw.close();
				if (fw != null)
					fw.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
