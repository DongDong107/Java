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

//�迭���� ���ڸ���
//���ڸ� �ִ´�.
//�� ���ڰ�
//������ ī��Ʈ�Ѵ�.����Ѵ�
