import java.util.Scanner;

public class thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

//		for (;;) {
//			int A = sc.nextInt();
//			int B = sc.nextInt();
//
//			if (sc.hasNext() == false) {
//				break;
//			} else
//				System.out.println(A + B);
//		}
		
		while(sc.hasNext()) {
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(A + B);
		}

	}

}
