package dfs;

import java.io.*;
import java.util.*;

public class BOJ_1707 {
	static int[] color;
	static ArrayList<Integer>[] graph;
	static int red = -1;
	static int blue = 1;
	static int none = 0;//Not visit
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(bf.readLine());
		StringTokenizer st;
		
		
		for(int i=0 ; i< tc; i++) {
			st = new StringTokenizer(bf.readLine()," ");
			int V = Integer.parseInt(st.nextToken()); // 정점 
			
			graph = (ArrayList<Integer>[])new ArrayList[V+1];
			color = new int[V+1];
			
			for(int j=0;j<V;j++) {
				st = new StringTokenizer(bf.readLine()," ");
				int E1 = Integer.parseInt(st.nextToken());  
				int E2 = Integer.parseInt(st.nextToken());
				
				graph[E1].add(E2);
				graph[E2].add(E1);
				
			}//여기까지 입력
			
			for(int idx=1; idx<=V; idx++) {//간선만큼 dfs
				if(color[idx] == none)// 방문한 적이 없다면 
					dfs(idx,1);		//dfs돌리면서 색깔 체크 		
			}
			String result = "YES";//초기  
			for(int k=1 ;k<=V;k++) {
				for(int l=1;i<=graph[k].size();l++) {
					if(color[k] == graph[k].get(l)) {
						result = "NO";
						return;
					}
				}
				
			}
			if(result.equals("NO"))
				System.out.println("NO");
			else
				System.out.println("YES");
			return;
		} 
	

	}

	
	public static void dfs(int idx,int c) {
		color[idx] = c;
		
		for(int i =0 ;i < graph[idx].size();i++) {
			int next = graph[idx].get(i);
			if(color[next]==0)
				dfs(next,3-c); //3-c가 포인트, 계속 전환하면서 dfs 
		}
	}

}
