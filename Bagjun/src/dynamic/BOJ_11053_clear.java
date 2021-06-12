package dynamic;
// #다이나믹#증가#
import java.io.*;
class BOJ_11053_clear{
  public static void main(String args[]) throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(bf.readLine());
    int[] A = new int[count];
    int[] D = new int[count];
    //초기화 
    String[] input = bf.readLine().split(" ");
    for(int i=0; i<count;i++){
      A[i] = Integer.parseInt(input[i]);
    }

    for(int i=0; i<count;i++){
      D[i] = 1;
    }
    
    for(int i=0;i<count;i++){
      for(int j=0;j<i;j++){
        if(A[i]>A[j] && D[i]-1 <= D[j])
          D[i] = D[j]+1;
        
        //와 ㅋㅋ이렇게 했어...ㅎㅎㅎ그럴수있지
        //for문도 이해하기 어려울 뿐더러, if문도 따로따로
        //다음부터 고치기!  
        // for(int j=i-1;j>=0;j--){ 
        //  if(A[i] > A[j]){
        //    if(D[i]-1 <= D[j])
        //      D[i] = D[j]+1;
        //  }
        //}  
      }
    }
    int result =-1;
    for(int i=0;i<count;i++){
      //이 조건문도 복습해야합니다!! 
      result = D[i] > result ? D[i] : result;
    }
    System.out.print(result);
  }
}