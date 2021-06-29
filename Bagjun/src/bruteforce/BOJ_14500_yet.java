package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14500_yet {
	static int[][] map;
	static int max;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		map = new int[n+1][m+1];
		
		for(int i=0; i<n ;i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j=0 ;j<m ;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		for(int i=0 ;i<n;i++) {
			for(int j=0; j<m;j++) {
				//일자 
				if(j+3<=m && j<=m) {
					int temp = map[i][j]+map[i][j+1]+map[i][j+2]+map[i][j+3];
					if(max<temp)
						max=temp;
				}
				//일자(세운) 
				if(i+3<=n && j<=n) {
					int temp = map[i][j]+map[i+1][j]+map[i+2][j]+map[i+3][j];
					if(max<temp)
						max=temp;
				}
				//정사각형 
				if(i+2<=n && j+2 <=m) {
					int temp = map[i][j]+map[i][j+1]+map[i+1][j]+map[i+1][j+1];
					if(max <temp)
						max= temp;
				}
				//ㄴ자 
				if(i+1<=m && i+2<=n) {
					int temp = map[i][j]+map[i+1][j]+map[i+2][j]+map[i+2][j+1];
					if(max < temp)
						max =temp;
				}
				
				/*	------
				 * |
				 */
				if(j+2<=m && i+1<=n) {
					int temp = map[i+1][j]+map[i][j]+map[i][j+1]+map[i][j+2];
					if(max < temp)
						max =temp;
				}
				/*
				 * --
				 * 	 |
				 *	 |
				 *	 | 	
				 * 
				 */
				
				if(i+2<=n && j+1<=m) {
					int temp = map[i][j]+map[i][j+1]+map[i+1][j+1]+map[i+2][j+1];
					if(max < temp)
						max =temp;
				}
				/* 		 |
				 * ㅡㅡㅡㅡ |
				 */
				if(i-1>=0 && i<=n && j+2<=m) {
					int temp = map[i][j]+map[i][j+1]+map[i][j+2]+map[i-1][j+2];
					if(max < temp)
						max =temp;
				}
					
			}
		}

	}

	
}
