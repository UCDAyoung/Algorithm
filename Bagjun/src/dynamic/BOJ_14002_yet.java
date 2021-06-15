/* 작성 : 21.06.12 
 * 수정 : 
 * 확인 :
 * 
 * 14002
 * 
 * 다이나익 - LIS
 * 
 */
package dynamic;

import java.io.*;
import java.util.*;

public class BOJ_14002_yet {

		static int[] PreIdx;//previous
		static int[] dp;
		static int[] Value;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(bf.readLine());
		PreIdx = new int[count]; // 이전 인덱스   
		Value = new int[count];	// 배열의 값  
		dp = new int[count]; // 수열의 길이 
		
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		
		for(int i =0; i< count;i++)
			Value[i] = Integer.parseInt(st.nextToken());
		
		for(int i=0; i< count; i++) {
			//초기화
			dp[i] = 1;		//하나도 부분수열에 해당하기 때문에, 모두 1  
			PreIdx[i] = -1; //-1로 초기화
			
			// i 이전 값들과 비교하여 dp[i] 값 찾기    
			for(int j=0; j<i; j++) {	
					if( Value[i] > Value[j] && dp[i] <= dp[j]) {
							dp[i] = dp[j]+1;
							PreIdx[i] = j; //이전 인덱스 정보를 저장 
					}
							 
			}
		}

		//최대dp값 따로 골라내기 
		int max = -1;
		int maxIdx = -1;
		for(int i =0 ;i<count;i++) {
			if(max < dp[i]) {
				max = dp[i];// 가장 긴 수열의 길이를 저장 
				maxIdx = i; // 가장 긴 수열의 인덱스를 저장
				
			}
		}
		System.out.println(max);
		System.out.print(go(maxIdx));
		
			// maxIdx부터 시작해서 거꾸로 돌아가면서 뽑아내야해서 따로 저장해야함. 
			//어디에 당ㅁ을까?? 배열? is best.
			//P[i]가 0이 나올 때 까지 담는다 
		}
		//거꾸로뽑는 방법이 뭐가 있을까?? 
		// 재귀, 스택, 우선순위 큐, 배열 다시 만들기 .. 
	static String go(int idx) {
		int newIdx;// 이전 인덱스 담을 변수
		if(PreIdx[idx] == -1)
			return "";
		newIdx = PreIdx[idx]; //이전 인덱스 복사
		
		return go(newIdx) + Value[idx]+" " ;	// 여기 다시해야함.	
		
		
		
		
	
		
	}

}
