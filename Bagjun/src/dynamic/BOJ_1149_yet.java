/* 작성 : 21.06.13
 * 수정 :
 * 확인 :
 * 
 * 분명 점화식 다 이해했는데, 결과가 안나옴.
 * 분명 가격들도 n만큼 달라서 for문 돌려서 초기화 시키면서 해야한느거 아닌가?
 * 
 * dp[j][0] = Math.min(dp[j-1][1], dp[j-1][2]) + dp[j][0];//빨강 
 * dp[j][1] = Math.min(dp[j-1][0], dp[j-1][2]) + dp[j][1];//초록 
 * dp[j][2] = Math.min(dp[j-1][0], dp[j-1][1]) + dp[j][2];//파랑
 * 
 * dp[j][0] , dp[j][1] , dp[j][2] 중 작은 놈...
 * 분명 맞는데 어디지..
 */
package dynamic;

import java.util.*;
import java.io.*;
public class BOJ_1149_yet {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(bf.readLine()); //집 갯수
		int[][] cost = new int[n][3];
		int[][] dp = new int[n+1][3];
		int result=999999;
		
		//가격 저장 
		for(int i = 0 ; i < n ; i++) {
			st = new StringTokenizer(bf.readLine()," ");
			
			cost[i][0] = Integer.parseInt(st.nextToken());
			cost[i][1] = Integer.parseInt(st.nextToken());
			cost[i][2] = Integer.parseInt(st.nextToken());
		}
		
//		for(int i =0 ; i<n ;i++) {
			//가격 설정
			dp[1][0] = cost[0][0];
			dp[1][1] = cost[0][1];
			dp[1][2] = cost[0][2];
			
			for(int j=1;j<n ; j++) {
				dp[j][0] = Math.min(dp[j-1][1], dp[j-1][2]) + dp[j][0];//빨강 
				dp[j][1] = Math.min(dp[j-1][0], dp[j-1][2]) + dp[j][1];//초록 
				dp[j][2] = Math.min(dp[j-1][0], dp[j-1][1]) + dp[j][2];//파랑
			}
			int minNum = Math.min(Math.min(dp[n][0],dp[n][1]),dp[n][2]);
			if(result>minNum)
				result = minNum;
		
//		}
		System.out.println(result);
		}
	}
