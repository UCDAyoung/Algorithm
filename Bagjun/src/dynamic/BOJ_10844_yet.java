/* 작성 : 21.06.12 
 * 수정 : 
 * 확인 :
 *  
 *  쉬운계단수 
 *  10844
 * https://www.acmicpc.net/problem/10844
 * 참고
 * https://webcache.googleusercontent.com/search?q=cache:cCjQbGpV3XcJ:https://st-lab.tistory.com/134+&cd=1&hl=ko&ct=clnk&gl=kr
 * 
 *
 *****고찰*****
 * bottom-up 방식과 Top-down방식의 차이를 이해하자 
 * 예외적인 경우의 수를 정확히 따질 필요가 있다.
 *  
 * 
 */
package dynamic;

import java.io.*;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class BOJ_10844_yet {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int mod =  1000_000_000;
		//[i][j]= 길이가 i이고, 마지막 수가 j인 경우의
		int num = Integer.parseInt(bf.readLine());
		long[][] dp = new long[num+1][10];
		
		dp[1][0] = 0;
		
		for(int i=1;i<=9;i++)
			dp[1][i] = 1; //초기화
		
		//i길이의 j번째 탐색 
		for(int i=2; i<=num;i++) {
			for(int j=0;j<=9;j++) {
				
				if(j-1>=0) 
					dp[i][j]+=dp[i-1][j-1];
				if(j+1<=9) 
					dp[i][j]+=dp[i-1][j+1];
				dp[i][j] %= mod;
				
			}
			 
		}
		
		long ans=0;
		for(int j=0;j<=9;j++) {
			ans += dp[num][j];
			ans %= mod;
		}
		System.out.print(ans);
			
		
		
		

	}

}
