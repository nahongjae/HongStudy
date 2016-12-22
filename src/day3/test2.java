package day3;

public class test2{
	public static void main(String[] args) {
	
			// TODO Auto-generated method stub
		System.out.println(User2.b);
		User2 ob = new User2();
		User2 ob2 = new User2();
	}
}
	class User2{ //객체생성시
		int a; // 1. a에 대한 메모리 할당
		{
			a=10; //2. 초기화 블럭이 존재한다면 초기화 블럭 실행
			System.out.println("초기화 블럭.");
			
		}
		static int b; // 클래스 변수 , 정적 변수 , new와는 전혀 상관 x = 메모리할당과는 상관 없음
		{
			b=10;
		}
		public User2(){ //생성자 실행
			System.out.println("생성자");
		}
	}
		
