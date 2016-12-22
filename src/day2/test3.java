package day2;

public class test3 {
	public static void main(String[] args) {
		User3 oo = new User3();
		System.out.println(oo.sum(100));
		System.out.println(oo.upper('a'));
		System.out.println(oo.isUpper('A'));
		System.out.println(oo.isLeap(2016));
		System.out.println(oo.grad(90));
		
		int a = 20;
		oo.sub(a); // a 는 실 매개변수
		System.out.println(a);//20. call by value
		
		int []arr = {1,2,3};
		oo.sub(arr);;
		System.out.println(arr[0]); //11
		
		int[] n ={10,20,30};
		System.out.println(n[0]); //10
		
		n=oo.sub2(); //0x200
		System.out.println(n[0]); //1 , 원래있던 0x10의 주소는 garbage collect가 회수.
		
		int s;
		s=oo.sub3(1,2,3,4,5);
		System.out.println(s);
		
		s=oo.sub3(1,3,5);
		System.out.println(s);
		
	}
}

class User3 {
	public int sum(int n) {// 매개변수, 파라미터 , 반드시 자료형을 써줘야한다.
		int s = 0;
		for (int i = 1; i <= n; i++)
			s += i;
		return s;
	}

	// 소문자인경우 대문자로 변환
	public char upper(char ch) {

		return ch >= 'a' && ch <= 'z' ? (char) (ch - 32) : ch;

	}

	// 대문자인지?
	public boolean isUpper(char ch) {
		return ch >= 'A' && ch <= 'Z';
	}

	// 윤년인지판별
	// 년도가 4의배수이고 100의 배수가 아니거나 100의 배수이면
	public boolean isLeap(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	// 점수에 따른 평전(95 ~ 100:4.5, 90~64: 4.0 ...)
	public double grad(int s) {
		double p = 0;
		if (s >= 95)
			p = 4.5;
		else if (s >= 90)
			p = 4.0;
		else if (s >= 90)
			p = 3.5;
		else if (s >= 90)
			p = 3.0;
		else if (s >= 90)
			p = 2.5;
		else if (s >= 90)
			p = 2.0;
		else if (s >= 90)
			p = 1.5;
		else if (s >= 90)
			p = 1.0;
		else
			p = 0;

		return p;
	}
	public void sub(int a){
		a+=10;
		//return;//생략 가능(void 형인 경우만)
	}
	public void sub(int[] n){
		n[0]+=10;
	}
	public int[] sub2(){
		int []n ={1,2,3};// 0x200
		return n;
		
	}
	
	// public int sub3(String s, int .. n){}
	// public int sub3(int .. n, String s){}X
	
	public int sub3(int ...n){ // 비정형인자
		int s=0;
		for(int i=0; i<n.length; i++)s+=n[i];
		return s;
	}
	
	
}
