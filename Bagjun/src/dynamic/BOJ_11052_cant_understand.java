/*
 * 카드 구매하기
 * https://www.acmicpc.net/problem/11052
 * 
 * D[n] = P[i] 마지막에 고른 카드  + D[i-j] 마지막에 고른 카드 뺀 나머지  
 */
package dynamic;

import java.util.Scanner;

public class BOJ_11052_cant_understand {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 
		int cardPack[] = new int[N+1];
		int maxCost[] = new int[N+1];
		
		for(int i=1 ; i<N+1 ;i++) {
			cardPack[i] = sc.nextInt();
		}
		//cardPack[i] 는 i개의 카드팩을 사기 위한 비용 	
		//maxCost[j-i] 는 이미 i개를 뽑은 나머지 카드들 중 최대 비용   
		for(int i=1;i<N+1;i++) {
			for(int j=1;j<= i ;j++) {
				maxCost[i] = Math.max(maxCost[i],cardPack[j]+maxCost[i-j]);
			}
		}
		
		
		

	}

}
