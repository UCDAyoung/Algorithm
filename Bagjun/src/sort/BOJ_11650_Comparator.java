/* 작성 : 21.07.06 
 * 수정 : 
 * 확인 :
 * 
 * 좌표정렬하기 
 * https://www.acmicpc.net/problem/11650
 * 
 * 고찰 
 * 일단 Comparator 사용법에 대해 어느 정도 숙지하였다. 하지만 제네릭스에 넣어야 하는게 햇갈린다. 
 * 배열을 비교할 것이라서 Wrapper클래스를 사용하지 않아도 되는 것 같다. -> 맞는지 소래형한테 물어보자. 
 * 
 * 부족한 점 
 * 여기서 내가 시간복잡도를 왜 따져야하는지 모르고있다.
 * 주어지는 N의 갯수는 10만개이다.
 * 만약 연산이 N^2이 되는 정렬을 수행한다면 시간이 엄청 오래걸린다 
 * N^2인 정렬이 뭐가있지 ? 
 * ->선택정렬 
 *   
 * 
 * 
 * 
 * 
 * 
 */
package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_11650_Comparator {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		int [][] xy = new int [n][2];
		
		for(int i=0 ; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			xy[i][0] = x;
			xy[i][1] = y;
		}
		
		Arrays.sort(xy,new Comparator<int[]>(){
			public int compare(int[] o1, int[]o2) {
				if(o1[0]==o2[0])
					return o1[1]-o2[1];
				else
					return o1[0]-o2[0];
			}
		});
		for(int[] list : xy) {
			bw.write(list[0]+" "+list[1]);
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
		
			
		
	}

}
