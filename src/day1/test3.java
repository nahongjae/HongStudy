package day1;

public class test3 {
public static void main(String[] args) {
	int size = 7;
	int st = 0;
	st = size/2;
	
	for(int i =0; i <size; i++){
		for(int j = 0; j < (size -st); j++){
			System.out.print((j>=st) ? "*":" ");
		}
		st = i < (size /2 ) ? st - 1 : st +1;
		System.out.println();
	}
}
}
