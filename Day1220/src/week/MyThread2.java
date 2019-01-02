package week;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyThread2 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		File file = new File("D:/1.txt");
		move(file);
	}

	private void move(File file) {
		// TODO Auto-generated method stub
		try {// 在当前项目根目录下创建1.TXT
			new File("./1.txt").createNewFile();
			System.out.println(Thread.currentThread().getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br = null;
		BufferedWriter bw = null;
		char[] c = new char[1024];
		int length = 0;
		if (file.exists()) {
			try {
				br = new BufferedReader(new FileReader(file));
				bw = new BufferedWriter(new FileWriter("./1.txt"));
				while ((length = br.read()) != -1) {
					bw.write(c, 0, length);
					bw.flush();
				}
				System.out.println(Thread.currentThread().getName() + "复制完毕");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					br.close();
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {
			try {
				file.createNewFile();
				move(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
