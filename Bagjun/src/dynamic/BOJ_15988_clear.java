/* 작성 : 21.06.13
 * 수정 :
 * 확인 : 
 * 
 * ****point****
 * 1. 점화식 : dp[n] = (dp[n-1] + dp[n-2] + dp[n-3]) % 1_000_000_009 
 * 2. int[] dp가 아닌 long[]dp인 이유 : int가 담을 수 있는 숫자는 (-20억 정도에서 20억)정도인데, 
 *  	-> dp[n-1] 에서 10억 + dp[n-2]에서 10억 + dp[n-3]에서 20억을 초과   
 * 3. 배열dp에 미리 담고, 골라서 뽑는 느낌 .
 * 
 */
package dynamic;


import java.util.*;
import java.io.*;

public class BOJ_15988_clear {
	static long[] dp;
	static int MOD = 1_000_000_009;
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			
			dp = new long[1000001];
			  
			//초기화 
			dp[1] = 1;
			dp[2] = 2;
			dp[3] = 4;
			
			//bottomUp방식으로 dp[1],dp[2],dp[3]으로 시작해 dp에 값을 저장하고, 
			//그 저장한 값을 다시 이용하며 값을 찾아나간다. == memoization 
					
			for(int j=4;j<=1_000_000;j++) {
				dp[j] = (dp[j-1] + dp[j-2] +dp[j-3]) %MOD ; 
			}
			//저장한dp에서 골라 출력
			
			int tCase = Integer.parseInt(bf.readLine());
			for(int i=0; i<tCase;i++) {
				int num = Integer.parseInt(bf.readLine());
				System.out.println(dp[num]);
			}
		
	}

}
