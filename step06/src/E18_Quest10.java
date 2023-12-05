import java.util.Scanner;

public class E18_Quest10 {

	public static void main(String[] args) {
		//가위바위보 사용자는 입력, 컴퓨터는 랜덤 
		//바위 : 1 가위: 2  보 : 3
		//바위1 - 가위2 / 바위1- 보3 /가위2 -보3 /가위2 - 바위1 / 보3- 바위1 / 보3 - 가위2  
		
		Scanner sc = new Scanner(System.in);
		int win=0,loss=0,draw=0;
		String[] str= {"바위","가위","보"};
		for(int i = 0; i<5; i++) {
			System.out.println("---------"+(i+1)+"회차---------");
			System.out.print("가위 : 2, 바위 : 1, 보: 3 입력 하세요 : ");
			int player=sc.nextInt();
			if(player<1||player>3) {
				System.out.println("범위를 벗어나셨습니다");
				continue;
			}
			int com=(int)(Math.random()*3)+1;
		
			//case2. player 값을 안정하고 들어가기
			if(player==com) {
				System.out.printf("사용자 : %s , 컴퓨터 : %s 비겼습니다\n",str[player-1],str[com-1]);
				draw++;
			}
			else if((player%3+1)==com) {
				System.out.printf("사용자 : %s , 컴퓨터 : %s 사용자가 이겼습니다.\n",str[player-1],str[com-1]);
				win++;
			}
			else{
				System.out.printf("사용자 : %s , 컴퓨터 : %s 사용자가 졌습니다.\n",str[player-1],str[com-1]);
				loss++;
			}
			//case1. player 값을 정하고 들어가기
//			
//			switch(player) {
//				case 1:
//					System.out.print("사용자는 주먹, ");
//					if(com==1) {
//						System.out.println("컴퓨터는 주먹, 비겼습니다.");
//						draw++;
//					}
//					else if(com==2)
//					{	
//						System.out.println("컴퓨터는 가위, 사용자가 이겼습니다.");
//						win++;
//					}
//					else {
//						System.out.println("컴퓨터는 보, 사용자가 졌습니다.");
//						loss++;
//					}
//					break;
//				case 2:
//					System.out.print("사용자는 가위, ");
//					if(com==2) {
//						System.out.println("컴퓨터는 가위, 비겼습니다.");
//						draw++;
//					}
//					else if(com==3)
//					{	
//						System.out.println("컴퓨터는 보, 사용자가 이겼습니다.");
//						win++;
//					}
//					else {
//						System.out.println("컴퓨터는 주먹, 사용자가 졌습니다.");
//						loss++;
//					}
//					break;
//				case 3:
//					System.out.print("사용자는 보, ");
//					if(com==3) {
//						System.out.println("컴퓨터는 보, 비겼습니다.");
//						draw++;
//					}
//					else if(com==1)
//					{	
//						System.out.println("컴퓨터는 주먹, 사용자가 이겼습니다.");
//						win++;
//					}
//					else {
//						System.out.println("컴퓨터는 가위, 사용자가 졌습니다.");
//						loss++;
//					}
//					break;
//			}
//		

		}
		
		
	
		System.out.println("승 : "+win+", 무 : "+draw+", 패 : "+loss);
	}

}
