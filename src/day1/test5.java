package day1;

public class test5 {
	public static void main(String[] args) {
		int[] num = { 5, 1, 6, 10, 8 };
		int t;
		boolean flag;
		int pass=1;
		
		do{
			flag=false;
			for(int i=0; i<num.length-pass; i++){
				if(num[i]>num[i+1]){
					t=num[i];
					num[i+1]=num[i];
					num[i]=t;
					flag= true;
				}
			}
			
			pass++;
		}while(flag);
		System.out.println("정렬 후");
		for (int n : num) {// for each 문장 컴마 오른쪽은 list , 배열가능
			System.out.print(n + " ");
		}
		System.out.println();
	}
		
	}

