import java.util.Scanner;

public class three {

	public static int calculate(int n) {
		int count = 0;

		for (int i = 1; i <= n; i++) {
//			String a = Integer.toString(n); //int String����ȯ�� ToString ����

			int length = String.valueOf(i).length();
//			int[] arr = new int[(int)(Math.log10(n)+1)]; Math �Լ��̿��� ���� ���ϱ�

			int[] arr = new int[length]; // �ڸ�����ŭ �迭 ����

			int clone = i; // �ڸ��������� i �״�� ������ ���� ���ع�����

			for (int j = 0; j < length; j++) {
				arr[j] = clone % 10;
				if (clone < 10) {
					break;
				}
				clone = clone / 10;
//				System.out.println(arr[j]);
			} // �� �ڸ��� �迭�� �ֱ�

//			int gap = arr[length] - arr[length-1];
//
//			for (int j = length; j > 0; j--) {
//				if (length < 3) {
//					count++;
//				} else if (arr[length] - arr[length-1]!= gap) {
//					break;
//				} else if (j == length - 1) {
//					count++;
//				} // ��� ���� �����Ͽ� �ݺ����� �� ���ư��� ī��Ʈ
//			}

			if (length < 3) {
				count++;
			} else {

				int gap = arr[length - 1] - arr[length - 2]; // 1. ������ ���� ���Ѵ�.

				for (int j = length - 1; j > 1; j--) { //���ʺ��� ���Ѵ�. j>1���� ���ϴ� ������ j>0�� �ϰԵǸ� ���ǹ� arr[j-2] ���ܹ߻�./ j=2 �϶� ������ ������ 0�� 1 �� ������ �������� ���ϱ� ������

					if (arr[j - 1] - arr[j - 2] != gap) { //j���� ����� �ϸ� gap �κ��̶� �����ؼ� ī��Ʈ�� �Ǿ �ٷ� ���� ���� ���
						break;	// �ٸ��� �Ǹ� ���ʿ� ���⼭ �ɷ���
					} else {
						count++; // �� �Ѿ�� ���� ���������̹Ƿ� ī��Ʈ
					}

				}

//					else if (j == length - 1) {
//						count++;
//					} 
			}
		}

		// gap������� ���Ⱑ �����Ǿ�� �� �κ�.

		System.out.print(count);

		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// N�� �� �ڸ����� ���Ѵ�.
		// ���ڸ����� ���ڸ����� ���� ���Ͽ� �� ���� �����Ѵ�.
		// �ݺ����� ���� ���� �վƸ����� �� ���ڸ������� ���� ���Ͽ� ������ �Ѿ��.
		// �� �Ѿ�� ī��Ʈ �ƴϸ� ���� �ݺ�������
		// ī��Ʈ �� ���

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		calculate(a);

	}

}
