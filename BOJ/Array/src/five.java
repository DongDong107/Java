import java.util.Scanner;

public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double M = 0;
		double[] arr = new double[N];
		double sum = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextDouble();
			if (M < arr[i]) {
				M = arr[i];
			}
		}

		for (int i = 0; i < N; i++) {
			arr[i] = arr[i] / M * 100;
			sum = sum + arr[i];
		}

		double avr = sum / N;

		System.out.print(avr);
	}

}
