/*
 * https://www.acmicpc.net/problem/11720
 * 숫자의 합 
 * 
 * -------char to int 방법 ----------
 *      int 숫자 = 문자 - '0'; 
 * -------int to string 방법 ----------
 * 		Integer.toString(숫자);      
 */
package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class BOJ_11720_clear {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String m = br.readLine();
		int sum =0;
		
		for(int i=0; i<n;i++) {
			sum+=(m.charAt(i)-'0');
		}
		
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
		br.close();
	}

}
