package day3;

public class test3 {
	public static void main(String[] args) {
		
	}

	class hamsu {
		int a;
		Integer b;
		Integer c = 0; // Integer c = new Integer(0);

		void sub1() {
			int s = a + 10;
			System.out.println(s); // 10
		}

		void sub2() {
			int d = b + 10; // b는 null
			System.out.println(d);

		}

		void sub3() {
			int f = c + 10;
			System.out.println(f); // 10
		}
	}
}
