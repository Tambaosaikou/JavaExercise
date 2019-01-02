package inClass;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.UUID;

public class GetImage {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket(InetAddress.getByName("10.30.163.204"), 9797);

		/**
		 * 读取服务端给发送的图片流
		 */
		InputStream in = socket.getInputStream();
		OutputStream os = new FileOutputStream(UUID.randomUUID().toString() + ".jpg");

		byte[] buf = new byte[1024];
		int length = 0;

		while ((length = in.read(buf)) != -1) {
			os.write(buf, 0, length);

		}
		os.flush();
		os.close();
		in.close();
		socket.close();

	}

}
