/* 작성 : 21.06.28
 * 
 * https://www.acmicpc.net/status?user_id=fnfn134&problem_id=1748&from_mine=1
 * 예외를 통과못함. ㅠ
 */
package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1748_yet {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str  = bf.readLine();
		int n =Integer.parseInt(str);
		int strLen = str.length(); //숫자 자릿수  
		int ans=0;
		
		//n = 120 strLen =3  
		//3,2,1 -> 
		//1. 120-(1*100)+1 = 21 * 3 = 63
		//2. 9*10 *2 = 180 
		//1~9
		for(int i=strLen ;i>=1;i--) {
			// 1자리 숫자일 때 
			if(strLen==1) {
				ans+=n;
				System.out.println(i);
				System.out.println(ans);
			}
			// 1자리 숫자 아니고, 최고자리수 계산 
			else if(i==strLen && strLen!=1) {
				ans+=(n-(1*Math.pow(10, i-1))+1)*i;
				System.out.println(i);
				System.out.println(ans);
			} 
			// 자릿수 내려가면서 계산 
			else {
				ans += 9* Math.pow(10, i-1)*i;
				System.out.println(i);
				System.out.println(ans);
			}
		}
		System.out.println(ans);
			
		

	}

}
