package employeeService;

import java.util.ArrayList;

import org.json.JSONArray;

import employeeVo.EmployeeVo;

public class EmployeeService {
	private static EmployeeService instance = new EmployeeService();
	private static ArrayList<EmployeeVo> list;

	public EmployeeService() {
		list = new ArrayList<EmployeeVo>();
		list.add(new EmployeeVo("1111", "김철수", 3600, "영업부"));
		list.add(new EmployeeVo("2222", "이영희", 3300, "개발부"));
		list.add(new EmployeeVo("3333", "박대기", 3100, "기획부"));
	}

	public static EmployeeService getInstance() {
		if (instance == null)
			instance = new EmployeeService();
		return instance;
	}

	public boolean saveEmVo(String emNo, String emName, int emMoney, String emPart) {
		if (list.contains(new EmployeeVo(emNo, emName, emMoney, emPart)))
			return false;
		else
			return list.add(new EmployeeVo(emNo, emName, emMoney, emPart));

	}

	public boolean deleteemVO(String emNo) {
		return list.remove(new EmployeeVo(emNo, null, 0, null));
	}

	public EmployeeVo findEmvo(String emNo) {
		return list.get(list.indexOf(new EmployeeVo(emNo, null, 0, null)));
	}

	public ArrayList<EmployeeVo> getlist() {
		return list;
	}

	public boolean printEmvo() {
		if (list.isEmpty())
			return false;
		else {
			System.out.println("사번\t이름\t연봉\t부서");
			for (int i = 0; i < list.size(); i++) {
				EmployeeVo e = list.get(i);
				System.out.printf("%s\t%s\t%d\t%s\n", e.getEmNo(), e.getEmName(), e.getEmMoney(), e.getEmPart());
			}

			return true;
		}
	}

	public String employeeToJson() {
		JSONArray arr= new JSONArray(list);
		return arr.toString();
	}

}
