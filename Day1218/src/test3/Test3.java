/**
 * ָ������һ��Ŀ¼�����һ����������ӡ����Ŀ¼�µ������ļ���Ŀ¼�Ĳ�νṹͼ
   ֻ�ж�Ŀ¼�µ��ļ���ӡ,�����ֻ���ļ���ֱ������
  c:\
   |--abc
   |--def
   |   |--a
   |   |  |--c.java
   |   |--b
   |--t.txt
   |--s.txt

   //ȷ���㼶  |--Stringbuffer |   (i)
   |--abc
   |--def
   |   |--a
   |   |  |--c.java
   |   |--b
   |--s.txt
   |--s.txt
 */
package test3;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myFunction();
		

	}
	public static void myFunction() {
		String myPointer;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����ȷ����һ����ַ:");
		myPointer = sc.next();
		File f = new File(myPointer);
		
		if(f.isDirectory()) {
			
		}
		
		
		String[] arr1 = f.list();
//		File f1 = new File("D:\\Development\\1000phone");
//		f1.listFiles();
		System.out.println(Arrays.toString(arr1));
	}
}
