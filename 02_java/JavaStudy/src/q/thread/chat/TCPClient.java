package q.thread.chat;

import java.io.IOException;
import java.net.Socket;

public class TCPClient {
	
	public static void main(String[] args) {
		//소프트웨어가 실행중인 본인의 컴퓨터의 IP는
		// 127.0.0.1 or localhost라는 대명사로 작성가능
		try {
			Socket socket = new Socket("192.168.20.9",3000);
			ClientReceive cr = new ClientReceive(socket);
			cr.start();
			
			ClientSend cs = new ClientSend(socket);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
