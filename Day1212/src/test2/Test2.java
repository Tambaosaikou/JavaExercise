/**
 * ��һ���ַ������з�ת�����ַ�����ָ�����ֽ��з�ת ���� abcdefg --> abfedcg
 */
package test2;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdefg";
		str = new StringBuilder(str).reverse().toString();	
		System.out.println(str);

	}

}
