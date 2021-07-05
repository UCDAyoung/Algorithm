/*
 * 병합정렬 
 * 설명 블로그 : https://gmlwjd9405.github.io/2018/05/08/algorithm-merge-sort.html
 * 안전한 정렬,divide and conquer 알고리즘 
 * 
 * 빅오 : nlogn 
 * 
 * 
 * 진짜 나눠서 따로 분리하는게 아닌게 나에게는 좀 신선  
 * 인덱스만 나눠서 합칠 때 바꾸는 ??
 * 
 */
package sort;

public class Merge_sort_yet {
	int[] sorted = new int[8];//정렬된 데이터를 담을 곳 
	public void divide() {
		
	}
	
	public void conquer(int[] data,int left, int mid,int right) {
		int i = left;
		int j = mid+1;
		int cur = left;
		
		while(data[i] <= data[j]) {
			
		}
		
	}
		
	public void merge_sort(int[] data,int left,int right ) {
		int mid;
		
		if(left < right) {
			mid = (left+right)/2;
			merge_sort(data,left,mid);
			merge_sort(data,mid+1,right);
			conquer()
		}
		
	}
	
	
	public static void main(String[] args) {
		

	}

}
