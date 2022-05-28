import java.io.*;
public class no10809 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[26];
		
		for(int i=0; i<26; i++) {
			arr[i] = -1;
		}
		
		char[] arr1 = br.readLine().toCharArray(); 
		
		for(int i=0; i<arr1.length; i++) {
			int a = (int)arr1[i] - 97; //아스키코드를 이용하여 알파벳 배열 해당위치 찾기
			if(arr[a] == -1) { //처음 등장하는 위치를 적어야 하기 때문에 -1일 경우만 바뀌는 조건
				arr[a] = i; 
			}			
		}
		
		for(int i=0; i<26; i++) {
			bw.write(String.valueOf(arr[i])+" ");
		}
		
		bw.flush();
		bw.close();
		
//		String b = "b";
//		char c = b.charAt(0);
//		int a = c;
//		
//		System.out.println(a);
//		
		
		
	}

}
