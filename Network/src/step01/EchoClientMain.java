package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClientMain {

	public static void main(String[] args) {
		try (Socket server = new Socket("127.0.0.1", 2222);) {
			System.out.println("서버 접속 성공...");
			try (BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
					PrintWriter pw = new PrintWriter(server.getOutputStream());
					Scanner sc = new Scanner(System.in);) {
				while (true) {
					String msg = sc.nextLine();
					pw.println(msg);
					pw.flush();
					if (msg.equals("exit")) {
						break;
					}
					String str = br.readLine();
					System.out.println("server : " + str);

				}
			} catch (IOException e) {
				// TODO: handle exception
			}

		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}
