
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "01033334444";
		
		String b = a.substring(0,a.length()-4).replaceAll(".", "*");
		
		System.out.println(a.length());
		System.out.println(b);
		System.out.println(a.substring(7,11));
	}

}
