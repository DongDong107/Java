import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class no1316 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); // �ܾ��� ���� N
		
		int count = N;
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			
			char[] arr = str.toCharArray(); //���ĺ� ���� ������ �迭 �����
			
			List<String> str1 = new ArrayList<>();
			for(int j=0; j<arr.length ; j++) {
				str1.add(String.valueOf(arr[j]));
			} // char�迭�� String �迭����Ʈ�� �����
			
			
			List<String> List = new ArrayList<String>();
			
			List.add(String.valueOf(arr[0]));
			
			for(int j=1; j < arr.length; j++) {
				if(arr[j] != arr[j-1]) {
					List.add(String.valueOf(arr[j]));
				}				
			} // �������� ���� ������ ���ĺ����� �迭 �����
			
//			bw.write(String.valueOf(List));
//			bw.newLine();
//			bw.write(String.valueOf(List.size()));
//			bw.newLine();
//			
						
			HashSet<String> hashSet = new HashSet<String>(str1);
			String[] resultArr = hashSet.toArray(new String[0]);
			// �ߺ��� ���ŵ� ���ĺ� �迭 �����
			
//			bw.write(String.valueOf(resultArr));
//			bw.newLine();
//			bw.write(String.valueOf(resultArr.length));
//			bw.newLine();
//			
			if(List.size() != hashSet.size()) {
				count--;
			}
			
			// �ߺ��� ���� �� �迭 2�� ����
			// 1. ���� ���ĺ� �迭 (�ߺ�0)
			// 2. ���� ���ĺ� �迭 (�ߺ�x)
			// �ΰ��� �迭�� ���� �ٸ��� count --
			
		}
		
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}

}
