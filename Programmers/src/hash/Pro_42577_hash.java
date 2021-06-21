/* 작성 : 21.06.21 
 * 수정 :
 * 확인 :
 *  * 입력 배열의 길이의 최대값이 100만이기 때문에 시간효율이 N^2이 되어선 절대 안된다고 생각했다.
 * 그래서 N*M을 생각해냈다. N은 최대 100만 M은 최대 20으로 최대 2000만이다.
 * 해시의 탐색능력(O(1))이 대단하다는 것을 다시한번 느낀다.

 * //getOrDefualt( key, default값 ) key가 이미 있다면 1 , 없다면 value 는 default값 
 * //아니 문자열 길이도 까먹음? length() ㅋㅋ
 * 
 */
package hash;
import java.util.*;

public class Pro_42577_hash {
	

	class Solution {
	    public boolean solution(String[] phone_book) {
	        HashMap<String,Integer> maps = new HashMap<String,Integer>();
	                
	        for(String s : phone_book)
	            maps.put(s,maps.getOrDefault(s,0)+1); //key값이 없다면 1 , 이미 있다면 2  로 초기화!!         
	        
	        for(int i=0; i<phone_book.length;i++){
	            for(int j=1;j<phone_book[i].length();j++){                 
	                if(maps.containsKey(phone_book[i].substring(0,j))==true)
	                    return false;                
	            }            
	        }                                         
	        boolean answer = true;
	        return answer;
	    }
	}
}
