/*
 * 이너클래스  외부클래스의 이해 
 * 참고 https://codevang.tistory.com/110
 * 
 * 클래스가 이너클 래스를 갖는 순간 : 클래스 -> 외부클래스라고 부르는거
 * #이런느낌 
 * 외부클래스 {
 *   
 *		이너클래스 {
 *		}
 * }
 * 
 * 대부분 이너클래스는 외부클래스에서 사용하려고 하지 
 * 외부클래스 말고 다른 클래스에서 굳이 외부클래스의 이너클래스까지 불러와서 사용안함 .
 * 그니까 결론은 이너클래스? 외부클래스에서 사용하려고 하는 내부 클래스 
 * 
 * 
 * 
 * 
 */
package outer_innerclass;

import java.util.HashMap;

public class prac01 {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map1 = new HashMap<>();
		HashMap<Integer,Integer> map2 = new HashMap<>();
		map1.put(3, 2);
		map2.put(2, 2);
		map1.remove(3,3);
	
		System.out.println(map1.get(3));
	}

}

class Outer{
	class Inner{
		int a = 1;
		int b = 2;

		Inner(int a, int b){
			this.a = a;
			this.b = b;
		}
		public void print(int x) {
			System.out.println(x);
		}
		
	}
}


/*
 * import java.util.*;

class Solution {
    public int[] solution(int[][] v) {
        Map<Integer,Integer> mapX = new HashMap<Integer,Integer>();
        Map<Integer,Integer> mapY = new HashMap<Integer,Integer>();
        
        int[]result = new int[2];
        
        for(int i=0 ;i<v.length;i++){
            if(mapX.containsKey(v[i][0])==true)
                mapX.put(v[i][0],v[i][0]);
            else 
                mapX.put(v[i][0],0);
            
            if(mapY.containsKey(v[i][1])==true)
                mapY.put(v[i][1],v[i][1]);
            else
                mapY.put(v[i][1],0);
            
        }                    
        for(int i=0; i<v.length;i++){
            if(mapX.get(v[i][0])==0){
                System.out.println(v[i][0]);
                result[0]=v[i][0];
            }
        }
        for(int i=0; i<v.length;i++){
            if(mapY.get(v[i][1])==0){
                System.out.println(v[i][1]);
                result[1] = v[i][1];       
            }
        }
        
                                         

        return result;
    }
}
 */