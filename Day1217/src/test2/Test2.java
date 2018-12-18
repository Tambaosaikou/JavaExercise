/**
 *  使用Map集合，完成一个图书馆诗词查阅系统，程序运行效果如下：

------------------ 国家图书馆诗词查阅系统  -------------------

请录入您要查看的诗词名：春晓
xxxx,xx,xxxx...


还要继续阅读吗？yes

请录入您要查看的诗词名：沁园春.雪
作者：xxx
朝代：xx
内容：xxx
xxxx,xx,xxxx...

还要继续阅读吗？no

谢谢使用！^-^

分析：
 Map中存放的是诗词信息，模拟的是诗词数据库。

诗词：Poem
     名字
     作者
     朝代
     内容


 
诗词数据库,Key--》诗词名称
          value -->诗词对象
 */
package test2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test2 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Poem> map = new HashMap<>();
		Poem poem = new Poem("孟浩然", "唐","春眠不觉晓，处处闻啼鸟。夜来风雨声，花落知多少。");
		Poem poem2 = new Poem("毛泽东", "现代","北国风光，千里冰封，万里雪飘。");
		Poem p = new Poem();
		
		map.put("沁园春雪", poem2);
		map.put("春晓", poem);
		
		while(true) {

		
		System.out.println("------------------ 国家图书馆诗词查阅系统  -------------------");
		System.out.println("请录入您要查看的诗词名：");
		Scanner sc = new Scanner(System.in);
		
		Collection<String> keyset= map.keySet();
		Iterator<String> it1 = keyset.iterator();
		
		while1:
		while(it1.hasNext())
		{
			String a = sc.nextLine();
			String i = it1.next();
//			System.out.println("a:"+a+"\n"+"i:"+i);
		System.out.println(map.get(i));
		System.out.println("还要继续阅读吗？");
		String b = sc.next();
		if(b.equals("yes")) {
			break while1;
		}else if(b.equals("no")) {
			System.out.println("谢谢使用！^-^");
			System.exit(0);
		}
			}
		
		
		
	}	
	}

}
