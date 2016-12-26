package day5;

import java.util.Calendar;
import java.util.Scanner;

public class WeekTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int y, m, d;
		
		try{
			System.out.println("날짜입력[YYYY-MM-DD]?");
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
			System.out.printf("날짜:%04d-%02d-%02d\n",y,m,d);
			
			
			//처음 시작 요일
			Calendar sday = (Calendar)cal.clone();
	        int _m1 = cal.get(Calendar.DAY_OF_WEEK) - 1;
	        sday.add(Calendar.DAY_OF_MONTH, _m1*-1); // 오늘이 목요일이면 -4 해줘서 일요일을 만든다    

	        int y1 = sday.get(Calendar.YEAR);
	        int m1 = sday.get(Calendar.MONTH)+1;
	        int d1 = sday.get(Calendar.DATE);
	        System.out.printf("주시작일:%04d-%02d-%02d\n",
	                              y1, m1, d1) ;
	         
	        // 마지막요일
	        Calendar eday = (Calendar)cal.clone();
	        int _m2 = 7 - cal.get(Calendar.DAY_OF_WEEK);
	        eday.add(Calendar.DAY_OF_MONTH, _m2);  // 7에서 -그주주의 일 하면 토요일이된다.
	        int y2 = eday.get(Calendar.YEAR);
	        int m2 = eday.get(Calendar.MONTH)+1;
	        int d2 = eday.get(Calendar.DATE);
	        System.out.printf("주마지막일:%04d-%02d-%02d\n",
	                              y2, m2, d2) ;
		}finally {
			sc.close();
		}

	}

}
