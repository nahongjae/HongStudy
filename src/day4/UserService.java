package day4;

import java.util.Scanner;

public class UserService {
	private User[]data = new User[10];
	private int cnt=0;
	private Scanner sc = new Scanner(System.in);
	
	public User[] getData(){
		return data;
	}
	public int getCount(){
		return cnt;
	}
	public void input(){
		if(cnt>=10){
			System.out.println("정원초과");
			return;
		}
		
		System.out.println("자료입력");
		
		data[cnt] = new User();
		System.out.println("이름?");
		data[cnt].setName(sc.next());
		System.out.println("나이?");
		data[cnt].setAge(sc.nextInt());
		cnt++;
	}
}
