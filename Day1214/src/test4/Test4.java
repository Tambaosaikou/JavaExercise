/**
 *  ����һ��Student��,����name��age����, ��������������뼯����(���ظ����ԵĶ���),��������ȥ�������е��ظ�Ԫ��
 */
package test4;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr = new ArrayList<>();
		arr.add("1");
		arr.add("2");
		arr.add("3");
		arr.add("4");
		arr.add("2");
		arr.add("5");
		for(int i=0;i<arr.size();i++){
			for(int j=i+1;j<arr.size();j++){
				if(arr.get(i)==arr.get(j)){
					arr.remove(j);
					
				}
			}
		}
	System.out.println(arr);
		
	}


}
