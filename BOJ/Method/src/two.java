
public class two {

	public static int d(int a) {

		String num = String.valueOf(a); // 들어온 수를 형변환

		String[] arr = num.split(""); // 각 자리별로 나누고

		int sum = a; // d()결과값 선언

		for (int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		} // 반복문을 통해 각 자리값을 형변환 다시 해서 더해줌.

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
