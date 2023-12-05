package io;

import java.io.FileInputStream;

public class ReadHex {

	public static void main(String[] args) {
		
		try (FileInputStream fis= new FileInputStream("data.dat");){
			int data=0;
			while(true) {
				data=fis.read();
				if(data==-1)break;
				System.out.print(Integer.toHexString(data)+" ");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
		
	

}
