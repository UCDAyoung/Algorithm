package package1;

import java.util.*;
//가장 문제되는 것 : 만약 같은 문자열일 경우에는 ??  -> String comparable 이 implements?되어있어서 알아서처리됨. 

class Pro_12195_arrayssort {
  public String[] solution (String[] strings, int n) {
      //charAt이용해서 맨 앞으로 
      //문자와 문자열을 합칠 수가 있을까?
      String[] newStr = new String[strings.length];
      
      
      for(int i=0 ;i<strings.length;i++){
          char selC = strings[i].charAt(n);//선택char 
          newStr[i] = Character.toString(selC)+strings[i];    //선택char앞으로 붙이기     
      }
      Arrays.sort(newStr); //정렬
      //abc def       
  
      //같은 문자열은 어떻게 처리할건데?? 아직도 의문인데 
      //String 내부에 comparable가 포함되어있어서 아아아아아아아아 알아서 띄용??ㅎㅎ
      
      //붙인 문자 자르기 by substring  //소문자임subString (x)        
      for(int i=0 ;i<newStr.length;i++){
          newStr[i] = newStr[i].substring(1);    
      }
      
      
      String[] answer = newStr;
      return answer;
  }
}