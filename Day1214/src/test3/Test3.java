/**
 * ����: ���弯��,�ü�������Ӷ��Ԫ��,Ȼ�󽫼����е�Ԫ��λ�÷�ת
 */
package test3;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr = new ArrayList<>();
		List<String> arrReverse = new ArrayList<>();
		arr.add("1");
		arr.add("2");
		arr.add("3");
		arr.add("4");

		System.out.println(arr);
		for (int i = arr.size() - 1; i > -1; i--) {
			arrReverse.add(arr.get(i));
		}
		System.out.println(arrReverse);

	}

}
