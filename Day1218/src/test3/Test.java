package test3;

import java.io.File;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String myPointer;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请正确输入一个地址:");
		myPointer = sc.next();
		File file = new File(myPointer);
		J(file,0);
	}

	public static void J(File file,int l) {

		File[] files = file.listFiles();
		if (file.isFile() || files.length == 0) {
			return;
		}

		for (File item : files) {
			for(int i=0;i<=l;i++){
				System.out.print("\t");
			}
			System.out.println(item.getName());

			if (item.isDirectory()) {
				J(item,l+1);
			}
		}
	}


}
