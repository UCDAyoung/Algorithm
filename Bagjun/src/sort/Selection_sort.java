/* 작성 : 21.06.10
 * 수정 : 21.07.04
 * 확인 :
 * 
 * 선택정렬
 * 
 * 맨 앞에 있는 원소가 피봇이 되어서 
 * 나머지 뒤에 있는 원소들과 비교했을 때 작은 수 && 작은 수 중에 작은 수를 찾아 
 * 피봇과 교환합니다.  
 * 
 * 이 과정을 끝까지 n-1번째까지 반복합니다.
 * 
 *  
 * 그래서 비교정렬이라고도 불림. 
 * 장점 : 데이터가 적은 경우에는 굉장히 성능이 좋고 코드 간편 .
 * 단점 : 데이터가 많아지면 성능이 느려짐.
 * 이유 : ??
 * 
 * 빅오 : 모든 피봇을 기준으로 모든 수와 비교해야하므로 , n^2 
 * 
 * 배열초기화 방법
 * 1. int[] arr = new int[]{1,2,3,4,5};
 * 2. int[] arr = {1,2,3,4,5}; 
 * i
 */
package sort;

public class Selection_sort {
	public void sort(int[] data) {
		int min; //min인덱스 
		
	
		for(int i=0; i <data.length; i++) {
			min = i; //min 초기화 
			for(int j= i+1 ; j < data.length; j++) {
				if( data[min] > data[j] )  min = j;
			}
			int temp = data[i];  //swap 
			data[i] = data[min];
			data[min] = temp;
				
		}
	}
	
	public static void main(String[] args) {
		Selection_sort selection = new Selection_sort();
		int[] data = {3,2,5,6,1}; 
		
		selection.sort(data);
		
		for(int i : data) 
			System.out.println(i);

		
		

	}

}
