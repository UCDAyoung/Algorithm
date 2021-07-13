/* 작성 : 21.07.13 
 * 수정 
 * 확인 
 * 
 * 쉬운 정렬 문제인 것 같음. 
 * https://www.acmicpc.net/problem/1181
 * 
 * 핵심 
 * 1. 길이가 짧은 것 
 * 2. 길이 같으면 사전 순 
 * 
 * 배열로 받은 다음에, comparator 수정 ㄱ
 * 실패 
 * 원래 계획 : 원래 set으로 중복문자를 제거 후, 배열에 넣을 생각이였다. 
 * 문제점 : 그랬더니 중복문자를 제거한 곳의 배열에 빈 곳이 남는다. 그래서 정렬 시 널포인트에러 발생  
 * 해결책 : 배열을 어떻게 하면 유하게 사용할지 생각해서 arrayList를 사용했다.
 * 
 * 
 * 
 */
package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BOJ_1181_clear {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Set<String> set = new HashSet<String>();
		int n = Integer.parseInt(br.readLine());
		
		List<String> list = new ArrayList<String>();
		
		for(int i=0; i<n; i++) {
			String cur = br.readLine();
			if(set.contains(cur))
				continue;
			set.add(cur);
			list.add(cur);
		}
		
			
		Collections.sort(list,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length()>o2.length())
					return 1;
				else if(o1.length() == o2.length()) {
						return o1.compareTo(o2);
				}
				else 
					return -1;
			}
			
		});
		
		for(String s : list)
			sb.append(s).append("\n");
			
		System.out.println(sb.toString());		

	}

}
