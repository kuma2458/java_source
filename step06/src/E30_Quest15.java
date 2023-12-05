
public class E30_Quest15 {

	/*
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int sw = 1;
		int count=5;//맨처음 가로 채우는 개수
		int row=0,col=0;// 가로 새로 인덱스 번호
		int num=1;
		
		while(true) {
			//가로로 채우고 
			for(int i = 0; i<count; i++) {
				arr[row][col]=num++;
				col+=sw;
			}
			count--;
			//채울 값이 있는지 확인
			if(count<=0)
				break;
			//새로 방향으로 채우기
			col-=sw;
			row+=sw;
			for(int i= 0; i<count; i++) {
				arr[row][col]=num++;
				row+=sw;
			}
			col-=sw;
			row-=sw;
			//인덱스 번호 증감하는 변수의 부호 변경
			sw=-sw;
		}
		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
