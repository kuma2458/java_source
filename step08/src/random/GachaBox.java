package random;

import java.util.Arrays;
import java.util.Random;

public class GachaBox {

	private final int[] GRADE_EA;
	private final int BOX_EA=10000;
	private static GachaBox instance=new GachaBox();
	
	
	private GachaBox() {
		GRADE_EA= new int[]{(int)(0.0014*BOX_EA),(int)(0.07*BOX_EA),
				(int)(0.18*BOX_EA),(int)(0.28*BOX_EA),(int)(0.4686*BOX_EA)};
	}


	public static GachaBox getInstance() {
		if(instance==null)
			instance=new GachaBox();
		return instance;
	}

	private String[] generateGachaBox() {
		String[] arr= new String[BOX_EA];
		String[] grade= {"S","A","B","C","F"};
		int[] count= {0,0,0,0,0};
		
		for(int i =0; i<BOX_EA; i++) {
			//1.0~4까지 숫자를 랜덤하게 뽑음
			//2.arr에 해당 등급의 문자열을 저장
			//3.저장하고나서 count에도 개수저장
			Random rd=new Random();
			int no=rd.nextInt(5);
			if(GRADE_EA[no]==count[no]) {
				i--;
				continue;
			}
			arr[i]=grade[no];
			count[no]++;
		}
		return arr;
	}
	public String[] drawItem(int ea) {
		String[] arr=new String[ea];
		final String[] gacha1=generateGachaBox();
		int[] temp=new int[ea];
		for(int i=0; i<ea; i++) {
			temp[i]=-1;
		}
		boolean check=false;
		Random rd=new Random();
		//뽑기를 총 ea번째
		for (int i = 0; i < ea; i++) {
			int n=rd.nextInt(gacha1.length);
			temp[i]=n;
			for(int j=0; j<i; j++) {
				if(temp[j]==n) {
					i--;
					break;
				}	
			}
			
		}
		//똑같은 숫자를 뽑으면 안됨
		for(int i=0; i<ea; i++) {
			arr[i]=gacha1[temp[i]];
		}
		//가차박스에 있는 내용을 arr에 저장
		return arr;
	}

}
