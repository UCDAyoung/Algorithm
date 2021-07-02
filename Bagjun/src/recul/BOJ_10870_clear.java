package recul;
import java.util.*;


public class BOJ_10870_clear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int answer1 = recul(n);
		int answer2 = dp(n);
		System.out.println(answer2);
	}
	
	//재귀로 푸는 방법
	public static int recul(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		
		return recul(n-1)+recul(n-2);
		
	}
	//dp로 푸는 방법
	public static int dp(int n) {
		
		//n 그대로 사용할거 n+1 
		int[] dp = new int[n+1];
		
		dp[0]=0;
		//n이 1이면  dp[1]이 outofbound가 됩니다. 
		if(n==0)
			return 0;
		dp[1]=1;
		
	
		for(int i=2 ;i<=n;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		
		return dp[n];
		
		
	}
}
