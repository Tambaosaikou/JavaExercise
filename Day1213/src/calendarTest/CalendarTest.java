package calendarTest;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,month,day;
		Scanner sc = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		System.out.println("���������:");
		year = sc.nextInt();
		System.out.println("�������·�:");
		month = sc.nextInt();
		c.set(year, month-1,1);

		System.out.println("������\t����һ\t���ڶ�\t������\t������\t������\t������");
		for(int i=0;i<c.get(Calendar.DAY_OF_WEEK)-1;i++) {
			System.out.print("\t");
		}
		do{
			System.out.print(String.format("%2d\t", c.get(Calendar.DAY_OF_MONTH)));
			c.add(Calendar.DAY_OF_MONTH, 1);
			if(c.get(Calendar.DAY_OF_WEEK)==1){	
				System.out.println();
			}	
		}while(c.get(Calendar.DAY_OF_MONTH)!=1);
		
	}

}
