import java.io.*;

public class no1157ver2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// ���ĺ� ������ 26��. ����صα�
		int[] arr = new int[26];
		
		// toUpperCase() �빮�� toLowerCase() �ҹ���
		String str = br.readLine().toUpperCase();

		for (int i = 0; i < str.length(); i++) {

			int a = str.charAt(i); //�ش��ڸ� ã�ڸ��� �ƽ�Ű�ڵ�ȭ
			arr[(int)str.charAt(i) - 65]++; // �빮�� A �ƽ�Ű�ڵ� 65 , �ҹ��� a �ƽ�Ű�ڵ� 97 

		}
		// �ش� ���ĺ� �κи� ī��Ʈ. �� ���Ŀ�?
		// Max�� ã�´�.
		// ������ �����ϴ� ����? �ϴ� �ƽ� ã��.

		// �ƽ� ã��
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		// ī��Ʈ�� ��ġ ����ϱ� ���� ���� ����
		int count = 0;
		int s = 0;
		
		// �ƽ����� ��ġ�� �ڸ� ã�� (�ƽ����� ��ġ������ Ȯ��)
		for (int i = 0; i < arr.length; i++) {
			if (max == arr[i]) {
				count++;
				s = i;
			}
		}
		
		// �ƽ�Ű�ڵ� ��ȯ�� char �ڷ��� �̿�
//		String str1 = String.valueOf(s-65); <- �Ǽ��� �κ�
		char ch = (char) (s + 65);
		
		// 2���̻���ʹ� ������ ? ��� �ƴϸ� 
		if (count > 1) {
			bw.write("?");
		} else
			bw.write(ch);

		bw.flush();
		bw.close();
		
//		char str3 = 'b' ;

	}

}
