package level1;
 
import java.util.*;

public class PRO_12917_clear {
    public String solution(String s) {
        Character [] ch = new Character[s.length()]; //문자열 담을 공간 
    
		//문자열 -> 문자로 옮겨닮기 
        for(int i=0 ; i< ch.length ; i++){
            ch[i] = s.charAt(i);
        }
        //reverse로 절열 
        Arrays.sort(ch, Collections.reverseOrder());
        s = "";
        //다시 저장 
        for(int i =0 ;i< ch.length ;i++){
            s +=ch[i];
        }
        return s;
        
   
    }
}

/*다른 풀이 */

//큰 것부터 -> 작은 순  (문자열)
//아스키코드에서 숫자 -> 소문자 -> 대문자 
class Solution {
 public String solution(String s) {
     char[] c = s.toCharArray();  //문자 배열로 변환   
     String str = new String();
     // Arrays.sort(c,Collections.reverseOrder()); //정렬 , reverseOrder()공부필요
     
     Arrays.sort(c); //내림차순 정렬은 아직 모름.. 
     for(int i=c.length-1;i>=0;i--){ //아니 char.length()가 아니라 char.length라고;;
         str += Character.toString(c[i]); // str -> stringbuilder 성능 better : 공부 필요  
     }
     
     
     // s = String.valueOf(c); //char to string 변환 어떻게?? String.valueOf(문자열) 
                             
     String answer = str;
     return answer;
 }
}