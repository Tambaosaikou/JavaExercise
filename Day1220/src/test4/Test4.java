/**
 * ���߳�ģ��������ܣ�
    		�ڹ�����ӽ���1000�����ܣ�����ǰ��5�ף��ڹ�ֻ��ǰ��1�ס�
		������ÿ20��Ҫ��Ϣ500���룬���ڹ���ÿ100����Ϣ500���롣
		˭�ȵ��յ�ͽ������򣬲���ʾ��ʤ����
 */
package test4;

import test4.MyThread.rabbitThread;
import test4.MyThread.turtleThread;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		turtleThread tt = t1.new turtleThread();
		rabbitThread rt = t1.new rabbitThread();

		new Thread(tt, "�ڹ�").start();
		new Thread(rt, "����").start();
	}

}
