package hash;
import java.util.*;
public class Pro_42577_startsWith {
	//정렬하고
	//string 비교만..  특정문자열 비교 indexOf  / 전체비교  equals /
	//특정문자열로 시작하거나 startsWith  // 특정문자열로 끝나거나 endsWith  비교대상.~with("특정문자열")
	class Solution {
	    public boolean solution(String[] phone_book) {
	        boolean answer = true;
	        
	        Arrays.sort(phone_book);
	            
	        
	        for(int i=0 ;i<phone_book.length-1; i++){
	        	if(phone_book[i+1].startsWith(phone_book[i])==true)
	        		return false;
	        }
	        
	        return answer;
	    }
	}
}
