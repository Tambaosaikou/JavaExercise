/**
 * 作业：给出一个非空的文件夹，用java程序把该文件夹删除。递归。
 */
package test1;

import java.io.File;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\Development\\1000phone\\EclipseWorkspace\\Day1218\\src\\test1\\test");
		delDir(f);
		System.out.println("删除完成");

	}

	public static void delDir(File file) {
		if (file.isDirectory()) {
			File zFiles[] = file.listFiles();
			for (File file2 : zFiles) {
				delDir(file2);
			}
		}
		file.delete();
	}

}
