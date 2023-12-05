package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

public class EchoServerMain {

	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(2222);) {
			System.out.println("서버 오픈...");
			Socket client = server.accept();
			System.out.println(client.getInetAddress() + "님이 접속하셨습니다.");
			try (BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
					PrintWriter pw = new PrintWriter(client.getOutputStream());) {
				while (true) {
					String msg = br.readLine();
					System.out.println(client.getInetAddress()+" : " + msg+" "+Calendar.getInstance().getTime());
					if (msg.equals("exit")) {
						System.out.println("서버 종료...");
						break;
					}
					pw.println(msg);
					pw.flush();
				}
			} catch (IOException e) {
				// TODO: handle exception
			}
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}
