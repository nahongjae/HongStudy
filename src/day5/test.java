package day5;

public class test {
	public static void main(String[] args) {
		User1 oo = new Demo1();// up casting

		System.out.println(oo.b);// 5
		// System.out.println(oo.c);// 컴파일 오류
		System.out.println(((Demo1) oo).c);// down casting //.의 연산자가 높아서 괄호 잘해야함
		oo.sub();// Demo1

		Demo1 dd = (Demo1) oo; // down casting
		dd.print();

		if (dd instanceof Demo1) {
			Demo1 dd2 = (Demo1) oo;
			dd2.print();
		}

		Object ob = new Demo1();
		System.out.println(((Demo1) ob).a);

	}
}

class User1 {
	int a = 10, b = 5;

	public void print() {
		System.out.println(a + ":" + b);
	}

	public void sub() {
		System.out.println("User1");
	}
}

class Demo1 extends User1 {
	int b = 20, c = 30;

	public void write() {
		System.out.println(a + ":" + b + ":" + c+":"+super.b);
	}

	public void sub() {
		System.out.println("Demo1");

	}
}