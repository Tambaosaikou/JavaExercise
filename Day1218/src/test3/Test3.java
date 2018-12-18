/**
 * 指定任意一个目录，设计一个方法，打印出该目录下的所有文件和目录的层次结构图
   只判断目录下的文件打印,如果是只是文件就直接跳过
  c:\
   |--abc
   |--def
   |   |--a
   |   |  |--c.java
   |   |--b
   |--t.txt
   |--s.txt

   //确定层级  |--Stringbuffer |   (i)
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
		
		System.out.println("请正确输入一个地址:");
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
