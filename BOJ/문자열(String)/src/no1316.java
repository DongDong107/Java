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
		
		int N = Integer.parseInt(br.readLine()); // 단어의 개수 N
		
		int count = N;
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			
			char[] arr = str.toCharArray(); //알파벳 별로 끊어진 배열 만들기
			
			List<String> str1 = new ArrayList<>();
			for(int j=0; j<arr.length ; j++) {
				str1.add(String.valueOf(arr[j]));
			} // char배열을 String 배열리스트로 만들기
			
			
			List<String> List = new ArrayList<String>();
			
			List.add(String.valueOf(arr[0]));
			
			for(int j=1; j < arr.length; j++) {
				if(arr[j] != arr[j-1]) {
					List.add(String.valueOf(arr[j]));
				}				
			} // 연속적인 것을 제외한 알파벳들의 배열 만들기
			
//			bw.write(String.valueOf(List));
//			bw.newLine();
//			bw.write(String.valueOf(List.size()));
//			bw.newLine();
//			
						
			HashSet<String> hashSet = new HashSet<String>(str1);
			String[] resultArr = hashSet.toArray(new String[0]);
			// 중복이 제거된 알파벳 배열 만들기
			
//			bw.write(String.valueOf(resultArr));
//			bw.newLine();
//			bw.write(String.valueOf(resultArr.length));
//			bw.newLine();
//			
			if(List.size() != hashSet.size()) {
				count--;
			}
			
			// 중복된 값을 뺀 배열 2개 생성
			// 1. 사용된 알파벳 배열 (중복0)
			// 2. 사용된 알파벳 배열 (중복x)
			// 두개의 배열의 길이 다르면 count --
			
		}
		
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}

}
