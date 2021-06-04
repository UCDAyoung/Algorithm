/*
 * https://www.acmicpc.net/problem/2869
 * 달팽이는 올라가고 싶다 , 2869번
 *
 * 종이로 수치를 시각화여 규칙을 찾아냄 
 * 결국, 전날 올라가는 높이 A만큼 남았다면 다음 날은 무조건 올라간다. 
 * 그래서 전체 올라가야하는 높이 V에서 A높이를 뺀다.(V-A)
 * 이제 하루에 올라갈 수 있는 높이는 (B-A)
 * 몇 일 걸리는지 -> (V-A) / (B-A) 
 * 예외, 무조건 딱 맞게 일수가 나오는게 아니라 하루 기준 하루보다 더 넘게 1.5 또는 적게 0.5 걸릴 수 있다.
 * 이 경우는 어차피 반올림해주면 된다. -> 나는 (int)로 소수점 날려버리고 +1했다.
 */

package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_2869_clear {
	
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = bf.readLine().split(" ");
		
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		int V = Integer.parseInt(input[2]);
		int num1 = V-A;
		int num2 = A-B;
		int result = 0;
		
		if(num1%num2!=0)
			result = (int)((V-A)/(A-B)) + 1;
		else
			result = (int)((V-A)/(A-B));
		result+=1;
		System.out.print(result);
		
		

		
	}
}