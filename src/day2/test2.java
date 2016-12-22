package day2;

public class test2 {
	public static void main(String[] args) {
		Rect ob1= new Rect();
		Rect ob2= new Rect();
		//생성자 역활 : 1.메모리할당  2.초기화
		
		ob1.set(10, 5);;
		
		System.out.println(ob1.area()); //50
		System.out.println(ob2.area()); // 0
	}
}

class Rect {
	private int width, height;
	
	public void set(int w, int h){
		width=w; height=h;
		
	}
//	public Rect(){} //컴파일러가 불러올때 자동적으로 생성
	public int area() {
		return width*height;
	}
	
	public int len(){
		return (width*height)*2;
	}
	
}
