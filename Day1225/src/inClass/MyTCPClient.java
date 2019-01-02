package inClass;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class MyTCPClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket(InetAddress.getByName("10.30.163.223"), 6779);
		String data = "啊啊啊 啊啊";
		OutputStream os = socket.getOutputStream();

		os.write(data.getBytes());

		os.flush();

		socket.shutdownOutput();

		InputStream in = socket.getInputStream();

		byte[] buf = new byte[1024];
		int length = in.read(buf);

		String s = new String(buf, 0, length);
		System.out.println("客户端接收:" + s);

		socket.shutdownInput();

		in.close();
		os.close();
		socket.close();

	}

}
