import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static long[] p;
	static int N;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		p = new long[101];
		p[1] = 1;
		p[2] = 1;
		p[3] = 1;

		for (int i = 4; i <= 100; i++) {
			p[i] = p[i - 2] + p[i - 3];
		}

		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());

			System.out.println(p[N]);
		}
	}
}