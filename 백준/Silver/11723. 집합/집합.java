import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int bitset = 0;

		while (N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String menu = st.nextToken();
			int num;

			switch (menu) {
			case "add":
				num = Integer.parseInt(st.nextToken());
				bitset |= (1 << (num - 1));
				break;
			case "remove":
				num = Integer.parseInt(st.nextToken());
				bitset = bitset & ~(1 << (num - 1));
				break;
			case "check":
				num = Integer.parseInt(st.nextToken());
				sb.append((bitset & (1 << (num - 1))) != 0 ? "1\n" : "0\n");
				break;
			case "toggle":
				num = Integer.parseInt(st.nextToken());
				bitset ^= (1 << (num - 1));
				break;
			case "all":
				bitset |= (~0);
				break;
			case "empty":
				bitset &= 0;
				break;
			}
		}
		bw.write(sb.toString());
		bw.flush();
	}
}