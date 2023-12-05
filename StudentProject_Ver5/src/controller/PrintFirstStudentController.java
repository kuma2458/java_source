package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import service.StudentService;
import vo.StudentVO;

public class PrintFirstStudentController implements Controller {
	//지금 이방법 / rank()로 rank리스트에 저장하는 메서드만든후 1등만뽑아먹는 메서드 또만들어서 선언
	//아니면 지금 선언한 메서드랑 1등만 빼먹는 메서드 따로 만들기
	@Override 
	public void execute(Scanner sc) {
		System.out.println("석차 1등 출력...");
		ArrayList<Integer> ranklist=StudentService.getInstance().ranklist();
		ArrayList<StudentVO> list =StudentService.getInstance().firstrank();
		TreeMap<Integer, ArrayList<StudentVO>> map1=StudentService.getInstance().firstrankmap();
		if(list.isEmpty()) {
			System.out.println("등록된 정보가 없습니다.");
			return;
		}
//		for(int i = 0 ; i<list.size(); i++) {
//			System.out.println(String.format("%d %s %s %s %.2f",list.get(i).getRankno() ,list.get(i).getStNo(),list.get(i).getStName(),
//					list.get(i).getMajor_name(),list.get(i).getScore()));
//		}
//		Set<Integer> key = map1.keySet();
//		Iterator<Integer> it= key.iterator();
//		while (it.hasNext()) {
//			int i = it.next();
//			System.out.println(i+" "+map1.get(i));
//		}
		map1.forEach((k,list1)-> System.out.println(k+""+list1));
		
	}

}