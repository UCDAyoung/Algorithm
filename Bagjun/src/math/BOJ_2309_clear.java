//일곱난쟁이
//2309
//https://www.acmicpc.net/problem/2309
//모르는 문법
//고찰 

package math;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2309_clear {
	
	public static void main(String args[]) {
		
		int sum=0;
		boolean find = false;
		Scanner sc = new Scanner(System.in);
		int[] shorts = new int[9];
		
		for(int i = 0 ; i < 9; i++) {
			shorts[i] = sc.nextInt();
			sum+=shorts[i];
		}
		
		for(int i = 0 ; i < 9 ; i++) {
			if(find) break;
			for(int j = 0 ; j<9; j++) {
				if(i==j) continue;	
				if((sum-shorts[i]-shorts[j])==100) {
					shorts[i]=shorts[j]=0;
					find=true;
					break;
				}
			}
		}
		
		Arrays.sort(shorts);//오름차순 
		for(int i = 0 ; i < 9; i++) {
			//if(shorts[i]==0) continue;
			if(shorts[i]!=0)
				System.out.println(shorts[i]);
		}
		
	
		
		
//일곱난쟁이 중 2명 골라내기
//7명의 합 100
//오름차순  출력 
	}
}
