package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) {

		// 1. Server Connect
		try (Socket server = new Socket("127.0.0.1", 1234);) {
			System.out.println("서버 접속 성공...");
			// 2. Stream Init
			try (BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
					PrintWriter pw = new PrintWriter(server.getOutputStream());) {
				// 3. Data Send/Receive
				pw.println("hi");
				pw.flush();
				String msg = br.readLine();
				System.out.println(msg);
			} catch (IOException e) {
				// TODO: handle exception
			}
		} catch (UnknownHostException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}
