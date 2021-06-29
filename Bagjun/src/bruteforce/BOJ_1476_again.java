/* 작성 : 21.06.28
 * 수정 :
 * 확인 :
 * 
 * 날짜계산 1476번 
 * https://www.acmicpc.net/problem/1476
 * 
 * E는 총 15가지 
 * S는 총 28가지 
 * M은 총 19가지 
 * 
 * 15x28x19가지 == 많지않음 ->브루트포스 ㄱㄱ 
 * 
 * new알게된 점 
 * 1. for(int i=0 ;; i++) 제한을 두지 않고 증가시키기 가능
 * 2. mod를 저런 방식으로 활용할 수 있음 . 
 * 3. 모듈러 음수 연산
 * 		1) 양수처럼 생각해서 Mod 연산하기 
 * 		2) 나온 결과에 
 * 		2) 나눠준 수 더하기 
 * 	 -3 % 15  -> 양수처럼 생각 -> 3%15 = 3 -> 나눠준 수 더하기 -> -3 + 15 = 12;
 *   
 * 	
 * 
 * 
 */

package bruteforce;
import java.util.*;
import java.io.*;
public class BOJ_1476_again {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int e=1,s=1,m=1; 
		int E = sc.nextInt(); 
		int S = sc.nextInt(); 
		int M = sc.nextInt();

		
		for(int year =1;;year++) {
			
			if(e==E && s==S && m==M) {
				System.out.println(year);
				break;
			}
			e+=1;
			s+=1;
			m+=1;
			if(e==16)
				e=1;
			if(s==29)
				s=1;
			if(m==20)
				m=1;
		}
			

	}
	public static void anotherSolution() {
		//???왜 
		int year = 1;
		//y
		while(true) {
			if((year-E)%15==0 && (year-S)%28==0 &&(year-M)%19==0 )
				break;
			year++;
		}
	}

}
