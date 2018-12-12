/**
 * 将电话号中间4位替换成XXXX 例如13842383838-->138XXXX3838
 */
package test4;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "13842383838";
		
		String reStr = str.substring(str.length() - 4, str.length());
		String preStr = str.substring(0, str.length() - 8);				//subString包头不包尾
		StringBuilder sb = new StringBuilder();			
		sb.append(preStr).append("XXXX").append(reStr);
		System.out.println(sb.toString());

	}

}
