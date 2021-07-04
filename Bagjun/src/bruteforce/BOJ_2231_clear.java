package bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2231_clear {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		int cnt = checkCnt(n); 	//숫자길이 : 216이면 3 
		
		/*checkCnt함수 말고 애초에 String으로 받아서 문자열 길이만 구하고 변환해주면 된다...
		String strN = br.readLine();
		int cnt = strN.length();
		int N = Integer.parseInt(strN);
		 */
		
		
		int sum =0;				//합계 
		int number=0;
		
		for(int i= n-9*cnt;i<n;i++) {
			sum = i;
			number =i; 		//while문 내에서 돌릴 number;
			while(number!=0) {
				sum += number%10;
				number =number/10;
			}			
			if(sum==n) {
				bw.write(i+"");
				bw.flush();
				bw.close();
				br.close();
				
				return;
			}
		}
		bw.write(0+"");
		bw.flush();
		bw.close();
		br.close();
				
		
	}
	public static int checkCnt(int number) {
		int cnt=0;
		while(number!=0) {
			number = number/10;
			cnt++;
		}
		return cnt;
	}
	
}
