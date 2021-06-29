/* 작성 : 21.06.28
 * 
 * 카잉달력 
 * https://www.acmicpc.net/problem/6064
 * 크기가 너무 커서 x,y둘다 완젼탐색하면 안됨. 
 * (가) x를 고정해서 y만 비교 
 * 
 * 답은 잘나오는데 
 * 틀렸다고 나옴.
 * 
 */
package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_6064_yet {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		StringTokenizer st;
		int n=0;
		int m=0; 
		int x=0;
		int y=0;
		int ans =0;
		
		for(int i=0 ; i<t; i++) {
			ans=0;
			st = new StringTokenizer(bf.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());	
			for(int j=x;j<=40000;j+=n) {
				if((j-1)%m+1 == y) {
					ans =j;
					break;
				}
			}
			if(ans>0)
				System.out.println(ans);
			else 
				System.out.println(-1);
		}
		}
		
		

}
