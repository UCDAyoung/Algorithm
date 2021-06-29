package bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;

public class BOJ_1107_yet {
	static boolean[] broken;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        
        
        broken = new boolean[10];
        
        if(M != 0) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int i=0 ;i<M; i++) {
        		int num = Integer.parseInt(st.nextToken());
        		broken[num] = true;
        	}
        }
        
        int min_cnt = Mat
        
        
	}

}
