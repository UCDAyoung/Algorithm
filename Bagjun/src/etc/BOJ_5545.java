/*
 *Arrays.sort(int[], reverseOrder()); 에서 에러가 난 이유 
 *메소드의 규칙 상 객체가 와야하는데, int[]는 객체가 아니고 primitive type이기 때문에 
 *참고 : https://hogu-programmer.tistory.com/32 
 */
package etc;

import java.util.*;
import java.io.*;

public class BOJ_5545 {
		
	public static void main(String[] args) throws IOException {

		BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
		int to_kind = Integer.parseInt(bf.readLine());
		String[] st = bf.readLine().split(" ");
		int do_price = Integer.parseInt(st[0]);
		int to_price = Integer.parseInt(st[1]);
		int do_kcal = Integer.parseInt(bf.readLine());
		Integer[] to_kcal = new Integer[to_kind];
		
		for(int i=0 ;i<to_kind;i++){
			to_kcal[i] = Integer.parseInt(bf.readLine());
		}
		
		//도우를0개, 1개 , 2개 , 3개는 경우 발생
		//1개 -> 토핑 갯수만큼 
		//2개 -> 토핑갯수 ^2 면 1,2 / 1,3 /2,2/ 2,3/ 번.. 
		//3개면 -> 토핑갯수 1,2,3 
	//이 모든 고민 해결 : 내림차순 정렬 ...큰놈부터 넣으면 된다. (가격이 동일하고, 칼로리만 다름 )  		
		Arrays.sort(to_kcal,Collections.reverseOrder());
		
		int to_num=1;
		int percentage=do_kcal/do_price; //토핑없는 가격 
		for(int i=0 ;i < to_kind ;i++) {			
			int new_percentage = (do_kcal+to_kcal[i])/(do_price+to_price);
			if(percentage < new_percentage) 
			{
				percentage = new_percentage;
				do_kcal = do_kcal+to_kcal[i];
				do_price = do_price+to_price;

			}
		}
		System.out.println(percentage);
		
	}	
}
		
		
	