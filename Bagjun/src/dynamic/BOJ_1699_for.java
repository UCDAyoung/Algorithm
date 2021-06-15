/* 작성 : 21.06.14 (1699 복습)
 * 
 */
package dynamic;

import java.util.*;

public class BOJ_1699_for {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	int[] dp = new int[n+1];
	dp[1] = 1; // 1의 최소항은 무조건 1
	
	for(int i=2; i <= n ;i++) {
		dp[i] = i; // dp값 : 1^2의 갯수??로 초기화 
		//j^2이 i보다 작을 때까지 
		for(int j=1; j*j<i;j++) {
			dp[i] = Math.max(dp[i],	dp[i-j*j]+1); //+1이유 : j^2을 뺀 i의 최소항의 갯수에 갯수    
		}
	}
	System.out.println(dp[n]);
	}
	
}