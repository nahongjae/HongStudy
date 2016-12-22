package day2;

public class main {
	public static void main(String[] args) {
		int[] score = new int[] { 80, 90, 70, 80, 60, 100 };
		int[] rank = new int[score.length];

		// rank에 1로 초기화
		//

		for (int i = 0; i < rank.length; i++)
			rank[i] = 1;

		for (int i = 0; i < score.length - 1; i++) { // -1을해주는것은 점점 비교하는갯수가
														// 작아지므로 -1 해줌
			for (int j = i + 1; j < score.length; j++) {// i에 + 해주는경우는 비교하는
														// 대상숫자가 늘어남
				if (score[i] > score[j])
					rank[j]++;
				else if (score[i] < score[j])
					rank[i]++;
			}

		}
		for(int i =0; i<score.length; i++){
		System.out.printf("%d %d\n", score[i], rank[i]);
		}//printf 서식에 맞춰 출력 %d= 십진수표현
	}
	// int t;
	// t = score;
	//
	//
	//
	// for(int i=0; i<score.length; i++){
	// for(int j = i+1; j < score.length; j++){
	// System.out.println();
	//
	// }
	// }

}
