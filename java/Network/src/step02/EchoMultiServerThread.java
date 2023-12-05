package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Calendar;
import java.util.Scanner;

public class EchoMultiServerThread extends Thread {
	private Socket client;

	public EchoMultiServerThread(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(this.client.getInputStream()));
				PrintWriter pw = new PrintWriter(this.client.getOutputStream());) {
			while (true) {
				String msg = br.readLine();
				System.out.println(this.client.getInetAddress() + " : " + msg + " " + Calendar.getInstance().getTime());
				if (msg.equals("exit")) {
					break;
				}
				pw.println(msg);
				pw.flush();
			}
		} catch (IOException e) {
		}
		System.out.println(this.client.getInetAddress()+"님이 접속을 종료하였습니다.");
		EchoMultiServerMain.list.remove(this);
		System.out.println("현재 "+EchoMultiServerMain.list.size()+" 명 접속중");
	}

}
