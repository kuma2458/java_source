package employeeVo;

import java.util.Objects;

import org.json.JSONPropertyName;

public class EmployeeVo {
	// 사번, 이름, 급여 ,부서

	private String emNo;
	private String emName;
	private int emMoney;
	private String emPart;

	public EmployeeVo(String emNo, String emName, int emMoney, String emPart) {
		super();
		this.emNo = emNo;
		this.emName = emName;
		this.emMoney = emMoney;
		this.emPart = emPart;
	}
	
	@JSONPropertyName("사번")
	public String getEmNo() {
		return emNo;
	}

	public void setEmNo(String emNo) {
		this.emNo = emNo;
	}

	@JSONPropertyName("이름")
	public String getEmName() {
		return emName;
	}

	public void setEmName(String emName) {
		this.emName = emName;
	}

	@JSONPropertyName("연봉")
	public int getEmMoney() {
		return emMoney;
	}

	public void setEmMoney(int emMoney) {
		this.emMoney = emMoney;
	}

	@JSONPropertyName("부서")
	public String getEmPart() {
		return emPart;
	}

	public void setEmPart(String emPart) {
		this.emPart = emPart;
	}

	@Override
	public String toString() {
		return "사번 : " + emNo + ", 이름 : " + emName + ", 연봉 : " + emMoney + ", 부서 : " + emPart;
	}

	@Override
	public int hashCode() {
		return Objects.hash(emMoney, emName, emNo, emPart);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeVo other = (EmployeeVo) obj;
		return Objects.equals(emNo, other.emNo);
	}

	public void printvo() {
		System.out.printf("%s %s %d %s\n",emNo,emName,emMoney,emPart);
	}

}
