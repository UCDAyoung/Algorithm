/* 작성 : 21.06.28
 * 강의 더 들어야함 . 
 * 아직 NM과 K(1) 4가지설명중 1가지만 그나마 이해한 정도?
 * https://code.plus/lecture/641
 * 재귀문제
 * 
 * 
 */
package bruteforce;

import java.util.*;
import java.io.*;

public class BOJ_18290_yet {
	static int[][] map;
	static int N;
	static int M;
	static int K;
	static int[] dx = {-1,0,0,1};
	static int[] dy = {0,1,-1,0};
	static boolean visit[][];
	public static void main(String[] args) throws IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(bf.readLine());
	N = Integer.parseInt(st.nextToken()); // 행 
	M = Integer.parseInt(st.nextToken()); // 열 
	K = Integer.parseInt(st.nextToken()); // 선택할 칸 수
	map = new int[N][M];
	visit = new boolean[N][M];
	for(int i=0; i<N;i++) {
		st = new StringTokenizer(bf.readLine());
		for(int j=0; j<M;j++) {
			map[i][j] = Integer.parseInt(st.nextToken());
		}
	}
	
	System.out.println(dfs(0,0));
	
	}
	
	public static int dfs(int Kcnt, int sum) {
		if(Kcnt==K)
			return sum;
		for(int x=0; x<N; x++) {
			for(int y=0; y<M; y++) {
				if(visit[x][y]) continue;
				boolean ok = true;
				for(int i=0 ;i<4;i++) {
					int nx = x+dx[i];
					int ny = y+dx[i];
					if(nx>=0 && ny >=0 && nx <= N && ny <= M) {
						if(visit[nx][ny]) ok = false;
					} 	
				}
				if(ok) {
					visit[x][y] = true;
					dfs(Kcnt+1,sum+map[x][y]);
					visit[x][y] = false;
					
					
				}
			}
		}
		return sum;
	}
	
	
	
}	
