/*
 * 선택정렬
 * 
 * 맨 앞부터 차례로 가르키면서  
 * 가르킨 배열을 제외한 남아있는 뒤 배열들과 모두 비교하면서 가장 제일 작은 값이랑 교환한다. 
 * 그래서 비교정렬이라고도 불림. 
 * 장점 : 데이터가 적은 경우에는 굉장히 성능이 좋고 코드 간편 .
 * 단점 : 데이터가 많아지면 성능이 느려짐.
 * 이유 : ??
 * 
 * 빅오 : n^2 
 * 
 * 배열초기화 방법
 * 1. int[] arr = new int[]{1,2,3,4,5};
 * 2. int[] arr = {1,2,3,4,5}; 
 * i
 */
package sort;

public class Selection {
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
		Selection selection = new Selection();
		int[] data = {3,2,5,6,1}; 
		
		selection.sort(data);
		
		for(int i : data) 
			System.out.println(i);

		
		

	}

}
