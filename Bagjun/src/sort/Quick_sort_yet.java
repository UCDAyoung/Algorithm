/*
 * 퀵 정렬
 * 불안정 정렬이며, 비교정렬에 속한다. 
 * 분할 정복 알고리즘
 * 분할 : 피벗기준, 왼쪽 오른쪽으로 나눔 / 부분리스트의 크기가 0이나 1이될 때까지 분할
 *  
 * 정복 : 왼쪽을 가르키는 Low는 오른쪽으로 / 오른쪽을 가르키는 high는 왼쪽으로 이동하며 
 * low와 high의 값을 비교하여 정렬해나간다.  
 * 멈추는 시점은 low와 high가 엇갈렸을 때
 * 
 * 렬을 해나가다 
 * 속도가 빠름
 * 
 * 분할 후 
 */
package sort;

public class Quick_sort_yet {
	
	public static void quickSort(int[] data) {
		sort(data,0,data.length-1);
	}
	public static void sort(int[] data, int low, int high) {
		if(low >= high) return;
		
		int mid = partition(data,low,high);
		sort(data,low,mid-1);
		sort(data,mid,high);
	}
	
	public static int partition(int[] data, int low,int high) {
		int pivot = data[(low+high)/2];
		
		while(low <= high) {
			while(data[low] < pivot ) {low++;} // pivot보다 작으면 멈춤 
			while(data[high] > pivot) {high--;}// pitvot보다 크면 멈춤
			
			if(low <= high) { 
				swap(data,low,high);
				low++;
				high++;
			}  
			
		}
		return low;
		
	}
	public static void swap(int[] data,int l, int r) {
		int tmp = data[l];
		data[l] = data[r];
		data[r]= tmp;
	}
	
}

/*
 	void sort(int[] a, int left, int right){
        int pl = left;
        int pr = right;
        int x = a[(pl+pr)/2];

        do{
            while(a[pl] < x) pl++;
            while(a[pr] > x) pr--;
            if(pl <= pr){
                int temp = a[pl];
                a[pl] = a[pr];
                a[pr] = temp;
                pl++;
                pr--;
            }
        }while(pl <= pr);

        if(left < pr) sort(a, left, pr);
        if(right > pl) sort(a, pl, right);
    }
    */

	
