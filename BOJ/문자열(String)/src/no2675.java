import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class no2675 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수 입력
		

		for (int i = 0; i < T; i++) {
			
			// 공백을 두고 입력받기
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken(); // 여기까지는 입력받는다. 
			
			/*문자열이 계속 바뀔거니까 메모리 낭비 방지를 위해서 StringBuilder 사용
			처음에는 for문안에 안넣으니까 String이 계속 쌓이는 결과가 발생했음*/
			
			StringBuilder stringBuilder = new StringBuilder(); 
			
			// 글자마다 반복 횟수 R 만큼 반복해서 추가하도록 만들었음
			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) {
					stringBuilder.append(S.charAt(j));
				}
			}
			
			// StringBuilder는 꼭 toString() 해줘야 한다고 해서 (이유 알아보기)
			String str = stringBuilder.toString();

			bw.write(str);
			bw.newLine();
		}

		bw.flush();
		bw.close();

	}

}
