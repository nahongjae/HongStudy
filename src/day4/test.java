package day4;

public class test {
public static void main(String[] args) {
	String s1="seoul"; //0x10
	String s2="seoul"; //0x10
	String s3=new String("seoul"); //0x30
	
	System.out.println(s1==s2); // true
	System.out.println(s1==s3); // false
	
	System.out.println(s1.hashCode()); //109324212
	System.out.println(s3.hashCode()); //109324212
	
	s2+="korea";
	System.out.println(s1==s2); //false
}
}
