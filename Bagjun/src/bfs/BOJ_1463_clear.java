/* 작성 : 21.06.15 
 * 수정 : 
 * 확인 : 
 * 질문 : 
 * 
 * https://www.acmicpc.net/problem/1463
 * 1로 만들기
 * 
 * 1. 먼저 그림그리기 
 *    나는 숫자  -(1)->   쪼개진 나 -(1)-> 쪼개진 나 -(1)->  1 
 *    1.1 숫자를 입력 받으면 되겠구나 
 *    1.2 아 1까지 가는 횟수를 세면 되는구나 
 *    1.3 가중치 1에 , 최단거리를 구하는 방법이니까 bfs이구나!
 * 
 */


package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_1463_clear {
	static final int MAX = 1000000;
	static boolean[] visit;
	static int[] dis; //연산의 횟수를 저장할 곳, 배열로 굳이??-> 어떻게 활용했냐면, 해당 인덱스의 연산횟수를 전 연산횟수 +1 해가며 저장해가면 결국 마지막 1인덱스에는 최종 연산횟수가 남게된다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		visit = new boolean[N];
		dis = new int[N];
		
		bfs(N);
		
		
	}
	
	public static void bfs(int N) {
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(N);
		visit[N]=true;
		dis[N] = 0;
		
		int cur;
		while(!q.isEmpty()) {
			if(N/3==0) {
				cur = N/3;
				q.offer(cur);
				visit[cur] = true;
				dis[cur] = dis[N]+1;
				
			}
			else if(N/2==0) {
				cur = N/2;
				q.offer(cur);
				visit[cur] = true;
				dis[cur] = dis[N]+1;
			}
			else{
				
				cur = N-1;
				q.offer(N);
				q.offer(cur);
				visit[cur] = true;
				dis[cur] = dis[N]+1;
	
				
				
			}
		}
		
	}
}
