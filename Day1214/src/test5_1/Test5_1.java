/**
 * 需求: 现在有16只球队, 科特迪瓦，阿根廷，澳大利亚，塞尔维亚，荷兰，尼日利亚、日本，美国，中国，新西兰，
 * 巴西，比利时，韩国，喀麦隆，洪都拉斯，意大利. 将这16只球队存入到集合中,然后随机分成4组从入到4个集合中.遍历打印集合
 */
package test5_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=new ArrayList<>();
		list.add("科特迪瓦");
		list.add("阿根廷");
		list.add("澳大利亚");
		list.add("塞尔维亚");
		list.add("荷兰");
		list.add("尼日利亚");
		list.add("日本");
		list.add("美国");
		list.add("中国");
		list.add("新西兰");
		list.add("巴西");
		list.add("比利时");
		list.add("韩国");
		list.add("喀麦隆");
		list.add("洪都拉斯");
		list.add("意大利");
		print(list);
	}
	private static void print(List<String> list) {
		Random r=new Random();
		
		for(int i=1;i<5;i++){
			System.out.println("第"+i+"队:");
			
			for(int j=0;j<4;j++){
				int index=r.nextInt(list.size());
				System.out.print(list.get(index)+"\t");
			}
			System.out.println();
		}	
	}	

}
