/* Map 특징 1.순서 x 2.value중복 가능 .  
 * 1. HashMap
 * 
 * 2. TreeMap
 * TreeSet과 비슷하다, 정렬 및 탐색에 빠르다. (단, 삽입 ,삭제에 느리다. ) 
 *  
 */
package 아무거나;

import java.util.HashMap;
import java.util.Scanner;

public class Map {
	static boolean end=true;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String>  map = new HashMap();
		
		while(end) {
		System.out.print("id를 입력하세요 : ");
		String id = sc.nextLine().trim(); //trim()이 사용자의 잘못된 입력을 고려해서 앞뒤 공백 제거
		System.out.println("");
		System.out.print("비밀번호를 입력하세요 : ");
		String pwd = sc.nextLine().trim();
		System.out.println("");
		map.put(id,pwd);
		System.out.print("1.입력 2.종료");
		int type = sc.nextInt();
		if(type==1)
			end = true;
		else 
			end = false;
		
		
		}
										
		for(int i=0 ;i<map.size();i++) {
		System.out.print("id,pwd를 재 입력하여 확인하시오 ");
		System.out.print("id를 입력하세요 :  ");
		String id = sc.nextLine().trim(); 
		if(map.containsKey(map.get(id)))
			System.out.println("id가 있습니다.");
			System.out.print("비밀번호를 입력하세요");
			String pwd = sc.nextLine().trim();
			if(map.get(id).equals(pwd))
				System.out.println("비밀번호가 일치합니다.");
			else
				System.out.println("비밀번호가 틀립니다.");
		
		}		
		
		
		

	}

}
