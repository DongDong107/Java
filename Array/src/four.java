import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt() % 42;
		}

		int result = 10;
		int sum = 0;
		int count = 0;
		
		for (int j = 0; j < arr.length; j++) {
			

			for (int k = 0; k < arr.length; k++) {
				if (arr[j] == arr[k]) {
					count++;
				}
			}
			
			if(count>1) {
				result = result - count + 1;
				count = 0;
			}
			else
				count = 0;
			
			
//			sum = sum - count + 1;
		}

		System.out.print(result-count);

	}

}

//�������� ���� N�� ī����, (-N + 1) �Ѱ����� ���Ѵ�.

// result ���� 1 to 10 �� ���ų� �� �ٸ��ų�
// ���� ���� ���ڵ��� ���Ӿ� 
// 1�� 3����  2�� 2��     -2 -1       7 ������ 7�� + 1 8 
// �� ���鸸 ��Ƽ� �������� ����
// ���� ��û ���ư��� ���
// �������� �������� 
