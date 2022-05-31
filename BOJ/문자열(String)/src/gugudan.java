import java.util.Random;
import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Random random = new Random();

		int A = 0;
		int B = 0;

		System.out.println("구구단 맞추기");
		System.out.println("종료를 원하시면 0을 입력해주세요.");
		for(;;) {
			random.setSeed(System.currentTimeMillis());

			A = random.nextInt(9);
			while (A == 0) {
				A = random.nextInt(9);
			}

			B = random.nextInt(9);
			while (B == 0) {
				A = random.nextInt(9);
			}
			
			System.out.println(A + " X " + B + "의 값은?");

			int rs = sc.nextInt();
			
			if(rs==0) {
				System.out.println("수고하셨습니다!");
				break;
			}

			if (A * B == rs) {
				System.out.println("정답!");
			} else
				System.out.println("틀렸습니다 ㅠㅠ 정답은 " + A * B + " 였습니다.");

		}

	}

}
