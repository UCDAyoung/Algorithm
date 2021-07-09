/*
 *	컬렉션을 위한 메소드 (static) 을 제공한다.
 * 	static인 덕분에 인스턴스 생성없이 Collections.메소드 바로 사용가능하다.  
 */

package 아무거나;
import java.util.*;
import static java.util.Collections.*; // import java.util.Collections.*; 하면 바로 메소드로 사용가능 
public class Collections {

	public static void main(String[] args) {
		List list  = new ArrayList();
		addAll(list,1,2,3,4,5); 
		
		System.out.println(list);
		System.out.println(list.toString());
		
		
		
		rotate(list,1); 							//한 칸씩 오른쪽으로 이동
		System.out.println(list);
		rotate(list,2); 
		System.out.println(list);
		
		swap(list,0,1); 							//0과 1번째 원소 교환 
		System.out.println(list);
		
		shuffle(list); 								// 순서 임의로 섞기 
		System.out.println(list);		
		
		
		sort(list);									//오름차순 
		System.out.println(list);
		
		sort(list,new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				
				return (int)o2-(int)o1;				// 형 변환 필수  
			}
			
		}); 										//임의로 내림차순  
		System.out.println(list);
		
		sort(list,reverseOrder()); 					//내림차순 정렬 
		System.out.println(list);

		
		System.out.println(binarySearch(list,3));	// 이진탐색 전에 정렬 필수 

		fill(list,7); 								//list를 7로 채우다.
		System.out.println(list);
		
		List newList = nCopies(list.size(),3);	 	//list크기만큼의 리스트 생성 후 3으로 채움 
		System.out.println(newList);
		
		System.out.println(disjoint(list,newList)); // 공통요소가 없다면 true
		
		
		replaceAll(list,7, 1); 						//7을 1로 모두 변환 
		System.out.println(list);
		
		
		
		

	}


}
