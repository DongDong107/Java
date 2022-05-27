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
			int a = (int)arr1[i] - 97;
			if(arr[a] == -1) {
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
