package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChattingServer {
	public static ArrayList<ChatThread> list=new ArrayList<ChatThread>();

	public static void main(String[] args) {
		try (ServerSocket server=new ServerSocket(2222);){
			System.out.println("서버 오픈");
			while(true) {
				Socket client = server.accept();
				System.out.println(client.getInetAddress()+"님이 접속하셨습니다");
				ChatThread ct=new ChatThread(client);
				ct.start();
				list.add(ct);
				System.out.println("현재 "+list.size()+"명이 접속중입니다.");
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		
	}
	private static class ChatThread extends Thread{
		private Socket socket;
		private PrintWriter pw;
		public ChatThread(Socket socket) {
			this.socket = socket;
			try {
				this.pw = new PrintWriter(this.socket.getOutputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void printpw(String msg) {
			pw.println(msg);
			pw.flush();
		}
		@Override
		public void run() {
			try (BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));){
				while(true) {
					String str=br.readLine();
					if(str.equals("exit"))
						break;
					list.forEach(a->a.printpw(socket.getInetAddress()+" : "+str));
				}
			} catch (IOException e) {
				// TODO: handle exception
			}
			list.forEach(a->a.printpw(socket.getInetAddress()+"님이 나가셨습니다."));
			list.remove(this);
			System.out.println("현재 접속중인 인원 : "+list.size()+"명");
		}
		
		
		
	}
}
