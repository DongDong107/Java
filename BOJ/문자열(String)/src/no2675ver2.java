import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class no2675ver2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수 입력
		

		for (int i = 0; i < T; i++) {
			
			String[] str = br.readLine().split(" ");
			
			int R = Integer.parseInt(str[0]);
			
			String s = str[1];
			
			for(int j=0; j<s.length(); j++) {
				for(int k=0; k<R; k++){
					bw.write(s.charAt(j));
				}
			}
			
			bw.newLine();			
			
		}

		bw.flush();
		bw.close();

	}

}


