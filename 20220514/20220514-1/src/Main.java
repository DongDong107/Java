import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, num3 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		int Max = num1;		
		
		if(Max >= num2) {
			if(Max >= num3) {
				Max = num1;
			}
			else {
				Max = num3;
			}
		}
		else {
			if(num2 >= num3) {
				Max = num2;
			}
			else {
				Max = num3;
			}
		} // 최대값 찾기 (조건문으로만)
	
		if(num1 == num2) {
			if(num2 == num3) {
				System.out.print(10000+num1*1000);
			}			
			else {
				System.out.print(1000+num1*100);
			}
		}
		else {
			if(num2 == num3) {
				System.out.print(1000+num2*100);
			}
			else {
				System.out.print(Max*100);
			}
		} // 비교해서 값 계산하기 
		
	
	}

}
