import java.util.Random;
import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Random random = new Random();

		int A = 0;
		int B = 0;

		System.out.println("������ ���߱�");
		System.out.println("���Ḧ ���Ͻø� 0�� �Է����ּ���.");
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
			
			System.out.println(A + " X " + B + "�� ����?");

			int rs = sc.nextInt();
			
			if(rs==0) {
				System.out.println("�����ϼ̽��ϴ�!");
				break;
			}

			if (A * B == rs) {
				System.out.println("����!");
			} else
				System.out.println("Ʋ�Ƚ��ϴ� �Ф� ������ " + A * B + " �����ϴ�.");

		}

	}

}
