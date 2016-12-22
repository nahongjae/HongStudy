package day3;

public class test {
	public static void main(String[] args) {
		User1 oo = new User1();
		oo.print(5);
		System.out.println();	
		
		int sum = oo.sum(10);
		System.out.println(sum);
		
		int s;
		s=oo.pow(2, 10);
		System.out.println(s);
		
		byte b= 10;
		oo.write(b); //short
		
		short ss= 10;
		oo.write(ss); // short
		
		Short dd= 10;
		oo.write(dd); // Short
		
		int n= 10;
		oo.write(n); //int
		
		long l =10;
		oo.write(l); //Long
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
	
	
	//a의 b pow(2,10) => 1024. 단 
	public int pow (int a, int b){
		
		return b>=1? a*pow(a,b-1):1;
		
	}
	//byte=> byte, char=> Character, int=>Integer
	public void write(Short a){
		System.out.println("Short");
	}
	public void write(short a){
		System.out.println("short");
	}
	
	public void write(int a){
		System.out.println("int");
	}
	public void write(Long a){
		System.out.println("Long");
	}
	
	
}
class Demo1{
	private Demo1(){}
}

