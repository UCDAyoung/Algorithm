/* 작성 : 
 * 수정 :
 * 확인 :
 * 
 * https://programmers.co.kr/learn/courses/30/lessons/42862
 * 
 */
package level1;

import java.util.Arrays;

public class Pro_42682 {

	public static void main(String[] args) {
		

	}
	

}

class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		
		Arrays.sort(lost);
		Arrays.sort(reserve);
		//여벌 옷이 있는 사람이 도난당할 경우 
		for(int i=0 ;i<lost.length;i++) {
			for(int j=0; j<reserve.length;j++) {
				if(lost[i] == reserve[j]) {
					answer++;
					lost[i] = -1;
					reserve[j] = -1;
					break;
				}
			}
		}
		//
		for(int i=0 ;i<lost.length;i++) {
			for(int j=0; j<reserve.length; j++) {
				if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])) {
					answer++;
					reserve[j] = -1;
					break;
				}
			}
		}
		return answer;
	}
}
