package static_ex;

public class Card {
	//Card 객체가 생성 될때 사용자 이름을 받음
	//카드번호를 하나 읽어와서 필드에 저장
	//필드 : 카드번호, 사용자 이름
	//생성자 : 사용자 일므을 받음. 카드번호는 static에 저장된 숫자를 읽어와서 저장 후 증가
	//toString도 작성
	//static에 저장된 발급될 카드번호는 생성자에 하나씩 들어갈때마다 증가->시작번호는 100부터
	//메인에서 테스트하는 코드
	
	private static int cardNumSeq=1000;
	private int cardNum;
	private String cardName;
	public Card() {
	}
	
	public Card(String cardName) {
		cardNum=cardNumSeq++;
		this.cardName = cardName;
	}

	@Override
	public String toString() {
		return "Card [cardNum=" + cardNum + ", cardName=" + cardName + "]";
	}
	
	
	
	
	
	
}
