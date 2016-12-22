package day3;

public class test {
	public static void main(String[] args) {
		User1 oo = new User1();
		oo.print(5);
	}
}

class User1 {
	public void print(int n) {
		if (n > 1)
			print(n - 1);
		System.out.println(n);
	}
	public int sum(int n){
		return n>=1 ? n+sum(n-1):n;
	}
}
