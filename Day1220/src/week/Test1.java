/**
 * ���������̣߳�����һ������һ��Map,��map����洢3��ѧ�����󣬲�����Map,
  ����һ���߳̽����ļ��ĸ��ƣ���1.txt��D�̸�Ŀ¼���Ƶ���ǰ��Ŀ��Ŀ¼�¡�
 */
package week;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Thread(new MyThread1(), "MyThread1:").start();
		new Thread(new MyThread2(), "MyThread2:").start();

	}

}