
public class two {

	public static int d(int a) {

		String num = String.valueOf(a); // ���� ���� ����ȯ

		String[] arr = num.split(""); // �� �ڸ����� ������

		int sum = a; // d()����� ����

		for (int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		} // �ݺ����� ���� �� �ڸ����� ����ȯ �ٽ� �ؼ� ������.

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[1000000];

		for (int i = 1; i < 10000; i++) {
			int n = d(i);
			arr[n]++;
		}

		for (int i = 1; i <= 10000; i++) {
			if (arr[i] == 0) {
				System.out.println(i);
			}
		}
	}

}
