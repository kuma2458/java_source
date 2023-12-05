package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class OneChatClientMain {

	public static void main(String[] args) {
		try (Socket server = new Socket("127.0.0.1",2222);
				PrintWriter pw = new PrintWriter(server.getOutputStream());
				Scanner sc = new Scanner(System.in);) {
			System.out.println(server.getInetAddress() + " 님과 연결되었습니다.");
			printThread pt = new printThread(server);
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

	private static class printThread extends Thread {

		private Socket server;

		public printThread(Socket server) {
			this.server = server;
		}

		@Override
		public void run() {
			try (BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));) {
				String str = null;
				while ((str = br.readLine()) != null) {
					System.out.println(str);

				}
			} catch (IOException e) {
				// TODO: handle exception
			}
		}

	}

}
