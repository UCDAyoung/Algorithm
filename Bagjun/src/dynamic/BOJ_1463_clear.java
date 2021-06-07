/*https://www.acmicpc.net/problem/1463
 * 1로 만들기
 * 
 * 다이나믹 
 * 다이나믹에는 두 가지 방식으로 확인하는 방법이 있다. 
 * 1.bottomup(작은 문자에서 큰 문제로해결해나가거나) 2.topdown(큰 문제에서 작은 문제로 해결해나가거나)
 * 이 방법은 재귀를 이용하는 방법이라는 것을 유의해서 함수를 만들어야 한다.
 * 재귀함수를 통해 모든 경우를 "다" 확인하는 것이다. 조건을 걸어서 확인하는게 아니였음
 * ex)
 * 1) 3으로 나뉘면 3으로 나눠주고 재귀돌리고
 * 2) 2로나 뉘면 2로 나눠서 재귀돌리고 
 * 3) 3과 2로 나뉘지 않으면 1로 빼서 재귀돌리고 
 * 이렇게 조건을 나눠서 재귀를 돌리는게 아니라 "전부"확인하는 것이다. 
 * 1. go(n-3) + 1
 * 2. go(n-2) + 1
 * 3. go(n-1) + 1 
 * 
 * 
 * 
 *
 */


package dynamic;

import java.util.Scanner;

public class BOJ_1463_clear {
	static int[] memo; //계산한결과들을 저장할 공간
	public static int go(int n) {
		if(n==1) {
			return 0;
		}//가장 작은 크기 
		
		if(memo[n] > 0) {
			return memo[n];
		}//0보다 이미 큰 값이라면, 이미 결과가 나온 적이 있어서 저장되어있다.  
		//점화식 방법의 갯수 D[n] = D[n/3] + D[n/2] + D[n-1]
		//전체 문제의 갯수 n * 문제푸는 시간(1) = O(n)
		
		memo[n] = go(n-1) + 1; // D[n-1]
		
		if(n%2 == 0) {
			int temp = go(n/2)+ 1;
			if(memo[n] > temp) {
				memo[n] = temp;
			}//기존의 저장된 것과 비교해서 최솟값을 저장 
		}
		if(n%3 == 0) {
			int temp = go(n/3)+ 1;
			if(memo[n] > temp) {
				memo[n] = temp;
			}//기존의 저장된 것과 비교해서 최솟값을 저장 
		}
		
		
		return memo[n]; //저장된 가장 작은 값 리

	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		memo = new int[num+1];
		System.out.println(go(num));
	}
	
	

}
