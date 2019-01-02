package week;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyThread1 implements Runnable {
	Map<Integer, Student> map = new HashMap<>();
	Student s1 = new Student("张三", 1);
	Student s2 = new Student("李四", 2);
	Student s3 = new Student("王五", 3);

	@Override
	public void run() {
		// TODO Auto-generated method stub
		map.put(1, s1);
		map.put(2, s2);
		map.put(3, s3);
		System.out.println(Thread.currentThread().getName() + "录入完毕");
		Set<Integer> keySet = map.keySet();
		Student s = null;
		Iterator<Integer> it = keySet.iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			s = map.get(key);
			System.out.println(Thread.currentThread().getName() + "编号：" + key + " " + s.toString());
		}
		System.out.println(Thread.currentThread().getName() + "输出完毕");
	}

}