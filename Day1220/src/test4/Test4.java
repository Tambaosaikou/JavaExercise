/**
 * 多线程模拟龟兔赛跑：
    		乌龟和兔子进行1000米赛跑，兔子前进5米，乌龟只能前进1米。
		但兔子每20米要休息500毫秒，而乌龟是每100米休息500毫秒。
		谁先到终点就结束程序，并显示获胜方。
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

		new Thread(tt, "乌龟").start();
		new Thread(rt, "兔子").start();
	}

}
