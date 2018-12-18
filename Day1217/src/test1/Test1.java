/**
 * TreeSet中存放的是同一个类的对象，让同类对象之间进行比较，然后排序。但是，现实需求是变动的，让不同种类的对象进行比较，
         现实中也有很多。如何实现呢？
需求：让人、老虎、狮子存储到集合，速度升序，若速度一样，根据体重来比较，体重降序。
		TreeSet存储人、老虎、狮子对象，排序规则：速度升序，若速度一样，根据体重来比较，体重降序
  提示：可抽取父类，在父类中重写 compareTo方法。
 */
package test1;

import java.util.Iterator;
import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person person = new Person(1,2,"人类");
//		Person tiger = new Person(1,2,"老虎");
//		Person lion = new Person(1,2,"狮子");
		
		TreeSet<Person> set = new TreeSet<>(new Person());
		
		set.add(new Person(1,1,"人类"));
		set.add(new Person(3,2,"老虎"));
		set.add(new Person(2,3,"狮子"));
		Iterator<Person> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		

	}

}
