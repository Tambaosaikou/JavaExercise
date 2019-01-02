/**
 *  创建用户类(User), 定义用户名(username) 和密码(password)属性. 创建本地文件, 写入几个用户名密码,以"," 分割
     - 模拟登录, 启动系统, 提示请您输入用户名密码, 如果成功,提示登录成功, 
	一个用户名和密码 占一行。
 */
package test3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Test3 {

	static Map<String, User> map = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("src/test3/账号.txt");
		fileRead(file);
		fileLoad();
	}

	private static void fileRead(File file) {
		// TODO Auto-generated method stub
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String str = null;
			User u = new User();
			try {
				while ((str = reader.readLine()) != null) {
					String[] arr = str.split(",", 0);
					u = new User(arr[0], arr[1]);
					map.put(u.getUsername(), u);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void fileLoad() {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("请输入用户名：");
		String userName = sc.next();
		System.out.println("请输入密码：");
		String passWord = sc.next();
		Iterator<String> it = map.keySet().iterator();
		boolean flag = false;
		while (it.hasNext()) {
			String key = it.next();
			if (key.equals(userName)) {
				flag = true;
				if (map.get(key).getPassword().equals(passWord)) {
					System.out.println("登陆成功");
				} else {
					System.out.println("密码错误");
				}
			}
		}
		if (flag == false) {
			System.out.println("用户不存在");
		}

	}

}
