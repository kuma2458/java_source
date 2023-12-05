package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadMain2 {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("lotto1.txt");
			br = new BufferedReader(fr);
			while (true) {
				String str = br.readLine();
				
				if (str == null)
					break;
				System.out.println(str);
			}

		} catch (FileNotFoundException e) {
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e2) {
				// TODO: handle exception
			}

		}

	}

}
