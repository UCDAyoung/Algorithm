/*
 * 쉘 정렬
 * https://mattlee.tistory.com/76
 * 1. gap차이의 인덱스끼리 부분리스트를 만든다.(실제로 만드는 것은 아님) 
 * 	1.1 이 부분리스트 내에서 삽입 정렬과 같은 정렬을 한다.
 * 	   1.1.1 역순으로 정렬한다?? 
 * 2. gap을 1개씩 줄여나가며 반복한다. 
 * 
 * 전체를 부분리스트(gap만큼의)를 차례차례 만들어가며 정렬 
 */
package sort;


public class Shell_sort_yet{

	public static void shell_sort(int[] list, int size) {
		int gap;
		for(gap = size/2; gap > 0 ; gap/=2) {
			//짝수일 경우, 홀수로 만들어주기 
			if(gap %2 == 0)
				gap++;			
			
			for(int j=0;j<gap;j++) {
				gap_insertion_sort(list,j,size-1,gap);
			}
		}
	}
	
	public static void gap_insertion_sort(int[] list,int first,int last,int gap) {
		int key;
		int j;
		//삽입정렬에서도 첫 번째 원소는 정렬을 할 필요가 없으므로 first+gap 으로 시작 ???이해가안됌  
		for(int i= first+gap;i<=last;i+=gap) {
			key = list[i]; // 현재 삽입될 숫자인 i번째 정수를 복사 
			
			//i-gap까지 정렬되어 있어서, i-gap부터 역순으로 조사 
			//list[j] > key : key값 보다 배열에 있는 값보다 크면 다음 gap에 저장
			//insertion sort랑 비슷 
			for(j=i-gap;j>=first&&list[j]>key;j-=gap) {
				list[j+gap] = list[j];
			}
			list[j+gap] = key;
		}
	}
	public static void main(String[] args) {
		int[] list = new int[] {10,6,5,8,2,9,0,15,18};
		shell_sort(list, list.length);
		
		
	}

}
