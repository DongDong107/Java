import java.util.HashSet;
import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt() % 42;
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					temp++;
				}
			}
			if (temp == 0) {
				count++;
			}
		}
		
		System.out.println(count);
		
//		 HashSet<Integer> set = new HashSet<Integer>();
//		 
//		 for(int i = 0; i < 10; i++) {
//			 
//			 set.add(sc.nextInt()%42);
//		 }
//		 
//		 System.out.print(set.size());

		// 일반 배열로 푸는법, boolean 배열을 통해 푸는 법, HashSet 통해 푸는 법
	}

}
