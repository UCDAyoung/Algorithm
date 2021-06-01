/*
ABCDE
13023번
https://www.acmicpc.net/problem/13023
DFS이용 
5개 노드가 연결된 걸 찾는 문제 => dps로 depth를 1개씩늘려가서 depth가 5이면 1 아니면 0 을 출력 
 
***** 고찰 ******
BufferedReader 를 사용 시 반드시 close를 해줄 것
BufferedWriter 도 출력 시 사용  
남은 버퍼들을 위해 마지막에 bw.flush()로 확인 
split으로 쪼개서 string에 담으면 딱 그정도의 배열 크기만 존재한다. 
배열 요소가 없는 것 과 배열 요소가 null인 건 다르다. (null인 건 배열이 배당되어있지만 내용이 없는 것) 확실히 하자. 
*
*
 */
package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class BOJ_13023_again {
//	class Edge{
//		int from, to;
//		Edge(int from,int to){
//			this.from = from;
//			this.to = to;
//		}
//	}백준에서 엣지들을 따로 ArrayList<Edge>에 담을려고했으나 비효율적이라 뺐음.
	
	
	//사람의 수는 배열에 담고 , 사람마다 연결된 친구들은 리스트로 연결 시키면 된다.
	
	static boolean[][] relation;// 인접행렬 
	static int peopleNum;//사람 숫자 
	static int friendsNum;//친구 숫자 
	static ArrayList<Integer>[] people;
	
	static int depth=0;//dfs 깊이 확인 
	static int ans=0;//answer 0,1 
	static boolean visited[];//dfs 방문확인용 
	
	
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		peopleNum = Integer.parseInt(input[0]); //사람
		friendsNum = Integer.parseInt(input[1]);   //친구 수는 반복문 돌릴 수 있게 주어진 것 while문이라서 쓸모없음
		
		relation = new boolean[peopleNum][peopleNum];//인접행렬 
		people = (ArrayList<Integer>[])new ArrayList[peopleNum];
		visited = new boolean[peopleNum];
		
		for(int i=0; i < peopleNum;i++) {
			people[i] = new ArrayList<Integer>();
		}
		
		
		for(int i = 0 ; i < friendsNum;i++) {
			input = br.readLine().split(" ");
			int from = Integer.parseInt(input[0]);
			int to = Integer.parseInt(input[1]);
			
			relation[from][to] = true;//인접행렬 
			relation[to][from] = true;
			
			people[from].add(to);//인접 리스트 추가 
			people[to].add(from);
			
			
		}
		
		for(int i = 0 ; i < peopleNum; i++ ) {
			if(ans == 0)
				DFS(i,1);
		}
		
		bw.write(Integer.toString(ans));
		bw.flush();
		
		bw.close();
		br.close();
		
		
		return;
	}
	
	public static void DFS(int start, int depth) {
		if(depth == 5) {
			ans=1; // depth 5를 만족하므로 answer = 1로  
			return ;
		}
		visited[start] = true;
		for(int i : people[start]) { 
			int next = i;
			if(!visited[next]) {
				DFS(next,depth+1);
			}
		
		}
		visited[start] = false; //초기화 해줘야 함. 이 문제에서만 
		
		
	}
		
}
		
		
		
		
	
