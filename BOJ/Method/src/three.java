import java.util.Scanner;

public class three {

	public static int calculate(int n) {
		int count = 0;

		for (int i = 1; i <= n; i++) {
//			String a = Integer.toString(n); //int String형변환시 ToString 사용법

			int length = String.valueOf(i).length();
//			int[] arr = new int[(int)(Math.log10(n)+1)]; Math 함수이용한 길이 구하기

			int[] arr = new int[length]; // 자릿수만큼 배열 선언

			int clone = i; // 자릿값넣을때 i 그대로 넣으면 값이 변해버려서

			for (int j = 0; j < length; j++) {
				arr[j] = clone % 10;
				if (clone < 10) {
					break;
				}
				clone = clone / 10;
//				System.out.println(arr[j]);
			} // 각 자릿수 배열에 넣기

//			int gap = arr[length] - arr[length-1];
//
//			for (int j = length; j > 0; j--) {
//				if (length < 3) {
//					count++;
//				} else if (arr[length] - arr[length-1]!= gap) {
//					break;
//				} else if (j == length - 1) {
//					count++;
//				} // 모든 차가 동일하여 반복문이 다 돌아가면 카운트
//			}
			
			if(length < 3) {
				count++;
			}
			else {
				int gap = arr[length] - arr[length-1];
				
				for(int j = length; j>0; j--) {
					try {
					
					if (arr[length] - arr[length-1]!= gap) {
						break;
					}}
					catch(IndexOutOfBoundsException e) {
						count++;
					}
//					else if (j == length - 1) {
//						count++;
//					} 
				}
			}
			
			//gap선언부터 여기가 수정되어야 할 부분.
		}

		System.out.print(count);

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// N의 각 자릿수를 구한다.
		// 앞자리수의 뒷자릿수의 차를 구하여 그 값을 저장한다.
		// 반복문을 통해 다음 앞아릿수와 그 뒷자리숫으ㅢ 차를 구하여 같으면 넘어간다.
		// 다 넘어가면 카운트 아니면 다음 반복문으로
		// 카운트 값 출력

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		calculate(a);

	}

}
