/**
 * ����: ������16ֻ���, ���ص��ߣ�����͢���Ĵ����ǣ�����ά�ǣ��������������ǡ��ձ����������й�����������
 * ����������ʱ������������¡���鶼��˹�������. ����16ֻ��Ӵ��뵽������,Ȼ������ֳ�4����뵽4��������.������ӡ����
 */
package test5_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=new ArrayList<>();
		list.add("���ص���");
		list.add("����͢");
		list.add("�Ĵ�����");
		list.add("����ά��");
		list.add("����");
		list.add("��������");
		list.add("�ձ�");
		list.add("����");
		list.add("�й�");
		list.add("������");
		list.add("����");
		list.add("����ʱ");
		list.add("����");
		list.add("����¡");
		list.add("�鶼��˹");
		list.add("�����");
		print(list);
	}
	private static void print(List<String> list) {
		Random r=new Random();
		
		for(int i=1;i<5;i++){
			System.out.println("��"+i+"��:");
			
			for(int j=0;j<4;j++){
				int index=r.nextInt(list.size());
				System.out.print(list.get(index)+"\t");
			}
			System.out.println();
		}	
	}	

}
