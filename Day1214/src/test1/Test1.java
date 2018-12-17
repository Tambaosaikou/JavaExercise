/**
 * 需求: 定义一个swap()方法,传入集合和两个角标,将两个角标上的元素交换位置
 */
package test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test1 {

	@SuppressWarnings("rawtypes")
	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		int num1 = 1, num2 = 0;
		swap(list, num1, num2);


	}
	@SuppressWarnings("rawtypes")
	public static void swap(List list, int i1, int i2) {
		List<String> arr = new ArrayList<>();
		arr.add("1");
		arr.add("2");
		arr.add("3");
		arr.add("4");
		String s=arr.get(i2);
		arr.set(0, arr.get(i1));
		arr.set(1, s);
		System.out.println(arr);

	}

	}
