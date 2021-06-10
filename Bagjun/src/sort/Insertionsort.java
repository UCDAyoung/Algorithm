/* 작성 : 21.06.10
 * 수정 : 
 * 확인 :
 * 
 * 삽입정렬
 * 타겟과 이전 원소들을 비교해가며 정렬 
 * 타겟보다 작은게 나올 때까지 계속 이전 원소들과 비교 
 * 
 * 
 */
package sort;

public class Insertionsort {
	public void sort(int[] data) {
		
		for(int i=1 ; i < data.length; i++) {
			int target = data[i]; //타겟 저장 
			int prev = i-1;		  //타겟 이전 요소 
			
			while(prev >= 0 && target < data[prev]){
				data[prev+1] = data[prev]; // 계속 뒤로 덮어쓰기  
				prev--;
			}
			
			data[prev+1] = target; //마지막에 바꾸기 
						
			// 코드 리뷰 : 아래와 같이 swap을 쓰면 버블소트랑 다른게 없잖아
			// target 저장해놓았다가, 쭉 민다음에 나중에 바꾸는거			
			// if(data[i]<data[prev]) {
			//		int temp = data[i];
			//		data[i] = data[prev];
			//		data[prev] = temp;
			//		prev--;
			//	}	
			//	else break;
			
		}
	}

	public static void main(String[] args) {
		Insertionsort Insert = new Insertionsort();
		int[] data = {6,7,3,4,1,4};
		
		Insert.sort(data);
		
		for(int i : data)
			System.out.print(i + " ");
	}

}
