package day4;

import java.util.Scanner;

public class UserApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		
		UserService service = new UserService();
		UserResult result = new UserResult(service);
		
		try{
			while(true){
				do{
					System.out.println("1.입력 2.출력 3.종료 =>");
					ch=sc.nextInt();
					
				}while(ch<1||ch>3);
				switch(ch){
				case 1:service.input();
					break;
				case 2:result.print();
					break;
				case 3:System.exit(0);
				}
			}
			
		}finally{                                                                                                                                                                                                                                                                                                 
			sc.close();
		}
	}
}
