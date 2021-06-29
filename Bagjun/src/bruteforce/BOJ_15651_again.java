/* 작성 : 21.06.28
 * 
 * 15649 와 동일한 문제, 단, 중복을 허용하기 때문에 
 * 중복 제부분문 주석처리해주면 된다.
 * 
 */
package bruteforce;

import java.io.IOException;
import java.util.Scanner;

public class BOJ_15651_again {

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
		if(depth ==M) { //자릿수가 M이 된다면 끝 
			for(int val : arr) {
				System.out.print(val+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0;i<N;i++) {
//			if(!visit[i]) {
//				visit[i] = true;
				arr[depth] = i+1;
				dfs(N,M,depth+1);
//				visit[i] = false;
//			}
		}
	}

}
