/**
 * 创建两个线程，其中一个创建一个Map,往map里面存储3个学生对象，并遍历Map,
  另外一个线程进行文件的复制，把1.txt从D盘根目录复制到当前项目根目录下。
 */
package week;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Thread(new MyThread1(), "MyThread1:").start();
		new Thread(new MyThread2(), "MyThread2:").start();

	}

}