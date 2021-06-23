package sort;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BOJ_2750_quicksort {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        sort(arr,0,arr.length-1);
        
        for(int i : arr) {
            System.out.println(i);
        }
 

	}
	public static void sort(int[] arr, int left,int right) {
		int pl = left;
		int pr = right;
		int pivot = arr[(pl+pr)/2];
		
		
		do {
			while(arr[pl]<pivot) pl++; //큰놈나올때까지 오른쪽으로 
			while(arr[pr]>pivot) pr--; //작은놈나올때까지  왼쪽으로 
									//탈출했다는건 크거나, 같거나 한겨
			if(pl<=pr) { 			// pl과 pr이 만나면 
				int temp = arr[pl];	// 위치를 바꿔준다 . 
				arr[pl] = arr[pr];
				arr[pr] = temp;
				pl++;
				pr--;
			}
		}while(pl<=pr);				//전체적인 pl < pr이 될 때까지 
		
		if(left <pr) sort(arr,left,pr);
		if(right>pl) sort(arr,pl,right);
	}
	

}


