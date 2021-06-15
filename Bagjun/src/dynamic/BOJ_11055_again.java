/* 작성 : 21.06.14
 * 수정 : 이 문제 점화식 다시 봐야함. 아직 점화식 완벽히 이해 못함.  
 * 확인 : 
 * 
 * 가장 큰 증가하는 부분수열
 * https://www.acmicpc.net/problem/11055
 * 
 * 원래 값을 저장할 배열 Value 
 * 더한 크기를 담는 배열 sumValue
 * 이전 인덱스를 기록하는 배열 preIdx //여기서 필요없음 .
 *  
 * 
 * 
 */
package dynamic;

import java.util.*;
import java.io.*;

public class BOJ_11055_again {
	static int[] Value;
	static int[] sumValue;

	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(bf.readLine());
		
		Value = new int[n];
		sumValue = new int[n];
		
		
		st = new StringTokenizer(bf.readLine()," ");
		int cnt= 0;
		while(st.hasMoreTokens()) {
			
			Value[cnt] = Integer.parseInt(st.nextToken()); 
			cnt++;
		}
		sumValue[0] = Value[0];
		
		for(int i=1; i<n; i++) {
			sumValue[i] = Value[i];
			for(int j=0 ; j<i ; j++) {
				if(Value[i] > Value[j])
					sumValue[i] = Math.max(sumValue[j]+Value[i],sumValue[i]);//???
					
			}
		}
		int max=-1;
		for(int j=0 ;j<n ; j++) { 
			max = max<sumValue[j] ? sumValue[j]:max;
		}
		
		System.out.println(max);
		

	}

}
