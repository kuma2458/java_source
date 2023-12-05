package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadTest {

	public static void main(String[] args) {

		try (FileInputStream fis= new FileInputStream("person.dat");
				ObjectInputStream ois=new ObjectInputStream(fis);){
			Person p=(Person) ois.readObject();
			System.out.println(p.toString());
		}catch (FileNotFoundException e) {
			// TODO: handle exception
		} 
		catch (IOException e) {
			// TODO: handle exception
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
