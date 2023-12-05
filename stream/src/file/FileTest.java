package file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		//이진파일, 텍스트파일(txt,excel,json...)
		File file=new File("C:\\test\\test.txt");
		System.out.println(file);
		
		
		//현재 파일의 절대 경로 위치값을 뽑음
		System.out.println(file.getAbsolutePath());//절대경로값
		
		//부모 폴더의경로를 둔자열로 받음
		
		System.out.println(file.getParent());
		File parent = file.getParentFile();//경로를 파일형식으로 뽑기
		System.out.println(parent.exists());
		if(!parent.exists()) {
			parent.mkdirs();//해당 경로까지의 폴더를 전부 생성
		}
		try {
			
			boolean result =file.createNewFile();
			System.out.println(result);
//			file.delete();
			File reFile = new File(parent.getAbsoluteFile()+"\\"+"abc.txt");
			file.renameTo(reFile);
			System.out.println(file.getName());//이름 리턴
			System.out.println(file.length());
			System.out.println(file.isDirectory());//폴더인지 체크
			System.out.println(file.isFile());//파일인지 체크
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
