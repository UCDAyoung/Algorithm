//카잉달력
//6064
//https://www.acmicpc.net/problem/6064
//모르는 문법
//고찰 

package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_6064_yet {
		//규칙 : 어떤 Year를 M과 N으로 나누었을 때 나머지가 x, y 인 어떤 Year를 찾아라
		// (M-1)%x 의 Y와  (N-1)%y 의 Y 가 겹치는 놈!? = 최소공배수??	
		//입력 : M, N ,x, y 
		//출력 : Year 
		public static void main(String[] args) throws IOException {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));// 한 번에 읽어드리기
			boolean isThere;
			int tcase = Integer.valueOf(bf.readLine()); //valueof 와 parseint의 차이는?	
			
			//while(tcase-->0) 이런 식으로도 표기 
			for(int i=0;i<tcase;i++) {
				String[] example = bf.readLine().split(" "); //readline으로 생긴 ioexception
				
				int m =Integer.valueOf(example[0]); 
				int n =Integer.valueOf(example[1]);
				int x =Integer.valueOf(example[2])-1;
				int y =Integer.valueOf(example[3])-1;
								
				int Year; 
				isThere = false;
				for(Year = x; Year<(m*n); Year+=m ) { //x기준으로 찾기 , m만큼 반복 / 
					if(Year%n==y) {
						System.out.println(Year+1);
						isThere = true;
						break;						
					}
				}
				if(!isThere)
					System.out.println(-1);
				}
		
		

	}	

}
