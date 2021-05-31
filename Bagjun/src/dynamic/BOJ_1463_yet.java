//1로 만들기
//https://www.acmicpc.net/problem/1463

package dynamic;

import java.util.Scanner;

public class BOJ_1463_yet {
	static int[] memo ; //계산한결과들을 저장할 공간
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
		return memo[n];

	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		memo = new int[num+1];
		System.out.println(go(num));
	}
	
	

}
