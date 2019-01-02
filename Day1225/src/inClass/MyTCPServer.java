package inClass;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTCPServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(6779);
		Socket socket = ss.accept();

		InputStream in = socket.getInputStream();
		byte[] buf = new byte[1024];
		int length = 0;
		String s = "";
		while ((length = in.read(buf)) != -1) {
			s = new String(buf, 0, length);
			System.out.println("服务器接收消息为:" + s);
		}
		socket.shutdownInput();

		OutputStream os = socket.getOutputStream();
		os.write(new StringBuffer(s).reverse().toString().getBytes());

		os.flush();
		socket.shutdownOutput();
		os.close();

		in.close();
		socket.close();
		ss.close();
	}

}
