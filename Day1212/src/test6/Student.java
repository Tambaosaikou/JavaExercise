/**
 * ����2������Խ���쳣
 * �Զ���һ��ѧ���ࣺ������ ����  �Ա�  �����ֵ�����ʱ�����ֲ���1-150֮�����׳��쳣��
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
			System.out.print("����������:");
			name = sc.next();
			System.out.print("���������䣺");
			age = sc.nextInt();
			System.out.print("�������Ա�:");
			sex = sc.next();
			
			if(age>150||age<1) {
				throw new AgeException("������������");
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
