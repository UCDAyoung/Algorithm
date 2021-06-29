/* Hash : 중복된 값 계산 
 * set : 중복 방지 
 * list : 배열로 변환 
 */
package set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class 네이버자가진단 {

	public static void main(String[] args) {

		HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
		HashSet<Integer> set = new HashSet<>();
		List<Integer> list = new LinkedList<Integer>(); 
		
		int[] arr = {3, 2, 4, 4, 4, 4, 3, 3, 2, 1, 1, 3, 5};
		for(int i=0 ;i<arr.length;i++) {
			if(maps.containsKey(arr[i]))
				maps.put(arr[i],maps.get(arr[i])+1);
			else
				maps.put(arr[i],1);						
		}						
		
		for(int i=0 ; i<arr.length; i++) {
			if(!set.contains(arr[i]) && maps.get(arr[i])>1) {
				list.add(maps.get(arr[i]));
				set.add(arr[i]);
			}
		}			
		
		List list2 = new LinkedList(set);
		int[] arr2 = new int[list.size()];
		for(int i=0; i<list2.size();i++)
			 arr2[i] = (int) list2.get(i);
		
		 for(int a : arr2)
			 System.out.println(a);		
	
							 		 
			
		 //첫번째 
		 
		 for(int i=0; i<list.size();i++)
			 arr2[i] = list.get(i);
		
		 for(int a : arr2)
			 System.out.println(a);		

	}

}
