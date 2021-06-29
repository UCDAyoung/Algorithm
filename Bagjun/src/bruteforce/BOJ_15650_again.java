package bruteforce;

import java.util.Scanner;

public class BOJ_15650_again {
//	static boolean[] visit; 필요없음 .
	static int[] arr;
	static int N,M;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[M];
//		visit = new boolean[N];
		
		
		dfs(N,M,0,1);
		System.out.println(sb);
	}
	
	public static void dfs(int N,int M,int depth,int start) {
		if(depth == M) {
			for(int n : arr)
				sb.append(n+" ");
			sb.append("\n");
			return;
		}
		
		for(int i=start; i<=N; i++) {
//			if(!visit[i] || ) {
				
//				visit[i] = true;
				arr[depth] = i; //지금depth(자리)에 i 배치 
				dfs(N,M,depth+1,start+1);
//				visit[i] = false;
				
			}
		
		
			
	}
}
