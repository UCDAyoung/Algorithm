/* 작성 : 21.06.13
 * 수정 : 
 * 확인 :
 * 질문 : 
 * 
 * 정수삼각형
 * https://www.acmicpc.net/problem/1932
 * 참고블로그
 * https://st-lab.tistory.com/131
 * 
 ** point ** 
대각선왼쪽 과오른쪽으로 가는 2가지 경우의 수 밖에 존재하지 않는다는 것을 잡는게 포인트
D[i][j] = i번째 줄의 현재 칸/ j=0 : Left / j=1 : right 

D[i][0] = 현재  A[i] + 아래 줄 둘중 최대 max(D[i-1][0], D[i-1][1]) 
 * 
 */
package dynamic;

import java.util.*;
import java.io.*;

public class BOJ_1932_yet {
	static int n;
	static Integer[][] D;
	static int[][]arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	
	n = Integer.parseInt(bf.readLine());
	arr = new int[n+1][n+1];
	D = new Integer[n+1][n+1];
	
	for(int i =1 ; i<=n ;i++) {
			st = new StringTokenizer(bf.readLine()," ");
			int j=1;
			while(!st.hasMoreTokens())
				arr[i][j++]=Integer.parseInt(st.nextToken());	
	}
	//가장 마지막 행의 값들은 그대로 더하기만 할거라서 값의 변동이 없음. 그래서 D값에 미리 복사 
	for(int i=1; i<=n;i++) {
		D[n][i] = arr[n][i];
	}
	
	//내가 하긴 한건데 틀린 것 같음 ㅠㅠ
//	for(int i=1; i<=n ;i++) {
//		for(int j = 1; j<= n; j++) {
//			if(i>2 | i<n)
//				D[i][j] = Math.max(D[i-1][0], D[i-1][1])+D[i][j];
//			else 
//				D[i][j] = D[i-1][1];
//		}
//	}
	System.out.println(find(0,0));
	}
	
	//bottomUp방식 
	static int find(int depth, int idx) {
		if(depth == n) return D[depth][idx]; 
		
		if(D[depth][idx] ==null) {
			D[depth][idx] = Math.max(find(depth+1,idx),find(depth+1,idx+1))+arr[depth][idx];
		}
		return D[depth][idx];
	}	
}
