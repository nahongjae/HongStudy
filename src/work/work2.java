package work;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class work2 {
	  public static void main(String[] args) {
	    Set<String> movie = new HashSet<String>();

	    movie.add("대부");
	    movie.add("반지의 제왕");
	    movie.add("겨울왕국");
	    movie.add("다크 나이트");
	    movie.add("해리포터");
	    movie.add("공공의 적");

	    Iterator<String> itr = movie.iterator();
	    // 이터레이터 객체 itr에 HashSet객체인 movie안에 있는 값들을 가져온다
	    // 모든 컬렉션 안에는 iterator()메서드가 있기 때문에 점찍고 사용하면 movie안에 있는 값들을 가져올 수 있다
	    while (itr.hasNext()) { // 값이 나올때까지 while문을 돈다
	      String s = itr.next(); // 문자열 변수 s에 다음값을 넣는다
	      System.out.println(s);
	    }
	  }
	}