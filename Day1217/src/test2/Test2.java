/**
 *  ʹ��Map���ϣ����һ��ͼ���ʫ�ʲ���ϵͳ����������Ч�����£�

------------------ ����ͼ���ʫ�ʲ���ϵͳ  -------------------

��¼����Ҫ�鿴��ʫ����������
xxxx,xx,xxxx...


��Ҫ�����Ķ���yes

��¼����Ҫ�鿴��ʫ��������԰��.ѩ
���ߣ�xxx
������xx
���ݣ�xxx
xxxx,xx,xxxx...

��Ҫ�����Ķ���no

ллʹ�ã�^-^

������
 Map�д�ŵ���ʫ����Ϣ��ģ�����ʫ�����ݿ⡣

ʫ�ʣ�Poem
     ����
     ����
     ����
     ����


 
ʫ�����ݿ�,Key--��ʫ������
          value -->ʫ�ʶ���
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
		Poem poem = new Poem("�Ϻ�Ȼ", "��","���߲�����������������ҹ��������������֪���١�");
		Poem poem2 = new Poem("ë��", "�ִ�","������⣬ǧ����⣬����ѩƮ��");
		Poem p = new Poem();
		
		map.put("��԰��ѩ", poem2);
		map.put("����", poem);
		
		while(true) {

		
		System.out.println("------------------ ����ͼ���ʫ�ʲ���ϵͳ  -------------------");
		System.out.println("��¼����Ҫ�鿴��ʫ������");
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
		System.out.println("��Ҫ�����Ķ���");
		String b = sc.next();
		if(b.equals("yes")) {
			break while1;
		}else if(b.equals("no")) {
			System.out.println("ллʹ�ã�^-^");
			System.exit(0);
		}
			}
		
		
		
	}	
	}

}
