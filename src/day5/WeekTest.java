package day5;

import java.util.Calendar;
import java.util.Scanner;

public class WeekTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int y, m, d;
		
		try{
			System.out.println("��¥�Է�[YYYY-MM-DD]?");
			str= sc.next();
			
			String[] ss=str.split("-");
			y=Integer.parseInt(ss[0]);
			m=Integer.parseInt(ss[1]);
			d=Integer.parseInt(ss[2]);
			
			Calendar cal = Calendar.getInstance();
			
			cal.set(Calendar.YEAR,y);
			cal.set(Calendar.MONTH,m-1);
			cal.set(Calendar.DATE,d);
			
			y = cal.get(Calendar.YEAR);
			m = cal.get(Calendar.MONTH)+1;
			d = cal.get(Calendar.DATE);
			System.out.printf("��¥:%04d-%02d-%02d\n",y,m,d);
			
			
			//ó�� ���� ����
			Calendar sday = (Calendar)cal.clone();
	        int _m1 = cal.get(Calendar.DAY_OF_WEEK) - 1;
	        sday.add(Calendar.DAY_OF_MONTH, _m1*-1); // ������ ������̸� -4 ���༭ �Ͽ����� �����    

	        int y1 = sday.get(Calendar.YEAR);
	        int m1 = sday.get(Calendar.MONTH)+1;
	        int d1 = sday.get(Calendar.DATE);
	        System.out.printf("�ֽ�����:%04d-%02d-%02d\n",
	                              y1, m1, d1) ;
	         
	        // ����������
	        Calendar eday = (Calendar)cal.clone();
	        int _m2 = 7 - cal.get(Calendar.DAY_OF_WEEK);
	        eday.add(Calendar.DAY_OF_MONTH, _m2);  // 7���� -�������� �� �ϸ� ������̵ȴ�.
	        int y2 = eday.get(Calendar.YEAR);
	        int m2 = eday.get(Calendar.MONTH)+1;
	        int d2 = eday.get(Calendar.DATE);
	        System.out.printf("�ָ�������:%04d-%02d-%02d\n",
	                              y2, m2, d2) ;
		}finally {
			sc.close();
		}

	}

}
