package object;

import java.util.Objects;

public class Dog {
	//품종	
	//나이	
	//생성자(전체필드초기화)
	//toString오버라이드
	//hashCode
	//equals
	
	private String dogtype;
	private int age;
	public Dog(String dogtype, int age) {
		super();
		this.dogtype = dogtype;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "품종 : "+dogtype+" 나이 : "+age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, dogtype);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals 호출 ");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return age == other.age && Objects.equals(dogtype, other.dogtype);
	}
	
//	@Override
//	public int hashCode() {
//		return this.hashCode();
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		//1. 메모리 주소가 같으면 같은 객체
//		if (this==obj) return true;
//		//2. 받아온 obj가 현재 객체랑 비교할 수 있는 타입인지 확인
//		// instanceof 쓰는 방법, getclass로 비교하는 방법 한번
//		if(obj.getClass().getSimpleName().equals(this.getClass().getSimpleName()))
//			return true;
//		if(obj instanceof Person) {
//			//3.받아온 객체를 형변환
//			Dog temp=(Dog) obj;
//			//4. 내부에 있는 값을 비교해서 비교 결과를 리턴
//			return dogtype.equals(temp.dogtype)&&age==temp.age;			
//		}
//		return false;
//	}
}
