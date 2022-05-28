import java.io.*;

public class no1157ver2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 알파벳 갯수는 26개. 기억해두기
		int[] arr = new int[26];
		
		// toUpperCase() 대문자 toLowerCase() 소문자
		String str = br.readLine().toUpperCase();

		for (int i = 0; i < str.length(); i++) {

			int a = str.charAt(i); //해당자리 찾자마자 아스키코드화
			arr[(int)str.charAt(i) - 65]++; // 대문자 A 아스키코드 65 , 소문자 a 아스키코드 97 

		}
		// 해당 알파벳 부분만 카운트. 그 이후엔?
		// Max를 찾는다.
		// 여러개 존재하는 경우는? 일단 맥스 찾자.

		// 맥스 찾기
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		// 카운트랑 위치 기억하기 위한 변수 선언
		int count = 0;
		int s = 0;
		
		// 맥스값이 위치한 자리 찾기 (맥스값이 겹치는지도 확인)
		for (int i = 0; i < arr.length; i++) {
			if (max == arr[i]) {
				count++;
				s = i;
			}
		}
		
		// 아스키코드 변환은 char 자료형 이용
//		String str1 = String.valueOf(s-65); <- 실수한 부분
		char ch = (char) (s + 65);
		
		// 2개이상부터는 무조건 ? 출력 아니면 
		if (count > 1) {
			bw.write("?");
		} else
			bw.write(ch);

		bw.flush();
		bw.close();
		
//		char str3 = 'b' ;

	}

}
