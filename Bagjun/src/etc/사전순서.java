package etc;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class 사전순서 {

	public static void main(String[] args) {
		//String
		//abc순서 / 대문자 -> 소문자  / 길이 : 짧 -> 길 
		Set<test> setString = new TreeSet<test>();
		Set<String> setChar = new TreeSet<String>();
		Set<String> setInt = new TreeSet<String>();

		
		setString.add(new test(3));
		setString.add(new test(7));
		
		setString.add(new test(9));
		setString.add(new test(5));
		
//		setString.add("def");
//		setString.add("abc");
//		setString.add("ABC");
//		setString.add("DEF");
//		setString.add("tiger");
//		setString.add("abcmp");
//		
		setChar.add("abc");
		setChar.add("def");
		setChar.add("ABC");
		setChar.add("DEF");
		
		//iterator 방법 1 
		Iterator it = setString.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		//iterator 방법 2 
		while(setString.iterator().hasNext()) {
			System.out.println(setString.iterator().next());
		}
		
		Iterator it2 = setChar.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}


	}

}
class test implements Comparable<test>{
	int num;
	public test(int num) {
		this.num = num;
	}
	public int compareTo(test o1) {
		return this.num - o1.num;
	}
	public String toString() {
		return this.num+"";
	}
}
