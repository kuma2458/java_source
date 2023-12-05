package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.StudentService1;
import vo.StudentVO;

public class PrintFirstStudentController implements Controller {
	//지금 이방법 / rank()로 rank리스트에 저장하는 메서드만든후 1등만뽑아먹는 메서드 또만들어서 선언
	//아니면 지금 선언한 메서드랑 1등만 빼먹는 메서드 따로 만들기
	@Override 
	public void execute(Scanner sc) {
		System.out.println("석차 1등 출력...");
		StudentVO vo=StudentService1.getInstance().firstrank();
		if(vo==null)
			System.out.println("학생 정보가 없습니다");
		else
			System.out.println(vo);
	}

}