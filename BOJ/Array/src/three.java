import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		String rs = Integer.toString(A * B * C);

		int[] arr = new int[rs.length()];

		for (int i = 0; i < rs.length(); i++) {
			arr[i] = rs.charAt(i) - '0';
		}

		for (int j = 0; j < 10; j++) {
			int count = 0;

			for (int k = 0; k < arr.length; k++) {

				if (j == arr[k]) {
					count++;
				}

			}

			System.out.println(count);

		}
	}
}

//57000 /10000 5

//배열마다 각자리의
//숫자를 넣는다.
//각 숫자가
//잇을시 카운트한다.출력한다
