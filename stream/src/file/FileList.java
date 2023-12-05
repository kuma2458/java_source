package file;

import java.io.File;

public class FileList {

	public static void main(String[] args) {
		File root =new File("c:\\");
		System.out.println(root);
		File[] list=root.listFiles();
		
		for(File file : list) {
			String fileName=file.getName();
			long filesize=file.length();
			String etc=file.isDirectory()?"<DIR>":"";
			System.out.println(fileName+" "+filesize+" "+etc);
		}
		
		
		
		
	}

}
