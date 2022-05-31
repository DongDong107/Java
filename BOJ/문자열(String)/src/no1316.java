import java.io.*;

public class no1316 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int count = 3;
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			
			char[] arr = str.toCharArray();
			
			// 중복된 값을 뺀 배열 2개 생성
			// 1. 사용된 알파벳 배열 (중복0)
			// 2. 사용된 알파벳 배열 (중복x)
			// 두개의 배열의 길이 다르면 count --
			
		}
	}

}
