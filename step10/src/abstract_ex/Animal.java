package abstract_ex;
/*
 * 		추상(abstract)클래스
 * 		직접적으로 생성이 되지 않는 클래스
 * 		자식 클래스가 생성이 될 때만 간접적으로 생성
 * 		class 키워드 앞에 abstract 사용
 * 		일반적으로 최상위 클래스로 존재(최초에 클래스의 구조를 잡는 용도로 사용)
 * 
 * 
 * 
 * 
 * 
 */
public abstract class Animal {

	public Animal() {
		System.out.println("Animal constructor");
	
	}

	public void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
	
	//추상 메서드를 만들려면 반드시 추상 클래스로 만들어야됨
	public abstract void run();
	

}
