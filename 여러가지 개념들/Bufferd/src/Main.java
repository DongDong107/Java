import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		String s = br.readLine(); // 입력받는것
		StringTokenizer st = new StringTokenizer(s); // 공백 단위로 가공할때 선언

		String N = st.nextToken();
		String M = st.nextToken(); // 하나 하나

		String arr[] = s.split(" ");

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write(s);
		bw.write("\n"); // 개행처리
		bw.write(arr[1]);
		bw.newLine(); // 개행처리2

		bw.flush();// 버퍼비우기
		bw.close();// 출력스트림닫기

		// String Happy 입력시
		// String Happy
		// Happy 출력

	}

}
