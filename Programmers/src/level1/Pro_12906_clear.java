/* 21.06.24
	배운점
	1. ArrayList와 LikedList의 속도 차이 
	ArrayList : 빠른 것 : 조회 , 끝 삽입,끝 삭제(단,확장시 차이)  / 느린 것 : 삭제, 중간삽입
	LinkedList : 비교적 빠른 것 : 중간 삽입, 중간 삭제 /느린 것 : 조회  
	2. 

	for(int i=0 < list.size() ; i++)
	int num = list.remove(0); 
	삭제하면서 값을 리턴해서 맨 앞에 값을 받아올 수 있다. 
	주의!!! 삭제시 사이즈도 같이 줄어들어서 반복문 사용할 때 전체 사이즈도 줄일 수 있도록 밖에서
	연동해줘야함.


	//배열 과 리스트와 어떻게 연결해서 사용할지가 아직 미숙함. 
*/
package level1;
import java.util.*;

public class Pro_12906_clear {

	public static void main(String[] args) {
	}
	    public Integer[] solution(int[]arr) {
	       List<Integer> list = new ArrayList<Integer>();
	        
	        for(int i=0 ; i<arr.length-1 ; i++){            
	            if(arr[i]!=arr[i+1])
	                list.add(arr[i]);                
	        }
	        list.add(arr[arr.length-1]);
	        
	        //Integer타입의 새로운배열 객체를 만들어서 list값을 옮겨 담는다. 그리고 answer가 참조.
	        Integer[] answer = list.toArray(new Integer[list.size()]);
	        
	        
	    
	        return answer;
	    }
	    
}

