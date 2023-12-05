package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) {
		// 1. Server Open
		try (ServerSocket server = new ServerSocket(1234);) {
			System.out.println("서버 오픈 완료.... 사용자 접속 대기중...");
			// 2. Client Accept
			Socket client = server.accept();// 한명만 접속시켜줌
			// 3. Stream Init
			try (BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
					PrintWriter pw = new PrintWriter(client.getOutputStream());) {
				// 4. Data Send/Receive
				String msg = br.readLine();
				System.out.println("사용자가 보낸 메세지 : " + msg);
				pw.println("Server Message");
				pw.flush();
			} catch (IOException e) {
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
