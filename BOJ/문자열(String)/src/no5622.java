import java.io.*;

public class no5622 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[][] Dial = { { "A", "B", "C" }, { "D", "E", "F" }, { "G", "H", "I" }, { "J", "K", "L" },
				{ "M", "N", "O" }, { "P", "Q", "R", "S" }, { "T", "U", "V" }, { "W", "X", "Y", "Z" } };

		String str = br.readLine();

		int time = 0;

		for (int i = 0; i < str.length(); i++) {

			String a = String.valueOf(str.charAt(i));

			for (int j = 0; j < Dial.length; j++) {
				for (int k = 0; k < Dial[j].length; k++) {
					if (a.equals(Dial[j][k])) {
						time += 3 + j;
					}
				}
			}
		}
		
		bw.write(String.valueOf(time));

		bw.flush();
		bw.close();

	}

}
