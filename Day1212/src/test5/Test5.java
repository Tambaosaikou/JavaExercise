/**
 * "华为"公司去年的营业额是：1798798099079798098
 * 格式化后的金额信息是：1,798,798,099,079,798,098
 */
package test5;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "1798798099079798098";
		
		str1 = String.format("%,d",1798798099079798098L);
		System.out.println(str1);

	}
}