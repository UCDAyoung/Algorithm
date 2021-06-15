package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_11724_UsingArrayList  {
	static int N;
	static int M;
	static boolean[] visited ;
	static ArrayList<Integer>[] list;// 배열인데, 배열하나하나가 연결리스트이다. 
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		
		String[] st = bf.readLine().split(" ");
		N = Integer.parseInt(st[0]);
		M = Integer.parseInt(st[1]);
		
		visited = new boolean[N+1];
		list = (ArrayList<Integer>[])new ArrayList[N+1];
		
		for(int i=0 ; i< M; i++) {
			st = bf.readLine().split(" ");
			int u = Integer.parseInt(st[0]); // 시작점 
			int v = Integer.parseInt(st[1]); // 시작점에서 연결된 점 
			
			list[u].add(v);
			list[v].add(u);	
		}// 여기까지 입력 
		
		for(int i=0; i<=N ; i++) {
			Collections.sort(list[i]);
		}//왜한거지?? 
		
		int count=0;
		for(int i=1; i<=N;i++) {
			if(!visited[i]) {
				dfs(i);
				count++;
			}
			
		}
		

	}
	public static void dfs(int idx) {
		for(int i=0 ;i<list.length;i++) {
			visited[idx] = true;
			dfs(list[idx].get(i));
		}

	}

}
