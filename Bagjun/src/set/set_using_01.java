package set;

import java.util.HashSet;
import java.util.*;

public class set_using_01 {
	
	public static void main(String[] args) {
	HashSet<String> hs01 = new HashSet<String>();
	HashSet<String> hs02 = new HashSet<String>();
	
	
	
	hs01.add("준영");
	hs01.add("소래");
	
	System.out.println(hs01); // [소래, 준영] 전체 리스트 
	
	
	for(String e : hs01) {
		System.out.print(e + " ");
	}
	
	
	Iterator<String> it = hs01.iterator();
	while(it.hasNext()) {
		System.out.print(it.next());
	}
	
	int size = hs01.size(); //사이즈 
	}
	
	
}
