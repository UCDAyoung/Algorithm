//사탕게임
//3085
//https://www.acmicpc.net/problem/3085
//모르는 문법
//고찰 
package math;

import java.util.Scanner;

public class BOJ_3085_yet {
	static int ate=1;		//먹을 사탕 
	static int cnt=1;		//사탕 숫자 카운트  
	static char[][] Table; 	//테이블 
	static int boardNum; 	//테이블 숫자 
	
	//사용자 입력 함수 
	public static void userInput() {
	Scanner sc = new Scanner(System.in);
		//테이블과 테이블 숫자를 정한다 
		boardNum= sc.nextInt();
		Table = new char[boardNum][boardNum];
		
		
		//테이블에 숫자들을 입력받는다 
		for(int row=0; row<boardNum ; row++) {
			String rowString = sc.next();
			Table[row]=rowString.toCharArray();
		}
		
	}
	//연속된 값 확인 함수 (세로줄, 가로줄 따로) 
	public static int byConfirm() {
		for(int i=0; i<boardNum ; i++) {
				//행 확인 
			
				for(int row=0;row<boardNum-1; row++) {
					if(Table[row][i]==Table[row+1][i]) {
						cnt+=1;
					}else {
						cnt=1;
					}
					if( ate < cnt ) {//사탕 수가 더 많으면 
						ate = cnt; // 갱신 					
					}
				}
				//열 확인 
				for(int col=0;col<boardNum-1;col++) {
					if(Table[i][col]==Table[i][col+1]) {
						cnt+=1;
					}else {
						cnt=1;
					}
					if(ate < cnt) {
						ate = cnt;// 갱신 
					}
				}
			}
		return ate;
		}
	
	public static void colSwap(int i,int j) {
		char temp = Table[i][j];
		Table[i][j]=Table[i][j+1];
		Table[i][j+1]=temp;
		
	}
	public static void rowSwap(int i,int j) {
		char temp = Table[i][j];
		Table[i][j]=Table[i+1][j];
		Table[i+1][j]=temp;
		
	}

	public static void main(String args[]) {
		//사용자 입력 
		userInput();		
		
		//한 개씩 돌면서 확인 
		for(int i=0; i<boardNum; i++) {
			for(int j=0 ; j<boardNum; j++) {
				if(j+1<boardNum) {
					colSwap(i,j);
					int result = byConfirm();
					if(ate < result) ate =result;
					colSwap(i,j);
				}
				if(i+1<boardNum) {
					rowSwap(i,j);
					int result = byConfirm();
					if(ate < result) ate =result;
					rowSwap(i,j);
				}
			}
		}
		
		System.out.println(ate);
		
		
	}
}