
package recul;

import java.util.*;

public class BOJ_10872_clear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		System.out.println(recul(n));
		
	}
	public static int recul(int n) {
		if(n==0) return 1;
							
		return recul(n-1)*n;
	}

}
