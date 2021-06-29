/* 작성 : 21.06.27
 * 배열돌리기 
 * https://www.acmicpc.net/problem/16926
 * 
 * 
 */

package simultation;

import java.io.BufferedReader;
import java.util.StringTokenizer;

public class BOJ_16926_yet {
	private static int n,m,r;
	private static int[][] map;
	
	private static int[] dx = {0,1,0,-1};
	private static int[] dy = {1,0,-1,0};
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		
		
		map = new int[n+1][n+1];
		
		for(int i=1; i<= n; i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j=1; j<=m;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int num = Math.min(n, m)/2;// 회전하는 사각형의 갯수 
		
		for(int i=0; i<r; i++) {
			circulate(num);
		}
	}
	
	private static void circulate(int num) {
		for(int i=1; i<= num; i++) {
			int x =i;
			int y = i;
			int temp = map[x][y];
			
			int index = 0;
			
			while(index < 4) {
				int nx = x+dx[index];
				int ny = y+dy[index];
				
				if(nx < i || ny <i || nx >m-i+1) {
					index++;
				}else {
					map[x][y] = map[nx][ny];
					
					x = nx;
					y = ny;
				}
			}
			map[i+1][i] = temp;
		}
	}
}
