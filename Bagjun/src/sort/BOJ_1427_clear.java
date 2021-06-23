/* 작성 : 21.06.23
 * 수정 
 * 확인 
 * 소트인사이드 
 * 내림차순 문제 
 */
package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.*;
/* Collections.sort와 Arrays.sort의 차이 
 * Arrrays.sort()는 Dual-pivot Quicksort를 사용합니다.
 * Collections.sort()는 merge sort와 insert sort를 합한 timesort를 사용합니다. 
 * quick sort는 배열에서 좋은 성능을 보이지만 stable하지 않아서 stable이 필요한 Object에는 Collectinos.sort()가 많이 쓰입니다. 
 * 
 * 
 * 

 */
public class BOJ_1427_clear {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));   
/*	1. Collectinos.reverseOrder() 쓴 경우 --------------- 
 * 	String[] str = bf.readLine().split("");
 * 
  	Arrays.sort(str,Collections.reverseOrder()); // 문자열은 참조객체이기때문에 바로 collectinos.reverseOrder() 사용가능 
	for(String s: str)
		System.out.print(s);
*/
		
//	2. List이용해서 담고, Collections.sort사용하기
		int n = Integer.parseInt(bf.readLine());
		
		List<Integer> list = new LinkedList<Integer>();
		while(n>0) {
			list.add(n%10);
			n /= 10;
		}
		
		Collections.sort(list,Comparator.reverseOrder());
		
		for(int num : list)
			System.out.print(num);
	}
		
/*	3. 퀵 sort만들어서 직접 하기 
 * 		String[] str = bf.readLine().split("");
		int[] arr = new int[str.length];
		for(int i=0 ;i<arr.length;i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		sort(arr,0,arr.length-1);
		
		for(int a : arr)
			System.out.print(a);
			}
*/
	
	public static void sort(int[] arr,int left, int right) {
		int pl = left;
		int pr = right;
		int pivot = arr[(pl+pr)/2];
		
		do {
		
			while(arr[pl]>pivot) pl++;
			while(arr[pr]< pivot) pr--;
			if(pl<=pr) {
				int temp = arr[pl];
				arr[pl] = arr[pr];
				arr[pr] = temp;
				pl++;
				pr--;
			}
		}while(pl<=pr);
		
		if(left<pr) sort(arr,left,pr);
		if(right>pl) sort(arr,pl,right);
		
	}

}

