package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferTest {

	public static void main(String[] args) {
		long starttime =System.nanoTime();
		
		try (FileReader fr= new FileReader("student.json");){
			char[] buf=new char[1024];	
			while(true) {
				int n=fr.read();
				if(n==-1) break;
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}catch (IOException e) {
			// TODO: handle exception
		}
		
		long endtime =System.nanoTime();
		System.out.println("걸린 시간 : "+(endtime-starttime));
		System.out.println("-------------------------");
		starttime=System.nanoTime();
		
		try (FileReader fr= new FileReader("student.json");){
			char[] buf=new char[1024];	
			while(true) {
				int n=fr.read(buf);
				if(n==-1) break;
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}catch (IOException e) {
			// TODO: handle exception
		}
		endtime=System.nanoTime();
		System.out.println("걸린 시간 : "+(endtime-starttime));
		
	}

}
