package etc;

import java.util.*;
import java.util.Map.Entry;

public class BOJ_2443 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			printStar(' ',i);
			printStar('*',n-i*2);
			printStar(' ',i);
			System.out.println("");
		}
	}
	public static void printStar(char c, int n) {
		for(int i=0; i<n; i++) {
			System.out.print(c);
		}
	}
}