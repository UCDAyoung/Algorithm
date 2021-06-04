/*
 * https://www.acmicpc.net/problem/15596
 * 정수N개의 합 
 * 
 * 
 */
package etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_15596_clear {
	public long sum(int[] a) {
		long sum=0;
		
		for(int i : a) {
			sum+=i;
		}
		
		return sum;
	}
	
	
}
