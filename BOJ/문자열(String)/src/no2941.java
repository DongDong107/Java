import java.io.*;

public class no2941 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		str = str.replace("c=", " ");
		str = str.replace("c-", " ");
		str = str.replace("dz=", " ");
		str = str.replace("d-", " ");
		str = str.replace("lj", " ");
		str = str.replace("nj", " ");
		str = str.replace("s=", " ");
		str = str.replace("z=", " ");
		
		bw.write(String.valueOf(str.length()));
		bw.flush();
		bw.close();
	}

}
