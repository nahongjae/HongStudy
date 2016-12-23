package day4;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class test2 {
	public static void stringTest(){
		Runtime rt=Runtime.getRuntime();
		
		System.out.println("String");
		System.out.println("실행전:"+rt.freeMemory());
		
		long s = System.currentTimeMillis();
		String str="a";
		for(int i=0; i<100000; i++)
			str+="a";
		long e =System.currentTimeMillis();
		System.out.println("문자열길이:"+str.length());
		System.out.println("실행시간:"+(e-s)+"ms");
		System.out.println("실행후:"+rt.freeMemory());
	}
	public static void stringBufferTest(){
	Runtime rt=Runtime.getRuntime();
		
		System.out.println("StringBuffer");
		System.out.println("실행전:"+rt.freeMemory());
		
		long s = System.currentTimeMillis();
		StringBuffer sb=new StringBuffer("a");
		for(int i=0; i<100000; i++)
			sb.append("a");
		long e =System.currentTimeMillis();
		System.out.println("문자열길이:"+sb.length());
		System.out.println("실행시간:"+(e-s)+"ms");
		System.out.println("실행후:"+rt.freeMemory());
	}
	
	public static void main(String[] args) {
		stringTest();
		System.out.println();
		stringBufferTest();
//		System.out.println();
	}
}
