import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class four {

	public static void main(String[] args) throws IOException {
		
		
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int T = Integer.parseInt(bf.readLine());
	

	for(int i=0; i<T; i++) {
		
		String s = bf.readLine();
//		int A = Integer.parseInt(bf.readLine());
//		int B = Integer.parseInt(bf.readLine());
		
		StringTokenizer st = new StringTokenizer(s);
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		bw.write(a+b+"\n");
		
		
	}
	
	
	bw.flush();
	bw.close();
	
	
	
	}

}
