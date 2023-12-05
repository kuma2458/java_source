package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteTest {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("person.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			
			Person p = new Person("김철수", 66);

			//객체를 output하기 위해선 직렬화가 필요
			oos.writeObject(p);
			oos.flush();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
