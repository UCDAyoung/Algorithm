/* 작성 : 21.06.22 
 * 수정 : 
 * 확인 
 * 
 * 수 정렬하기
 * https://www.acmicpc.net/problem/2750
 * 
 * 
 */
package sort;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2750_clear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		for(int a : arr)
			System.out.println(a);
	}

}
