/* 작성 : 21. 06. 11
 * 수정 : 
 * 확인 : 
 * 
 * 1,2,3 더하기 5
 * https://www.acmicpc.net/problem/15990
 * 참고 
 * https://dev-hyun.tistory.com/97
 * 
 * 
 * *****Point*****
 * 값이 연속되면 안됨.
 * 값이 연속될 수 있는 경우에는 D[n] = D[1]+D[2]+D[3]으로 풀 수 있었지만,
 * 이번에는 한 번 더 경우의 수를 쪼개야한다.
 * D[n] ->  D[i][1]/D[i][2]/D[i][3] 의 경우로  
 * 이 안에서   
 * D[i][1] 은 D[i-1][2]+D[i-1][3]  (연속되면 안되니까 D[i-1][1]은 안된다.)
 * D[i][2] 은 D[i-1][2]+D[i-1][3]
 * D[i][3] 은 D[i-1][2]+D[i-1][3]
 * 
 * 또한, 매번 배열에서 값을 찾아서 계산하는게 아니라,
 * 배열에 넣어놓은 다음, 그때 그때 꺼내 사용한다.
 */

package dynamic;

import java.util.Scanner;

public class BOJ_15990_again{

	public static void main(String[] args) {
		
		long[][] dp = new long[100001][4];
		
		dp[1][1] = dp[2][2] = dp[3][3] = 1; //1을 1로, 2를 2로, 3을 3으로 표현하는 경우 1가지.
		
		for(int i=1 ; i<dp.length;i++) {
			if(i>1) dp[i][1] = (dp[i-1][2]+dp[i-1][3])% 1000000009;
			if(i>2) dp[i][2] = (dp[i-2][1]+dp[i-2][3])% 1000000009;
			if(i>3) dp[i][3] = (dp[i-3][1]+dp[i-3][2])% 1000000009;
		}
				
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();//Test case
		
		
		for(int i=0 ; i<T; i++) {
			int num = sc.nextInt();
			long result = (dp[num][1]+dp[num][2]+dp[num][3])%1000000009;
			System.out.println(result);
		}
		
		
		
	

	}

}
