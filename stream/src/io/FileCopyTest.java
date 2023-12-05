package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

public class FileCopyTest {

	public static void main(String[] args) {
		// 1. 복사할 원본 파일을 스트림으로 연결 - A
		// 2. 복사할 곳 파일을 스트림으로 연결 - B
		// 3. A에서 데이터를 읽어오고, B에다가 출력 -> 반복해서 끝나면 복사완료
		long starttime = System.nanoTime();
		try (FileInputStream fis = new FileInputStream("image.jpg");
				DataInputStream dis = new DataInputStream(fis);
				FileOutputStream fos = new FileOutputStream("image1.jpg");
				DataOutputStream dos = new DataOutputStream(fos);) {
			while (true) {
				int a = dis.read();
				if (a == -1)
					break;
				dos.write(a);

			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
		long endtime = System.nanoTime();
		System.out.println("버퍼 안쓰고 걸린시간 : " + (endtime - starttime));

		starttime = System.nanoTime();
		try (FileInputStream fis = new FileInputStream("image.jpg");
				FileOutputStream fos = new FileOutputStream("image2.jpg");) {
			byte[] aa = new byte[1024];
			while (true) {
				int a = fis.read(aa);
				if (a == -1)
					break;
				fos.write(aa);

			}
			fos.flush();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
		endtime = System.nanoTime();
		System.out.println("버퍼쓰고 걸린시간 : " + (endtime - starttime));

	}

}
