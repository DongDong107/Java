import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		String s = br.readLine(); // �Է¹޴°�
		StringTokenizer st = new StringTokenizer(s); // ���� ������ �����Ҷ� ����

		String N = st.nextToken();
		String M = st.nextToken(); // �ϳ� �ϳ�

		String arr[] = s.split(" ");

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write(s);
		bw.write("\n"); // ����ó��
		bw.write(arr[1]);
		bw.newLine(); // ����ó��2

		bw.flush();// ���ۺ���
		bw.close();// ��½�Ʈ���ݱ�

		// String Happy �Է½�
		// String Happy
		// Happy ���

	}

}
