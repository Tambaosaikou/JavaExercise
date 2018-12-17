/**
 * 需求: 创建一个Student类,定义name和age属性,创建几个Student对象放入集合中,遍历集合,查找年龄最大的对象,并打印
 */
package test2;

import java.util.Arrays;
import java.util.LinkedList;

public class Test2 {
	private String name;
	private int age;
	public Test2(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		LinkedList<Test2> l = new LinkedList();

		Test2 s1 = new Test2("stu1", 1);
		Test2 s2 = new Test2("stu2", 2);
		Test2 s3 = new Test2("stu3", 3);
		Test2 s4 = new Test2("stu4", 4);
		Test2 s5 = new Test2("stu5", 5);

		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		int x = 0;
		int mun1 = 0;
		int mun2 = 0;
		for (int i = 0; i < l.size() - 1; i++) {
			for (int j = i + 1; j < l.size(); j++) {
				if (l.get(i).getAge() < l.get(j).getAge()) {
					mun1 = l.get(i).getAge();
					mun2 = l.get(j).getAge();
					int temp = mun1;
					mun1 = mun2;
					mun2 = temp;
					x = j;

				}
			}
		}
		print(l.get(x).getName()+" "+l.get(x).getAge());
	}

	public static void print(Object... obj) {

		System.out.println(Arrays.toString(obj) + "");
	}
	
	}


