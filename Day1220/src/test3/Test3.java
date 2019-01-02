/**
 *  �����û���(User), �����û���(username) ������(password)����. ���������ļ�, д�뼸���û�������,��"," �ָ�
     - ģ���¼, ����ϵͳ, ��ʾ���������û�������, ����ɹ�,��ʾ��¼�ɹ�, 
	һ���û��������� ռһ�С�
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
		File file = new File("src/test3/�˺�.txt");
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
		System.out.println("�������û�����");
		String userName = sc.next();
		System.out.println("���������룺");
		String passWord = sc.next();
		Iterator<String> it = map.keySet().iterator();
		boolean flag = false;
		while (it.hasNext()) {
			String key = it.next();
			if (key.equals(userName)) {
				flag = true;
				if (map.get(key).getPassword().equals(passWord)) {
					System.out.println("��½�ɹ�");
				} else {
					System.out.println("�������");
				}
			}
		}
		if (flag == false) {
			System.out.println("�û�������");
		}

	}

}
