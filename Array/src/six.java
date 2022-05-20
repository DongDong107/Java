import java.util.Scanner;

public class six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			String[] arr;
			String word;
			word = sc.nextLine();
			
			arr = word.split("");

			int count = 0;
			int sum = 0;

			for (int j = 0; j < arr.length; j++) {
				if (arr[j].equals("O")) {
					count++;
					sum += count;
				} else {
					count = 0;
				}
			}

			System.out.println(sum);
		}

	}

}
