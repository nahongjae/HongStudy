package day4;

public class UserResult {
	private User[]data;
	private int cnt;
//	private UserService service;
	
	public UserResult(UserService service){ //
		data = service.getData();
		cnt = service.getCount();
		
	}
	public void print(){
		for(int i=0; i<=cnt; i++){
			System.out.println(data[i].getName()+":"+data[i].getAge());
		}
	}
}
