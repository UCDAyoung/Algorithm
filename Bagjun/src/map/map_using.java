package map;

import java.util.*;
import java.util.Map.Entry;

public class map_using {

	public static void main(String[] args) {
	HashMap<String, Integer> maps = new HashMap <String,Integer>();   //무조건 문자열, 숫자 이런식으로 활용할듯 ?
	//1. put 
	maps.put("최저점수",0);
	maps.put("준영",90);
	maps.put("소래", 99);
	maps.put("최고점수", 100);
	// 1.1 put을 이용해 수정하기 (only Value) 
	maps.put("준영" , 92);
	maps.put("소래",99);
	
	
	//2. get
	System.out.println(maps.get("최저점수"));
	System.out.println(maps.get("없어"));  //해당하는 키가 없으면 null을 반환 
	System.out.println(maps.get("최고점수"));
	System.out.println(maps.get("준영점수"));
	System.out.println(maps.get("소래점수"));
	//3. remove /removeAll
	maps.remove("최고점수");
	maps.remove("최저점수");
	
	/*
	 3. Iterator사용
	 	Collection		<-따로->	 Map   
	 Set / List / Queue
	 -----------------------------------  
					so?
	Map에는 iterator() 메소드는 존재하지 않음.
					then? 
	map -> set 으로 바꿔서 이용하기  
	(가)  Map의 entrySet()을 이용해서 set 전체 가져오기   		 
	(나)  Map의 keySet()을 이용해서 key 키만 가져오기 
	*/
	 
	Set<Map.Entry<String,Integer>> entries = maps.entrySet();    //--------(가)
	
	Set<String> keyset = maps.keySet();							//---------(나)
	
	System.out.println(maps.entrySet());						// 출력 [소래점수=99, 소래=99, 최고점수=100, 준영점수=92, 준영=90, 최저점수=0]
	System.out.println(maps.keySet());							// 출력 [소래점수, 소래, 최고점수, 준영점수, 준영, 최저점수]
	
	
	for(Entry<String, Integer> entry : entries) {
		System.out.print(entry +",");
	}
	System.out.println();
	
	for(String key : keyset) {
		System.out.print(key + ",");
	}
	System.out.println();
	 
	
	/*   set 이용하기  
	 * set 메소드   1. getKey()   2.getValue()     단, 오로지 한 set에만 가능 ,
	 * --------------------------------------------
	 *  	so? 
	 *  1.for문 이용하기  2.iterator이용하기       단, iteraotr는 set클래스의 메소드이기 때문에, set이면 다 사용가능     
	 *  
	 * 
	 *   
	 */
	//1. for문 이용하기 	
	for(Entry<String,Integer> entry : entries) {
		System.out.print(entry.getKey() + ":");
		System.out.print(entry.getValue());
	}
	
	//2.set 메소드의 iterator()  이용하기 
	//2.1  전체 엔트리 		
	Iterator entry = entries.iterator();
	
	while(entry.hasNext()) {
		System.out.print(entry.next() + " ");
	}
	//2.2 키 
	Iterator key = keyset.iterator();
	while(key.hasNext()) {
		System.out.print(key.next()+" ");
	}
	
	}

}
