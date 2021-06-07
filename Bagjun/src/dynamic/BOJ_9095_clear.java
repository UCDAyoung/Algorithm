/*
 * 9095
 * 1,2,3 더하기
 * 전형적인 다이나믹 풀이 
 * https://www.acmicpc.net/problem/9095
 * 
 * 포인트*
 * 가장 작은 경우의 수부터 확인
 * 1인 경우 1가지
 * 2인 경우 2가지
 * 3인 경우 4가지 
 * 4부터는 1,2,3으로 쪼개짐 
 */
package dynamic;

import java.util.Scanner;

public class BOJ_9095_clear {
	static int[] memo;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n = 0;
		for(int i=0 ; i<T; i++) {
			n = sc.nextInt();
			memo = new int[n+1];
			System.out.println(dynamic(n));
		}
		
		

	}
	
	public static int dynamic(int n) {
		
		if(n==1) return 1;
		if(n==2) return 2;
		if(n==3) return 4;
		
		if(memo[n]>0)
			return memo[n];
		
		return memo[n]=(dynamic(n-1)+dynamic(n-2)+dynamic(n-3))%10007;
	}

}
