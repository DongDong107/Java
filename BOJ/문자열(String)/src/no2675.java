import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class no2675 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine()); // �׽�Ʈ ���̽� ���� �Է�
		

		for (int i = 0; i < T; i++) {
			
			// ������ �ΰ� �Է¹ޱ�
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken(); // ��������� �Է¹޴´�. 
			
			/*���ڿ��� ��� �ٲ�Ŵϱ� �޸� ���� ������ ���ؼ� StringBuilder ���
			ó������ for���ȿ� �ȳ����ϱ� String�� ��� ���̴� ����� �߻�����*/
			
			StringBuilder stringBuilder = new StringBuilder(); 
			
			// ���ڸ��� �ݺ� Ƚ�� R ��ŭ �ݺ��ؼ� �߰��ϵ��� �������
			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) {
					stringBuilder.append(S.charAt(j));
				}
			}
			
			// StringBuilder�� �� toString() ����� �Ѵٰ� �ؼ� (���� �˾ƺ���)
			String str = stringBuilder.toString();

			bw.write(str);
			bw.newLine();
		}

		bw.flush();
		bw.close();

	}

}
