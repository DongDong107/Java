import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[] A = new int[9];

		for (int i = 0; i < 9; i++) {
			A[i] = sc.nextInt();
		}

		int max = A[0];
		int o = 1;
		for (int j = 0; j < 9; j++) {
			if (max < A[j]) {
				max = A[j];
				o = j + 1;
			}
		}

		System.out.println(max);
		System.out.print(o);
	}

}
