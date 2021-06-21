package etc;

import java.util.*;

public class Naver_No6 {
	static HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	static ArrayList<Integer> list = new ArrayList<>(); // 순서있는 배열  
	
	public static void solution(int[] arr){
		boolean[] check = new boolean[arr.length];
		
		for(int i=0 ;i<arr.length;i++) {
			map.put(i,0);
		}//초기화 
		
		for(int i=0 ;i< arr.length;i++) {
			int count =map.get(arr[i]); // 해당 key값 갯수 
			
			if(map.containsKey(arr[i])) { //포함하고 있다면 
				count++; 
				if(count==2)
					list.add(arr[i]);
				map.put(arr[i], count); //증가해서 넣기 
			}												
		}
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.print("["+it.next()+"]");
		} //출력  
		
		for(int i=0 ;i<arr.length;i++) {
			int cnt = map.get(arr[i]); // 
			if(cnt>=2)
				list.add(cnt);
		}
		
	}
	
	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3,3,3,3,4,4}; //네이버 예시 케이스 
		
		solution(arr); //솔류션 
		
		for(int i : list) //출력 
			System.out.print("["+i+"]");
		
			
		
		
		
		
		

	}

}
