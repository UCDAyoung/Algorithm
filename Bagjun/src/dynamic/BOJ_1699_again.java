/* 작성 : 21.06.13(topdown재귀 방식 이용)
 * 수정 : bottomTop 반복문으로 다시 풀기  
 * 확인 :
 * 
 * 참고
 * https://hongjw1938.tistory.com/62
 * 1699 
 * 제곱수의 합 
 * https://www.acmicpc.net/problem/1699
 * 
 * 빅오 : N*루트N  -> 이유 : 1<= i^2 <= N  이라서 i 경우는 루트N번  
 * 
 */
package dynamic;

import java.util.*;
import java.io.*;


public class BOJ_1699_again {
	static int[] memo;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		memo = new int[N+1];
		memo[1] = 1; // 1의 최소항은 항상 1 
		
		topDown_dp(N);
		System.out.println(memo[N]);
		
		

	}
	
	static int topDown_dp(int N) {
		if(memo[N]>0 || N==1) return memo[N];
		
		memo[N]=N;
		
		for(int i=1; i*i<=N ;i++) {
			int temp = topDown_dp(N-i*i);
			if(temp+1 < memo[N])
				memo[N] = temp+1;
		}
		
		return memo[N];
	}

}
