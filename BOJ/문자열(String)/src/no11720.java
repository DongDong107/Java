import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class no11720 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		char[] arr = br.readLine().toCharArray();
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			int a = Character.getNumericValue(arr[i]);
			sum += a;
		}
		
//		String str = br.readLine();
//		for(int i=0; i<N; i++) {
//			sum += Character.getNumericValue(str.charAt(i));
//		}
		
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
	}

}
