import java.io.*;

public class no2908 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();

		String[] s = str.split(" ");

		StringBuilder s1 = new StringBuilder(s[0]);
		StringBuilder s2 = new StringBuilder(s[1]);

		int A = Integer.parseInt(String.valueOf(s1.reverse()));
		int B = Integer.parseInt(String.valueOf(s2.reverse()));
		
		if(A>B) {
			bw.write(String.valueOf(A));
		}
		else
			bw.write(String.valueOf(B));
		
		bw.flush();
		bw.close();

	}

}
