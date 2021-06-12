package dynamic;

import java.io.*;

class BOJ_2193_clear{
  public static void main(String args[]) throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(bf.readLine());
    //dp[n] = dp[i-1][0]+dp[i-1][1] 앞에 0으로 시작하는 i길이의 수와 앞에 1로 시작하는 i길이의 수;
    long[][] dp = new long[num+1][2];
    //예외 경우 초기화 
    dp[1][0] = 0;
    dp[1][1] = 1;
    //0인 경우 : 연속 0가능 / 1인 경우 : 연속 1불가능 
    for(int i=2; i<=num;i++){
      for(int j=0;j<2;j++){
        if(j==0)
          dp[i][j] = dp[i-1][0] + dp[i-1][1];
        if(j==1)
          dp[i][j] = dp[i-1][0];
      }
    }
  long result = dp[num][0]+dp[num][1];

  System.out.println(result);

  }
}