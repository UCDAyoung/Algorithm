/*
 결과에서 자꾸 오류남 .... 뭐지..ㅠㅠㅠ
 이거풀고 -> 11724 연결요소 -> 1707 미분그래프  풀어야
 */
package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class BOJ_1260_yet {
	static ArrayList<Integer>[] list;
	static boolean[] visited;   
	 
	
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] input = bf.readLine().split(" ");
		int N = Integer.parseInt(input[0]); //정점 
		int M = Integer.parseInt(input[1]); //간선 
		int V = Integer.parseInt(input[2]); //탐색 시작 정점
		
		list = new ArrayList[N+1];//문제가 1번부터여서 0번은 아쉽게도 같이 생성 
		visited = new boolean[N+1];
		
		
		for(int i=1; i<N+1; i++) {
			list[i] = new ArrayList<Integer>();
		} //정점이 가르키는 연결리스트 생성 (1번부터 생성)
		
		for(int i=0; i<M; i++) {
			input=bf.readLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int m = Integer.parseInt(input[1]);
			
			list[n].add(m);
			list[m].add(n);
			
		}
		
		dfs(V);
		visited = new boolean[N+1];//초기화
		System.out.println();
		bfs(V);
		
	}
	
	public static void dfs(int start) {
		if(visited[start])
			return;
		visited[start] = true;
		System.out.print(start+ " ");
		
		for(int i : list[start]) {
			if(visited[i]==false)
				dfs(i);
		}
	}
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		 
		
		q.offer(start); 		//큐에 넣고  
		visited[start]=true; 	//방문표시   
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			System.out.print(cur + " ");
			
			for(int next : list[cur]) {
				if(visited[next] == false) {
					q.offer(next); 		//큐에 넣
					visited[next] = true;  //방문표시 	
		
				}
					
			}
		}
		
	}

}
