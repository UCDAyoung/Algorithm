/*
 * Point 클래스를 import하지 않고 comparable을 implement해서 사용하려고 한다.
 */
package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11650_Comparable {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		Point[] p = new Point[n];
		
		
		
		for(int i=0 ; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());			
			p[i] = new Point(x,y);
		}
		
		Arrays.sort(p);
		for(Point list : p) {
			sb.append(list.x).append(" ").append(list.y).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();

	}

}

class Point implements Comparable<Point>{
	int x;
	int y;
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point o) {
		if(this.x == o.x)
			return this.y - o.y;
		else
			return this.x - o.x;
	}
}


