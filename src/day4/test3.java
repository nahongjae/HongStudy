package day4;

public class test3 {
	public static void main(String[] args) {
		String s = "a1sd123dfa4df32";
		
		s = s.replaceAll("\\d",""); //숫자 삭제
		System.out.println(s);
		//replace = 정규표현식 사용 불가.
		//replaceAll = 정규표현식 사용가능
		
		String[]ss=s.split("\\d");
		for(String a:ss)
			System.out.println(a);
		
		s="우리 1 나라 34 대한민국";
		s = s.replaceAll("\\d|\\s","");
		System.out.println(s);
		
		s="123456789";
		s = s.replaceAll("[369]", "*");
		s = s.replaceAll("(3|6|9)", "*");
		System.out.println(s);
		
		String s1="bcd";
		String s2="bca";
		
		byte []b=s1.getBytes();
		for(byte a:b)
			System.out.println(a);
		
		System.out.println(s1.compareTo(s2)); //3
		
		s1="SEOUL";
		s2="seoul";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		s1="seoul korea";
		s2="seoul";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.startsWith(s2));
		
		s1="ab.cd.gif";
		s2=s1.substring(s1.lastIndexOf("."));
		System.out.println(s2);
		
		
	}
}
