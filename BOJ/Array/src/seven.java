import java.util.Scanner;

public class seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int C = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < C; i++) {

			int N = sc.nextInt();
			int[] arr = new int[N];
			int sum = 0;
			int count = 0;

			for (int j = 0; j < N; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}

			int avr = sum / N;

			for (int j = 0; j < N; j++) {
				if (arr[j] > avr) {
					count++;
				}
			}

			double percent = (double) count / (double) N * 100;

			System.out.println(String.format("%.3f", percent) + "%");

		}

	}

}
