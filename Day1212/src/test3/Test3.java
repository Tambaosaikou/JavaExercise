/**
 * ��ȡһ���ַ�������һ���ַ����г��ֵĴ���������:abkkcdkkefkkskk kk�Ĵ��� 4�� 
 */
package test3;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String longStr = "abkkcdkkefkkskk";
		String shortStr = "kk";
		int count = 0;
		
		count = searchWord(longStr,shortStr);
		System.out.println(count);

	}
	public static int searchWord(String str,String key) {
		int count = 0;
		int index = 0;
		while((index = str.indexOf(key,index))!=-1){
			index = index+key.length();
			count ++;
		}
		return count;
	}

}
