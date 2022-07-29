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

		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long C = Long.parseLong(st.nextToken());

		long D = 1;
		long Q;

		if (C - B == 0) {
			bw.write(String.valueOf("-1"));
		} else if (A / (C - B) > 0) {             // >=0 으로 수정해서 맞았다. 이유는?
			bw.write(String.valueOf(A/(C-B) + 1));
		} else if (A / (C - B) < 0) {
			bw.write(String.valueOf("-1"));
		}

//		if (Q > 0) {
//			bw.write(String.valueOf(Q + 1));
//		} else if (Q < 0) {
//			bw.write(String.valueOf("-1"));
//		}
//		while(true) {
//			
//			if(A+B*D < C*D) {
//				bw.write(String.valueOf(D));
//				break;
//			}
//			else if(B>C) {
//				bw.write(String.valueOf("-1"));
//				break;
//			}
//			else
//				D++;
//		}

		bw.flush();
		bw.close();

	}

}
