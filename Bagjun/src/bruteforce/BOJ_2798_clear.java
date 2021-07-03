/* 작성 : 21.07.03 
 * 수정 : 
 * 확인 :
 * 
 * 블랙잭 
 * https://www.acmicpc.net/problem/2798
 * 
 * 입력 : N장의 카드가 주어짐 , 딜러가 M 이란 숫자가 주어짐
 * N장 중 3장 고를 수 있음. 3장의 합이 M을 넘으면 안됨. 
 * 
 * 시간복잡도 체크 
 * 3<= N <= 100  
 * 10<= M <= 300,000
 * 
 * 빅오 : 카드 100개 주어져서 배열에 담아도 배열의 크기가 100개
 * 
 * 100 * 99 *98 대략 1000000번(백만번) 연산 < 1억을 넘지 않는다. 
 */
package bruteforce;

import java.io.*;
import java.util.StringTokenizer;



public class BOJ_2798_clear {
	public static void main(String[] args) throws IOException {
		//long beforeTime = System.currentTimeMillis();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		//첫 줄 입력 
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken()); 		 
		int[] arr = new int[n];
		
		//두번째 줄 입력 
		st = new StringTokenizer(bf.readLine());
		for(int i=0 ;i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// M을 넘지 않는 && 가장 큰 숫자를 answer에 담아서 출력
		// 효율을 따지지 않고 무작정 다 돌릴 생각만 했던 1번째 풀이 
		//solve1(n,m,arr);
		// 효율을 좀 더 생각한 2번째 풀이 
		int answer = solve2(n,m,arr);
		
		

		
		bw.write(answer+"");
		//long afterTime = System.currentTimeMillis();
		//System.out.println(afterTime-beforeTime);
		bw.flush();
		bw.close();
		bf.close();
		
	}
	
//	public static int solve1(int n,int m,int[] arr) {
//		
//		for(int i=0;i<n;i++) {
//			for(int j=i+1;j<n;j++) {
//				for(int k= j+1; k<n; k++) {
//					int temp = arr[i]+arr[j]+arr[k];
//					answer = temp <= m && answer < temp ? temp : answer;
//			
//				}
//			}
//		}
//		return answer;
//	}
//	
	
	public static int solve2(int n,int m,int[] arr) {
			int answer=0;
			
			for(int i=0;i<n-2;i++) { 						//n-2 까지 
				if(arr[i]>m) continue;						//조건 추가  
				for(int j=i+1;j<n-1;j++) {					//n-1까지 
					if(arr[i]+arr[j]>m) continue;			//조건 추가
					for(int k= j+1; k<n; k++) {
						int temp = arr[i]+arr[j]+arr[k]; 	
						if(temp==m) return temp; 			//조건 추가
						if(temp<m && answer < temp)			//삼항연산자 -> 조건문 
							answer = temp;
						 
				
					}
				}
			}
			return answer;
		}

}
