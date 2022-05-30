import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class no1152 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine().trim();
		
		String arr[] = s.split(" ");
		
//		int count = arr.length;		
//		bw.write(String.valueOf(s.charAt(0)));
//		bw.newLine();
//		
//		if(String.valueOf(s.charAt(0)) == null) {
//			count--;
//		}
		int count = arr.length;
		
		if(arr[0].isEmpty()) {
			count = 0;
		}
		
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();			
		
		
	}

}
