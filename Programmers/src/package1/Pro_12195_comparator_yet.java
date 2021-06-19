/* 작성 : 21. 06. 17
 * 수정 
 * 확인 
 * 
 * 문자열 내 마음대로 정렬하기
 * Comparator - compare
 * Comparable - Tocompare
 * https://programmers.co.kr/learn/courses/30/lessons/12915
 */
package package1;

import java.util.*;

public class Pro_12195_comparator_yet {
	public String[] solution(String[] str, int n) {
		Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.charAt(n) > o2.charAt(n)) {
					return 1;	
				}else if(o1.charAt(n) == o2.charAt(n)) {
					return o1.compareTo(o2);
				}else if(o1.charAt(n) < o2.charAt(n)) {
					return -1;
				}
				return 0;
			}
		});
		
		return str;
	}
	
	
}
