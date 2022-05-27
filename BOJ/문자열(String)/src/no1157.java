import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 시간초과! 

public class no1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// 알파벳을 다 대문자화 한 후에
		// Max 값을 선언
		// 각 단어별로 반복문 후에 카운팅하여 Max 값과 문자열값 저장
		//

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 입력받은 문자 대문자로 변환
		String str = br.readLine().toUpperCase();

		// 배열화
		char[] arr = str.toCharArray();
		/*
		 * 계속 돌아갈테니까 만약에 count 값이 같은 걸 찾앗을땐 ? 으로 저장햇다가 다시 값이 바뀌면 그 값을 저장하는 걸로 해보자
		 * ㄴ 문제점 : 한글자 한글자 비교하므로 첫번째 글자가 나중에 나와도 ? 되어버림
		 * 비교해서 Max 값을 찾고 배열에 넣어서 중복을 제거 한 후 배열의 길이가 1 이상이면 ? 출력
		 */
		int max = 0;
		char[] maxarr = new char[arr.length];
		int k=0;
		
		HashSet<String> set2 = new HashSet<String>();
		
		for (int i = 0; i < arr.length; i++) {
			
			int count = 0;
			
			
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			if (count > max) {
				max = count;
				set2.clear();
				set2.add(String.valueOf(arr[i]));
			}
			else if (count == max) {
				set2.add(String.valueOf(arr[i]));
			}
		}
		
		String exm = new String(maxarr); // char 배열 string 화
		
		HashSet<String> hashSet = new HashSet<>(Arrays.asList(exm));
		
		String[] resultArr = hashSet.toArray(new String[0]);
		
		// 중복 제거가 안됐음. 
		
//		if(resultArr.length>2) {
//			System.out.println("?");
//		}
//		else {
//			System.out.println(resultArr[0]);
//		}
		if(set2.size()>1) {
			System.out.println("?");
		}
		else {
			String[] arr3 = set2.toArray(new String[0]);
			System.out.println(arr3[0]);      
			//hashset은 원하는 index 문자열 확인이 불가능해서 배열로 바꾼후 찾아봣음
		}
	}

}
