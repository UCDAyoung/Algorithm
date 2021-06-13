/* 작성 : 21.06.13 
 * 수정 : 
 * 확인 : 
 * 질문 : 
 *  
 * 포도주 시식 
 * 2156
 * https://www.acmicpc.net/problem/2156
 ** 점화식 **
 1. 1차 배열을 이용하는 방법
 	D[i] = i번째 술을 먹었을 때 최대 양
 	0 : 안마심  / 1 : 첫잔째 마심 / 2 : 연속 두잔째 마심.
 	1.1) D[0] = D[i-1]  
 	-> i번째 안마셨어도, i-1번째에도 마셨는지 안마셨는지 모름.  그래서 단순히 D[i-1]의 최대를 가져옴.
 	1.2) D[1] = A[i] + D[i-2]  
  	-> i번째 1번 마심 A[i] / 이전i-1 안마심 / D[i-2] : i-2번째 최대를 가져옴  
  	1.3) D[2] = A[i]+ A[i-1] + D[i-3]
  	-> i번째 2번 연속째임 A[i]/ 이전i-1 마심 : A[i-1] / i-2: 안마심 / D[i-3] : i-3 의 최대를 가져옴    
  최종 점화식 : 이 중 최대를 구하면 됨 Math.max ( ~ ,~ ,~) 
 
 2. 2차 배열을 이용하는 방법
 	D[i][3] = D[i][0] + D[i][1] + D[i][2]; i번째 마시는 최대 양 
 	2.1  D[i][0] = D[i-2] 
 	2.2  D[i][1] = D[i-1][0] + A[i];
 	2.3  D[i][2] = D[i-1][1] + A[i];
  
 * 
 */
package dynamic;

import java.util.*;

public class BOJ_2156_clear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] D = new int[n+1];  
		int[] A = new int[n+1]; // 한 잔에 담긴 포도주 양 
		
		for(int i=1; i<=n ;i++) { //1번째부터  
			A[i] = sc.nextInt();
		}
		//초기화
		D[1] = A[1]; //1번째 잔 
		if(n > 1)    //n이 1이 주어질 경우 대비 
			D[2] = A[1]+A[2]; // 2번째 잔은 무조건 첫째잔, 둘째잔 다 마시는게 최댓값. 
		
		
		for(int i=3; i<=n; i++) {
			//마지막 잔이 빈 경우/ 한 잔째 / 두 잔째 인경우 
			D[i] = Math.max(Math.max(D[i-1],A[i] + D[i-2]),A[i] + A[i-1] + D[i-3]);  
		}
		System.out.println(D[n]);
		
	}

}
