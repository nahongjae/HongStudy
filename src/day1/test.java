package day1;

public class test {
	public static void main(String[] args){
	float a = 0;
	double b = 0;

	for(
	int i=1; i<=100000;i ++){
		a += 100000;
		b += 100000;

	}
	System.out.println((a/100000));//99996.055
	// float 4bite 라서 오차발생
	System.out.println((b/100000));//100000.0
	// double은 메모리는 많이 차지하지만 정밀도가 높다
}
}
