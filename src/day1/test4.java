package day1;

import java.util.Arrays;

public class test4 {
	public static void main(String[] args) {
		// int[] num = new int [10]; // num[0] - num[9]
		// int[] num = new int [] {5,1,6,10,8}; // 배열 초기화
		int[] num = { 5, 1, 6, 10, 8 };

		// for(int i=0; i<num.length; i++)
		// System.out.print(num[i]+" ");
		// System.out.println();

		// Arrays.sort(num);

		System.out.println("정렬 전");
		for (int n : num) {// for each 문장 컴마 오른쪽은 list , 배열가능
			System.out.print(n + " ");
		}
		System.out.println();

		int t;
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					t = num[i];
					num[i] = num[j];
					num[j] = t;
					// }
					// System.out.println(i+":"+j);
				}
			}
		}
		System.out.println("정렬 후");
		for (int n : num) {// for each 문장 컴마 오른쪽은 list , 배열가능
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
