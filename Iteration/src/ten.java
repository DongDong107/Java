import java.util.Scanner;

public class ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			for (int j = N; j > 0; j--) {
				if (j > i + 1) {
					System.out.print(" ");
				} else
					System.out.print("*");

			}

			System.out.println();
		}

	}

}

// i = 0, j = 0123 j=4  N=5
// i = 1, j = 012 j=3,4 N=5
// i = 4, j = j=01234 N=5