import java.util.Scanner;

public class fourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(a / 10);
//		System.out.println(a % 10);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = N;
		int M = 0;
		int count = 1;

		for (;;) {
//			int N = sc.nextInt();
			

			int a = N / 10;
			int b = N % 10;

			M = (b*10)+((a+b)%10);
			N=M;
						
			if (A == M) {
				System.out.print(count);
				break;
			} else
				count++;

		}

	}

}

