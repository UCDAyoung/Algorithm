/* 작성 : 21.06.10
 * 수정 
 * 확인 
 * 
 * 버블정렬 (int[]배열일 경우)
 * 
 * 빅오 : n^2  : 정렬되어 있을 경우
 * 
 * 고찰 *
 *  
 * 
 *
 */
package sort;

public class Bubble_sort {
	public void Sort(int[] data) {
		for(int i=0;i<data.length-1; i++) {
//			System.out.print("for1");
			for(int j = 0; j <data.length-1 ;j++) {
//				System.out.print("for2");
				if( data[j] > data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
	}
	public static void main(String args[]) {
		Bubble_sort bubble = new Bubble_sort();
		int[] data = new int[] {9,3,6,4};
		
		bubble.Sort(data);
		
		for(int i : data)
			System.out.println(i);
	}
	
}
