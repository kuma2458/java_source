package step02;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Vector;

public class EchoMultiServerMain {

	public static Vector<EchoMultiServerThread> list=new Vector<EchoMultiServerThread>();
	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(2222);) {
			System.out.println("서버 오픈");
			while(true) {
				Socket client = server.accept();	
				System.out.println(client.getInetAddress() + "님이 접속하셨습니다.");
				EchoMultiServerThread th= new EchoMultiServerThread(client);
				th.start();
				list.add(th);
				System.out.println("현재 "+list.size()+"명 접속중");
				
				

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
