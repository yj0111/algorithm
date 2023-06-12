import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 소시지 수
		int n = Integer.parseInt(st.nextToken());
		// 평론가 수
		int m = Integer.parseInt(st.nextToken());

		System.out.println(m - cut(n, m));
	}

	static int cut(int a, int b) {
		if (a % b == 0) {
			return b;
		} else {
			return cut(b, a % b);
		}
	}
}