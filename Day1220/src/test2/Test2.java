/**
 * 创建本地文件, 写入一些学生信息, 用","号分割, 创建学生类, 定义姓名,年龄,成绩属性,
     使用IO流从本地读取信息装载到对象中,将创建的对象存入集合, 然后遍历集合打印学生信息
      一个学生的信息独自占一行
 */
package test2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test2 {

	static List<Student> stuList = new ArrayList<>();

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		File file = new File("src/com/test2/File.txt");
		readAndLoad(file);
		printInfo(stuList);
	}

	private static void readAndLoad(File file) {
		// TODO Auto-generated method stub
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			try {
				String str = null;
				Student s = new Student();
				while ((str = reader.readLine()) != null) {
					String[] arr = str.split(",", str.length() - 1);
					s = new Student(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
					stuList.add(s);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	private static void printInfo(List<Student> stuList) {
		// TODO Auto-generated method stub
		for (int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}
	}

}