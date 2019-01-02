package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Student stu = new Student();
		File f = new File("src/test1/file.txt");
		ObjectOutputStream out = null;
		out = new ObjectOutputStream(new FileOutputStream(f));
		for (int i = 0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入姓名:");
			stu.setName(sc.next());
			System.out.println("请输入年龄:");
			stu.setAge(sc.next());

			out.writeObject(stu);
		}
		// out.writeObject(null);
		out.flush();
		out.close();
		System.out.println("输入完成");
		du(f);

	}

	public static void du(File f) {

		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream(f));
			Object obj = null;
			String line = null;
			while ((obj = in.readObject()) != null) {
				obj += line;
			}
			System.out.println(obj);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
