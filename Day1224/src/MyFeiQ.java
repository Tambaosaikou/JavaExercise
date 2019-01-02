import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MyFeiQ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket s = new DatagramSocket();
		String data = "cnm";
		data = getData(data);
		DatagramPacket p = new DatagramPacket(data.getBytes(), data.getBytes().length,
				InetAddress.getByName("10.30.163.252"), 2425);

		int i = 0;
		long currentTimeMillis = System.currentTimeMillis();
		while (true) {
			s.send(p);
		}
		// System.out.println("cnm");
		// s.close();

	}

	public static String getData(String data) {
		StringBuilder sb = new StringBuilder();
		sb.append("1.0:");
		sb.append(System.currentTimeMillis() + ":");
		sb.append("1:");
		sb.append("255.255.255.0:");
		sb.append("32:");
		sb.append(data);
		return sb.toString();

	}

}
