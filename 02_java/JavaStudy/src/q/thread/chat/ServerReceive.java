package q.thread.chat;

import java.net.Socket;

public class ServerReceive extends Thread{
	private Socket socket;

	public ServerReceive(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		super.run();
	}
	
	
	

}
