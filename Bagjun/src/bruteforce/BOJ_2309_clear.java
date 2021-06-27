/* 작성 : 21.06.27
 * 수정 :
 * 확인 :
 * 
 * 일곱난쟁이 
 * https:/www.acmicpc.net/problem/2309
 * 
 * 브루트 포스 일명 무식하게 탐색하는 방법이다. 완전탐색이라고도 불린다.
 * 종류 
 * 1. 순열 
 * 2. 재귀 
 * 3. bfs 
 *  
 * 1. 브루트 포스 문제에서 가장 중요한 건, 경우의 수를 확인하는 게 우선이다. 
 *  -> 시간복잡도를 확인해서 내 구상으로 컴퓨터가 계산하게 놥둬도 될지말지를 판단할 수 있기에
 * 2. 시간복잡도를 확인해서 가능하다면 그냥 돌리면 된다.
 *  -> 계산은 너가 할 필요 없이 넌 구상만 하면 된다. 
 *  
 *  
 *  이 문제는 7명의 진짜 일곱난쟁이를 찾는 것. == 2명의 가짜 난쟁이를 속출하는 것. 
 *  순열 문제로 9C2 = 36가지 , 엄청 적은 경우의 수. 
 *  -> 그러므로 이 방법으로 이용하기 가능 
 * 
 *
 * 
 */
package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2309_clear {
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 int[] dwarfs = new int[9];
		 int num1 = 0;
		 int num2 = 0; 
	     int height = 0;
	     
	     for(int i=0; i<9; i++){
	         dwarfs[i] = Integer.parseInt(bf.readLine());
	         height += dwarfs[i];
	     }
	     Arrays.sort(dwarfs);
	     //만약 찾은다음에는 어떻게 할까? 
	     
	     for(int i=0 ;i<9;i++) {
	    	 for(int j=i+1 ; j<9;j++) {
	    		 if(height-dwarfs[i]-dwarfs[j]==100) {
	    			 num1 = i;
	    			 num2 = j;
	    		 }
	    			 
	    			 
	    	 }
	     }
	     for(int i=0 ;i<9 ;i++) {
	    	 if(i==num1 || i==num2)
	    		 continue;
	    	 System.out.println(dwarfs[i]);
	    	 
	     }
	    	 
	}
}
