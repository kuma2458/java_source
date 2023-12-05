package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChattingClient {

	public static void main(String[] args) {
		try(Socket server= new Socket("127.0.0.1",2222);
				Scanner sc =new Scanner(System.in);
				PrintWriter pw=new PrintWriter(server.getOutputStream());) {
			chatThread ct=new chatThread(server);
			ct.start();
			while(true) {
				System.out.print("나 : ");
				String str=sc.nextLine();
				pw.println(str);
				pw.flush();
				if(str.equals("exit"))
					break;
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	
	public static class chatThread extends Thread{
		private Socket socket;
			
		
		public chatThread(Socket socket) {
			this.socket=socket;
		}


		@Override
		public void run() {
			try (BufferedReader br= new BufferedReader(new InputStreamReader(socket.getInputStream()))){
				String str=null;
				while((str=br.readLine())!=null){
					System.out.println(str);
				}
			} catch (IOException e) {
				// TODO: handle exception
			}
		}
		
	}
}
