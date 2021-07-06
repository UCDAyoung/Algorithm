package bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_7568_usingArrays {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		int[][] students = new int[n][3];
	
		/*		  몸무게 키  랭킹 
		 * 학생1  |   |   |	   |
		 * 학생2  |   |   |	   |
		 * 학생3  |   |   | 	   |
		 * 학생4  |   |   |     |
		 * 학생5  |   |   |     |
		 *  .		
		 *  .		
		 */
		
		for(int i=0 ; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int weight = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());
			students[i][0] = weight;
			students[i][1] = height;
			students[i][2] = 1; //순위 모두 1로 초기화 
		}
		
		for(int i=0 ; i<n ;i++) {
			for(int j=0 ;j<n; j++){
				if( j==i || students[i][0] == students[j][0]) continue; 
				//***기준 i 가 j보다 크다고 판정이되면, j의 숫자를 올려줌.*** 이런 생각을 못했음..  				
				if(students[i][0] > students[j][0] && students[i][1] > students[j][1]){
					students[j][2] = students[j][2]+1;  
				}
			}			
		}
		for(int[] info : students)
			bw.write(info[2]+" ");
		
		bw.flush();
		bw.close();
		br.close();

	}

}
