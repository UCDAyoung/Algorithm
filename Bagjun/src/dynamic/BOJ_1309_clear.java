/* 작성 : 21.06.13
 * 수정 : 
 * 확인 : 
 * 질문 : 왜 마지막에만 %mod 해서 틀림 ->  중간중간에 %mod 해줘야하는이유가/..?ㅠ
 * 동물원
 * https://www.acmicpc.net/problem/1309
 *
 ** 점화식 **
 *D[i][0] = 배치 하지 않는 경우 
 *D[i][1] = 왼쪽 / D[i][1] = 오른쪽
 ** 설명 1 ** 
 1. D[i][0] = D[i-1][0] + D[i-1][1] + D[i-1][2] 
 	-> 설명 : 현 i번째에 사자를 배치하지 않는경우,이전 i-1번째는 0과1과2인 경우가 모두 가능하다.
 2. D[i][1] = D[i-1][0] + D[i-1][2] 
 	-> 설명 : 현 i번째에 사자를 왼쪽 배치하는 경우,이전 i-1번째는 0과2인 경우가 가능하다.
 3. D[i][2] = D[i-1][0] + D[i-1][1] 
 	-> 설명 : 현 i번째에 사자를 오른쪽 배치하는 경우,이전 i-1번째는 1과2인 경우가 가능하다.
 ** 최종 **  
 D[i][j] = D[i][0] + D[i][1] + D[i][2];
 * 
 * 
 *
 * 
 */
package dynamic;

import java.util.*;
public class BOJ_1309_clear {
	final static int MOD = 9901;
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		int[][] D = new int[num+1][3];
		
		int none = 0;
		int left = 1;
		int right = 2;
		
		D[1][none] = 1;
		D[1][left] = 1;
		D[1][right] = 1;
		
		for(int i=2; i<=num; i++) {
			
			D[i][none]  =  (D[i-1][0] + D[i-1][1] + D[i-1][2]) % MOD;
			D[i][left]  =  (D[i-1][0] + D[i-1][2]) % MOD;
			D[i][right] =  (D[i-1][0] + D[i-1][1]) % MOD;
		
		}

		int ans = (D[num][none] + D[num][left] + D[num][right]) % MOD;
		System.out.print(ans);
	}

}
