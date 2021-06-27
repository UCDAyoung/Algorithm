/* Map.Entry 
 * Map인터페이스 안에 Entry인터페이스가 존재함. Entry가 Map의 내부 인터페이스임 .  
 */

package 아무거나;

import java.util.*;
import java.util.Map.Entry;

public class 맵셋변환_질문해야{

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap();
		
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		
		System.out.println(map.toString()); 		// 값 확인 
		System.out.println(map.size()); 			// size는 키 갯수  
		
/*		
 * 	방법1) Using Iterator 
		Iterator it = (Iterator) map.entrySet().iterator();  
		아래2줄 간략화 버전 
		[ Set<Map.Entry<String,Integer>> set =  map.entrySet(); Iterator it = set.iterator(); ]  
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
		casting 문제 발생 해결못함.   
*/		
		
		
/*
 *  방법2) Using Foreach문 	
		for(Map.Entry<String,Integer> e : map.entrySet()){
			System.out.print(e.getKey());
			System.out.print(e.getValue());
		}
		casting 문제 발생 해결못함. 
*/
		

	}

}
