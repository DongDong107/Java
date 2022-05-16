import java.util.Scanner;

public class seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int x = i + 1;

			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a + b;

			System.out.println("Case #" + x + ": " + sum);

		}
	}

}
