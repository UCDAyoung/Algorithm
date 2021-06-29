/* 작성 : 21.06.28
 * 
 * 
 * 알게된 점 
 * StringBuilder  사용 
 * 
 * 
 */

package bruteforce;

import java.util.Scanner;

public class BOJ_15652_again {
	static int arr[];
	static int N;
	static int M;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
 
		arr = new int[M];
		
		dfs(0,1);
		System.out.println(sb);
		


	}
	public static void dfs(int depth,int start) {
		if(depth == M) {
			for(int n: arr) {
				sb.append(n).append(" ");
			}
			sb.append("\n");			
			return;
		}
		//오름차순이라서 중복걱정없이 그냥 자릿수만 더해주고  
		for(int i=start; i<=N;i++) {
			arr[depth] = i;
			dfs(depth+1,i);//나머지 동
		}
	}
//조합으로 푸는 방법 :selected:ㅈ금까지 선택된 갯수 / index: 선택한 숫 
	public static void selectDfs(int index,int selected) {
		if(selected == M) {
			for(int n: arr) {
				sb.append(n).append(" ");
			}
			sb.append("\n");			
			return;
		}
		if(index>N) return; 
		for(int i=M-selected;i>=1;i--) {
			arr[index] = i; //고른 숫자에 i를?  ??이해못함.
			selectDfs(index+1,selected+i);
		}
		arr[index] = 0;
		selectDfs(index+1,selected);
	}
}
