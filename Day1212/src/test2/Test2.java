/**
 * 将一个字符串进行反转。将字符串中指定部分进行反转 例如 abcdefg --> abfedcg
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
