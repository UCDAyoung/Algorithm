/* 작성 : 21. 06. 23
 * 수정 
 * 학인 
 * 
 * 배열은 기억하기 위한 것들 넣어놓기 좋다.
 * 
 * 참고풀이 
 * https://www.acmicpc.net/source/29752200 
 * 
 * 
 */
package sort;

import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class BOJ_11399_clear {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		Integer[] arr = new Integer[n];
	
		String[] ss = bf.readLine().split(" ");
		
		for(int i=0 ;i<n;i++) {
			arr[i] = Integer.parseInt(ss[i]);
		}
		
		sort(arr,0,arr.length-1);
		
		for(int i=1; i<n; i++) {
			arr[i] += arr[i-1];
		}
		for(int i=1; i<n; i++){
			arr[i] += arr[i-1];
		}
		
		System.out.println(arr[n-1]);

		

		

	}
	
	public static void sort(Integer[] arr,int left,int right) {
		int pl = left;
		int pr = right;
		int pivot = arr[(left+right)/2];
		
		do {
			while(arr[pl] < pivot ) pl++;
			while(arr[pr] > pivot ) pr--;
			if(pl<=pr) {
				int temp = arr[pl];
				arr[pl] = arr[pr];
				arr[pr] = temp;
				pl ++;
				pr --;
			}
		}while(pl<=pr);
		
		if(left < pr) sort(arr,left,pr);
		if(right> pl) sort(arr,pl,right);
	}

}
