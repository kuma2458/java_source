package service;

import java.lang.reflect.Array;
import java.util.ArrayList;

import vo.StudentVO;

public class StudentService1 {

	private static StudentService1 instance = new StudentService1();

	private ArrayList<StudentVO> stlist;
	private ArrayList<Integer> ranklist;

	private StudentService1() {
		stlist = new ArrayList<StudentVO>();
		ranklist = new ArrayList<Integer>();
	}

	public static StudentService1 getInstance() {
		if (instance == null)
			instance = new StudentService1();
		return instance;
	}

	public boolean addStudent(StudentVO studentVO) {
		if (stlist.contains(studentVO)) {
			System.out.println("중복된 학번입니다.");
			return false;
		} else {
			stlist.add(studentVO);
			return true;
		}
	}

	public ArrayList<StudentVO> getlist() {
		return stlist;
	}

	public StudentVO searchstudent(String stNo) {
		int listindex = stlist.indexOf(new StudentVO(stNo, null, null, 0));
		if (listindex == -1)
			return null;
		else
			return stlist.get(listindex);
	}

	public void editstudent(StudentVO vo, String stNo, String stName, String department, double score) {
		int listindex = stlist.indexOf(vo);
		stlist.get(listindex).setDepartment(department);
		stlist.get(listindex).setScore(score);
		stlist.get(listindex).setStName(stName);
		stlist.get(listindex).setStNo(stNo);
		System.out.println(stlist.get(listindex));
	}

	public boolean deletestudent(String stNo) {
		return stlist.remove(new StudentVO(stNo, null, null, 0));
	}

	public int ranking(double score) {
		int rank = 1;
		for (int i = 0; i < stlist.size(); i++) {
			if (score < stlist.get(i).getScore()) {
				rank++;
			}
		}
		return rank;
	}

	public void rankinglist() {
		int rank = 1;
		for (int i = 0; i < stlist.size(); i++) {
			for (int j = 0; j < stlist.size(); j++) {
				if (stlist.get(i).getScore() < stlist.get(j).getScore()) {
					rank++;
				}
			}
			ranklist.add(rank);
		}
	}

	public void searchname(String stName) {
		for (int i = 0; i < stlist.size(); i++) {
			if (stlist.get(i).getStName().indexOf(stName) != -1) {
				System.out.println(stlist.get(i));
			}
		}

	}

	public StudentVO firstrank() {
		for (int i = 0; i < stlist.size(); i++) {
			if (ranking(stlist.get(i).getScore()) == 1) {
				return stlist.get(i);
			}
		}
		return null;
	}

	public ArrayList<StudentVO> searchname1(String stName) {
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		for (int i = 0; i < stlist.size(); i++) {
			if (stlist.get(i).getStName().indexOf(stName) != -1) {
				list.add(stlist.get(i));
			}
		}

		return list;
	}

	public ArrayList<String> getdepartmentlist() {
		ArrayList<String> dlist = new ArrayList<String>();
		for (int i = 0; i < stlist.size(); i++) {
			if (!dlist.contains(stlist.get(i).getDepartment()))
				dlist.add(stlist.get(i).getDepartment());
		}
		return dlist;
	}

}
