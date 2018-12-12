/**
 * 案例2：年龄越界异常
 * 自定义一个学生类：有姓名 年龄  性别  如果赋值年龄的时候数字不在1-150之间则抛出异常。
 */
package test6;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;
		int age = 0;
		String sex = null;
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("请输入姓名:");
			name = sc.next();
			System.out.print("请输入年龄：");
			age = sc.nextInt();
			System.out.print("请输入性别:");
			sex = sc.next();
			
			if(age>150||age<1) {
				throw new AgeException("年龄输入有误");
			}
			else {
				System.out.println(name+age+sex);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
