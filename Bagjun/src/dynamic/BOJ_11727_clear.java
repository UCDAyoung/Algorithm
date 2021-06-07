/*
 * 11727 
 * 타일링x2 2
 * 
 * 포인트
 * 타일링x2와 동일
 * 2x2인 경우에 만들 수 있는 타일링규칙이 3가지임 
 */
package dynamic;

import java.util.Scanner;

public class BOJ_11727_clear {
	static int[] memo;
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		memo = new int[n+1];
		System.out.println(dynamic(n));		
		
	}
	public static int dynamic(int n) {
		
		if(n==1) return 1;
		
		if(n==2) return 3;  // 2x2칸일 때 경우의 수는 3가지 
		
		if(memo[n]>0)
			return memo[n];
		
		
		return memo[n]=(dynamic(n-1)+dynamic(n-2)+dynamic(n-2)) %10007;
	}
}
