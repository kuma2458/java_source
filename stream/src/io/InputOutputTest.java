package io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class InputOutputTest {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("perperson.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(new Person("김철수", 26));
			oos.writeObject(new Person("이영희", 25));
			oos.writeObject(new Person("박대기", 29));
			oos.flush();
		} catch (IOException e) {
			// TODO: handle exception
		}

		try (FileInputStream fis = new FileInputStream("perperson.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			try {
				while (true) {
					Person p=(Person) ois.readObject();
					System.out.println(p);
				}
			} catch (EOFException e) {
				System.out.println("파일 읽기 종료");
			}

		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
