/**
 * ��ҵ������һ���ǿյ��ļ��У���java����Ѹ��ļ���ɾ�����ݹ顣
 */
package test1;

import java.io.File;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\Development\\1000phone\\EclipseWorkspace\\Day1218\\src\\test1\\test");
		delDir(f);
		System.out.println("ɾ�����");

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
