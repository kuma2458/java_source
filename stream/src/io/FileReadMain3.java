package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadMain3 {

	public static void main(String[] args) {
		try(FileReader fr=new FileReader("lotto1.txt");) {
			while(true) {
				int ch=fr.read();
				if(ch==-1)
					break;
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
		}catch (IOException e) {
		}

	}

}
