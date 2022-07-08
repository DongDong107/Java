package 기본수학;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class no1712 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int D = 1;
		
		while(true) {
			
			if(A+B*D < C*D) {
				bw.write(String.valueOf(D));
				break;
			}
			else if(B>C) {
				bw.write(String.valueOf("-1"));
				break;
			}
			else if(A>=2100000000) {
				bw.write(String.valueOf("2100000001"));
			}
			else
				D++;
		}
		
		bw.flush();
		bw.close();
		
	}

}
