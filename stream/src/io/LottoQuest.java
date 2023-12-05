package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class LottoQuest {

	public static void main(String[] args) {
		Random rd=new Random();
		FileWriter fw=null;
		PrintWriter pw=null;
		try {
			fw=new FileWriter("lotto.txt");
			pw=new PrintWriter(fw);
			pw.println("\tLOTTO\t\t");
			pw.println("---------------------");
			for(int i=0; i<5; i++) {
				HashSet<Integer> lottoset=new HashSet<Integer>();
				while(lottoset.size()<6) {
					int k=rd.nextInt(45)+1;
//					if(lottoset.add(k))
//						pw.printf("\t%2d ",k);
					lottoset.add(k);
				}
				Iterator<Integer> it=lottoset.iterator();
				pw.print("  ");
				while(it.hasNext()) {
					pw.printf("%2d ",it.next());
				}
				pw.println();
			}
			pw.println("---------------------");
			SimpleDateFormat sf=new SimpleDateFormat(" yyyy/MM/dd HH:mm:ss");
			pw.println(sf.format(Calendar.getInstance().getTime()));
			pw.flush();
		} catch (IOException e) {
			// TODO: handle exception
		}finally {
			try {
				if(pw!=null)
					pw.close();
				if(fw!=null)
					fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
		
		
		
	}

}
