import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt() % 42;
		}

		int result = 10;
		int sum = 0;
		int count = 0;
		
		for (int j = 0; j < arr.length; j++) {
			

			for (int k = 0; k < arr.length; k++) {
				if (arr[j] == arr[k]) {
					count++;
				}
			}
			
			if(count>1) {
				result = result - count + 1;
				count = 0;
			}
			else
				count = 0;
			
			
//			sum = sum - count + 1;
		}

		System.out.print(result-count);

	}

}

//같은수의 갯수 N을 카운팅, (-N + 1) 한값들을 더한다.

// result 값은 1 to 10 다 같거나 다 다르거나
// 만약 같은 숫자들이 나왓어 
// 1이 3개고  2가 2개     -2 -1       7 나머지 7개 + 1 8 
// 그 값들만 모아서 마지막ㅇ 뺀다
// 뭔가 엄청 돌아가는 기분
// 종류별로 묶으려면 
