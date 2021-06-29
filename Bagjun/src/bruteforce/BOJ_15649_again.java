/* 작성 : 21.06.28 
 * 
 * 브루트포스 by 재귀 
 * 재귀의 구조를 어느정도 익히고 활용해보는 것에 목표를 두자.
 * 
 * 포인트 
 * 방문여부 체크 
 * 
 * 
 */
package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_15649_again {
	static boolean[] visit;
	static int[] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
 
		arr = new int[M];
		visit = new boolean[N];
		dfs(N, M, 0);
	}
	
	public static void dfs(int N,int M,int depth){
		if(depth ==M) {
			for(int val : arr) {
				System.out.print(val+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[depth] = i+1;
				dfs(N,M,depth+1);
				visit[i] = false;
			}
		}
	}

}
