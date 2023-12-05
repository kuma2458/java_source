package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServerMain {
	private static ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();

	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(1234);) {
			System.out.println("채팅 서버 오픈 완료....");

			while(true) {
				Socket client = server.accept();
				System.out.println(client.getInetAddress() + "님이 접속하셨습니다.");
				ServerWorker worker = new ServerWorker(client);
				worker.start();
				list.add(worker);
				System.out.printf("현재 %d명 접속중입니다.\n",list.size());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	private static class ServerWorker extends Thread{
		private Socket client;
		private PrintWriter pw;
		
		public ServerWorker(Socket client) {
			this.client = client;
			try {
				pw = new PrintWriter(client.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public void printMessage(String msg) {
			pw.println(msg);
			pw.flush();
		}
		
		@Override
		public void run() {
			try(BufferedReader br = new BufferedReader(
					new InputStreamReader(client.getInputStream()))){
				while(true) {
					String msg = br.readLine();
					if(msg.equals("exit")) break;
					list.forEach(a -> a.printMessage(client.getInetAddress() + "님의 메세지 : " + msg));
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
			list.forEach(a -> a.printMessage(client.getInetAddress() + "님이 접속을 종료하셨습니다."));
			list.remove(this);//접속중인 사용자 관리하는 리스트에서 해당 스레드 객체를 제거
			System.out.printf("현재 %d명 접속중입니다.\n",list.size());
		}

	}
}




