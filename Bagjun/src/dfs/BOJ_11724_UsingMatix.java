/* 작성 : 21.06.14
 * 수정 : 
 * 확인 : 
 * 
 * 연설요소의 갯수
 * https://www.acmicpc.net/problem/11724
 * 
 * 연결된 요소의 갯수를 출력하는 것
 * 
 * 
 */
package dfs;


import java.util.*;
import java.io.*;

public class BOJ_11724_UsingMatix{
	static int[][] arr;
	static boolean[] visited;
	static int count;
	static int N;
	static int M;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		
		String[] st = bf.readLine().split(" ");
		N = Integer.parseInt(st[0]);
		M = Integer.parseInt(st[1]);
		
		arr = new int[N+1][N+1];
		visited = new boolean[N+1];
		
	
		for(int i=0 ; i< M; i++) {
			st = bf.readLine().split(" ");
			int u = Integer.parseInt(st[0]); // 시작점 
			int v = Integer.parseInt(st[1]); // 시작점에서 연결된 점 
			
			arr[u][v] = arr[v][u] = 1; //초기화 			
			
		}// 여기까지 입력 
		
		int count =0;
		for(int i=1;i<=N;i++) { 
			if(!visited[i]) {
				dfs(i);
				count++;//들어가고 나올 때마다 count 올려줌.
				
			}
		}//방문되지 않은 곳은 들어가서 dfs로 확인
		System.out.println(count);

	}
	public static void dfs(int idx) {
		if(visited[idx]==true)
			return;
		else {
			visited[idx] = true;
			for(int i=1; i<=N;i++) {
				if(arr[idx][i] ==1 ) {
					dfs(i);
				}
			}
		}
	}

}
