//동빈나 설명 - https://blog.naver.com/ndb796/221233570962 

package dynamic;

import java.util.Scanner;

public class fibonacci{
	static int[] memo = new int[100];  // 메모이제이션 
	
	public static int fibonacci(int n) {
		if( n<=1 ) {
			return n;
		}else {
			if(memo[n]>0) {
				return memo[n]; //이미 값이 있다면, 쓰고   없다면, 계산  
			}
			memo[n] = fibonacci(n-1) + fibonacci(n-2);
			return memo[n];
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		fibonacci(num);
		
	}
}
