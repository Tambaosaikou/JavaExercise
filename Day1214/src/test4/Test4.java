/**
 *  创建一个Student类,定义name和age属性, 创建几个对象存入集合中(有重复属性的对象),创建方法去除集合中的重复元素
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
