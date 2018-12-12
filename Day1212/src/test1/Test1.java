/**
 * 去除字符串中所有的空格。例如 a b c d e  f --> abcdef
 */

package test1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "a b c d e  f";
		str = str.replace(" ", "");
		System.out.println(str);

	}

}
