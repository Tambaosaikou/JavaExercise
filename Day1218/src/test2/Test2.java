/**
 * ʹ���ļ���File����Ӧ�ķ�����ʵ������Ч����
  ���ж�D�̸�Ŀ¼���Ƿ�����ļ���temp
    ������
      �жϸ��ļ������Ƿ�����ļ�test.txt
       �ļ������ڣ�ֱ��ɾ��
       ���򣬴���һ���µ��ļ�test.txt

    ���򣬴���Ŀ¼��
    Ҫ���������γ������еķ�֧��Ҫִ�е���
 */
package test2;

import java.io.File;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		for(int i = 1;i<=3;i++) {
			myFunction();
		}

	}
	
	public static void myFunction() throws IOException {
		File f = new File("D://temp");
		if(f.exists()) {
			File f1 = new File("D://temp//test.txt");
			if(f1.exists()) {
				f1.delete();
			}else {
				f1.createNewFile();
			}
		}	
		System.out.println("�����һ��");
	}

}
