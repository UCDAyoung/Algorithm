/* 확인 : 21.06.28
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
 * 
 * 고찰 *
 * 0인 경우도 고려해보자 -> 0인 경우 1,2,3을 아무것도 사용하지 못하는 경우의 수 1이 존재하게 된다.
 * 
 * 알아둘 것 * 
 * 1. 다이나믹에서 시간복접도는 어차피 모든 경우의 수를 다 살펴보는, 모든 문제를 풀어야하는 알고리즘임 
 * 	  그래서 시간복잡도 = 가장 작은 문제를 푸는데 걸리는 시간 * 전체 문제의 수  
 * 
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
