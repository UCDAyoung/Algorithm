/* set특징  
 * 1. 순서유지x 2. 중복되면 저장되지 않는다.  
 * 
 * set종류 
 * 1. hashset
 * 	1.1	LinkedHashSet : 순서 유지하고 싶으면 이거 사용 (단, 비교해가면서 저장하기 때문에, 데이터 삽입,삭제 시간이 더 걸림)   
 * 2. treeset
 * 	자동 정렬과 탐색에 유리 (추가 시 자동으로 트리처럼 정렬된다.) 
 * 	단, treeset이 comparable에 정렬기준을 가지고있던지 
 *  or , 정렬대상이 comparator정렬 기준을 가지고 있던지
 *  메소드 :subset(a,b) a부터 b까지 범위의 값을 가져온다.
 *     
 * 	참고 :https://www.youtube.com/watch?v=Kcz-z6xTbgk&list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp&index=130
 * 	
 *  
 *  
 */
package 아무거나;

import java.util.*;


public class Set {

	public static void main(String[] args) {
		
		Object[] box = {1,"2","3"};
		Set set = new HashSet();
		
		for(int i=0;i<box.length;i++)
			set.add(box[i]);
		
		System.out.println(set);
		
		LinkedList list = new LinkedList(set); // LinkedList(Collection c) 콜렉션의 객체를 모두 linkedlist에 넣어서 생성한다.
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

		
		
		
		
		
		
	}

}
