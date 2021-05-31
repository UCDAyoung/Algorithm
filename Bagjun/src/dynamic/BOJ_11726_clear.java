/*
타일링 nx2 문제
11726
https://www.acmicpc.net/problem/11726
동빈나설명 - https://blog.naver.com/ndb796/221233586932
point
가장 작은 단위부터 찾고 -> 규칙을 찾고 ->  점화식을 세우는 게 포인트
D[n] = D[n-1] +D[n-2]
고찰
dp문제들은 최소단위에서 규칙을 찾아 점화식 만들다면 어차피 구현단계는 쉬움.  
Scanner 말고 bufferedReader 쓰도록 하자 메모리 많이 잡아먹는다 .
*/
package dynamic;

import java.util.Scanner;

public class BOJ_11726_clear {
	static int[] d;
	public static int dynamic(int n) {
		if(n==1) return 1;
		if(n==2) return 2;
		if(d[n]!=0) return d[n]; //이미 특정 값을 구해서 저장되어있다면, 그 값 반환
		return d[n] = (dynamic(n-1)+dynamic(n-2)) % 10007; //10007은 값이 커지는 걸 방지하기 위해서 문제에서 주어진 조건  
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		d = new int[num+1];
		System.out.println(dynamic(num));
		
	}
	
}
