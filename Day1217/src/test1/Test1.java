/**
 * TreeSet�д�ŵ���ͬһ����Ķ�����ͬ�����֮����бȽϣ�Ȼ�����򡣵��ǣ���ʵ�����Ǳ䶯�ģ��ò�ͬ����Ķ�����бȽϣ�
         ��ʵ��Ҳ�кܶࡣ���ʵ���أ�
�������ˡ��ϻ���ʨ�Ӵ洢�����ϣ��ٶ��������ٶ�һ���������������Ƚϣ����ؽ���
		TreeSet�洢�ˡ��ϻ���ʨ�Ӷ�����������ٶ��������ٶ�һ���������������Ƚϣ����ؽ���
  ��ʾ���ɳ�ȡ���࣬�ڸ�������д compareTo������
 */
package test1;

import java.util.Iterator;
import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person person = new Person(1,2,"����");
//		Person tiger = new Person(1,2,"�ϻ�");
//		Person lion = new Person(1,2,"ʨ��");
		
		TreeSet<Person> set = new TreeSet<>(new Person());
		
		set.add(new Person(1,1,"����"));
		set.add(new Person(3,2,"�ϻ�"));
		set.add(new Person(2,3,"ʨ��"));
		Iterator<Person> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		

	}

}
