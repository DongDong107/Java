import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// �ð��ʰ�! 

public class no1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// ���ĺ��� �� �빮��ȭ �� �Ŀ�
		// Max ���� ����
		// �� �ܾ�� �ݺ��� �Ŀ� ī�����Ͽ� Max ���� ���ڿ��� ����
		//

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// �Է¹��� ���� �빮�ڷ� ��ȯ
		String str = br.readLine().toUpperCase();

		// �迭ȭ
		char[] arr = str.toCharArray();
		/*
		 * ��� ���ư��״ϱ� ���࿡ count ���� ���� �� ã������ ? ���� �����޴ٰ� �ٽ� ���� �ٲ�� �� ���� �����ϴ� �ɷ� �غ���
		 * �� ������ : �ѱ��� �ѱ��� ���ϹǷ� ù��° ���ڰ� ���߿� ���͵� ? �Ǿ����
		 * ���ؼ� Max ���� ã�� �迭�� �־ �ߺ��� ���� �� �� �迭�� ���̰� 1 �̻��̸� ? ���
		 */
		int max = 0;
		char[] maxarr = new char[arr.length];
		int k=0;
		
		HashSet<String> set2 = new HashSet<String>();
		
		for (int i = 0; i < arr.length; i++) {
			
			int count = 0;
			
			
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			if (count > max) {
				max = count;
				set2.clear();
				set2.add(String.valueOf(arr[i]));
			}
			else if (count == max) {
				set2.add(String.valueOf(arr[i]));
			}
		}
		
		String exm = new String(maxarr); // char �迭 string ȭ
		
		HashSet<String> hashSet = new HashSet<>(Arrays.asList(exm));
		
		String[] resultArr = hashSet.toArray(new String[0]);
		
		// �ߺ� ���Ű� �ȵ���. 
		
//		if(resultArr.length>2) {
//			System.out.println("?");
//		}
//		else {
//			System.out.println(resultArr[0]);
//		}
		if(set2.size()>1) {
			System.out.println("?");
		}
		else {
			String[] arr3 = set2.toArray(new String[0]);
			System.out.println(arr3[0]);      
			//hashset�� ���ϴ� index ���ڿ� Ȯ���� �Ұ����ؼ� �迭�� �ٲ��� ã�Ɣf��
		}
	}

}
