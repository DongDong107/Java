import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		;

		int max = A[0];
		int min = A[0];

		for (int i = 0; i < N; i++) {
			if (max < A[i]) {
				max = A[i];
			}
		}
		;

		for (int i = 0; i < N; i++) {
			if (min > A[i]) {
				min = A[i];
			}
		}
		;

		System.out.print(min + " " + max);

	}

}
