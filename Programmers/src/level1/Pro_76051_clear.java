/* 작성: 21.06.20
 * 수정 :
 * 확인 :
 * 
 * 음양더하기 
 * https://programmers.co.kr/learn/courses/30/lessons/76501
 * 
 */
package level1;

public class Pro_76051_clear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class Solution {
	    int sum=0;
	    
	    public int solution(int[] absolutes, boolean[] signs) {
	        
	        for(int i=0; i<absolutes.length;i++){
	            if(signs[i] == true)
	                sum += absolutes[i];
	            else 
	                sum -= absolutes[i];
	        }
	                
	        int answer = sum;
	        return answer;
	    }
	}
}


