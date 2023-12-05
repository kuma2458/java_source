package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class OneChatServerMain {

	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(2222);
				Socket client = server.accept();
				PrintWriter pw = new PrintWriter(client.getOutputStream());
				Scanner sc=new Scanner(System.in);) {
			
			System.out.println(client.getInetAddress() + "님과 연결되었습니다.");
				printThread1 pt = new printThread1(client);
				pt.start();
				while (true) {
					String msg1 = sc.nextLine();
					if (msg1.equals("exit"))
						break;
					pw.println(msg1);
					pw.flush();
				}
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

	private static class printThread1 extends Thread {

		private Socket socket;

		public printThread1(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {
			try (BufferedReader br = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));) {
				String str=null;
				while ((str=br.readLine())!=null) {
					System.out.println(str);

				}
			} catch (IOException e) {
				// TODO: handle exception
			}
		}

	}
}
