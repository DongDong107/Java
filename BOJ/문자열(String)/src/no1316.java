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
			
			// �ߺ��� ���� �� �迭 2�� ����
			// 1. ���� ���ĺ� �迭 (�ߺ�0)
			// 2. ���� ���ĺ� �迭 (�ߺ�x)
			// �ΰ��� �迭�� ���� �ٸ��� count --
			
		}
	}

}
