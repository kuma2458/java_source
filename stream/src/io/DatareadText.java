package io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class DatareadText {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("data.dat");
				DataInputStream dis =new DataInputStream(fis);){
			double pi=dis.readDouble();
			int n=dis.readInt();
			char ch=dis.readChar();
			boolean flag=dis.readBoolean();
			
			System.out.println(n+" "+pi+" "+ch+" "+flag);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
