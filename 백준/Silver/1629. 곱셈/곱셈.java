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
		StringTokenizer st = new StringTokenizer(br.readLine());

		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long C = Long.parseLong(st.nextToken());

		long result = pow(A, B, C);
		System.out.println(result);

	}

	static long pow(long a, long b, long c) {
		long result = 1;
		a = a % c;
		while (b > 0) {
			if (b % 2 == 1) {
				result = (result * a) % c;
			}
			b = b >> 1;
			a = (a * a) % c;
		}
		return result;
	}
}