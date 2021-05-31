//BOJ_1759
//암호만들기
//https://www.acmicpc.net/problem/1759
//아예 모르겠음.. 다시 풀어야해... 

package recul;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1759 {	
	public static boolean check(String password) {
		int ja = 0;//자음 
		int mo = 0;//모음 
		for(char x : password.toCharArray()) {
			if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
				mo += 1;
			} else {
				ja += 1;
			}
		}
		return ja >= 2 && mo >= 1;
	}
	
	public static void go(int n , String[] alpha , String password, int i) {
		if(password.length() == n) {
			if(check(password)) {
				System.out.println(password);
			}
			return;
		}
		if( i >= alpha.length) return;
		go(n,alpha, password+alpha[i], i+1);
		go(n, alpha, password, i+1);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		String[] alpha = new String[m];
		for(int i = 0 ; i < m; i++) {
			alpha[i] = sc.next();
			
		}
		Arrays.sort(alpha);
		
		go(n,alpha,"",0);
	}
}
