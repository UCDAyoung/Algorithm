package 아무거나;

import java.util.*;
import java.io.*;

public class Main {
	static List<Integer> answerList = new ArrayList<Integer>();
    static boolean[] check;
    static int cnt;
	public static void main(String args[]) throws Exception	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		int friends[];
		
		for(int test_case = 1; test_case <= T; test_case++) {
		    int num = Integer.parseInt(br.readLine());
            friends = new int[num];
            check = new boolean[num];
            
            st = new StringTokenizer(br.readLine());
            int i=0;
            while(st.hasMoreTokens()){
                friends[i] = Integer.parseInt(st.nextToken());
                i++;
            }
            cnt = friends.length;
            System.out.println("Case#"+test_case);
            System.out.println(sol(friends));
		}
		
		
	}
	public static int sol(int[] friends){
	    
	    int i=0;
	    cnt = 0;
	    int pass = 0;
	    while(true){
	    	if(cnt>=friends.length)
	    		return pass;
	    	if(check[i]!=true){
	    		dfs(friends,i);	    		
	    		pass++;
	    	}
	    	i++;
	    	
	    }
	}
	public static void dfs(int[] friends,int idx){
	    check[idx] =true; 
	    cnt++;
	    
	    int myfriend = friends[idx] + idx;
	    if(myfriend > friends.length-1 || check[myfriend] == true) {
	    	return;
	    }else{
	        dfs(friends,myfriend);
	    }
	    return;
	}


}
