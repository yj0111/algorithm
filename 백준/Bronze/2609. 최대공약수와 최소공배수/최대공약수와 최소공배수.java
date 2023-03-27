import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());

		int[] answers = solution(num1, num2);

		bw.append(answers[0] + "\n" + answers[1]);
		bw.flush();
	}

	static int[] solution(int a, int b) {
		// 최대공약수(Greatest Common Divisor, GCD)
		int gc = gcd(a, b);
		int[] result = new int[] { gc, gc * (a / gc) * (b / gc) };

		return result;
	}

	// 유클리드 알고리즘
	static int gcd(int a, int b) {
		// 나머지가 0 이되는 순간 다음 호출에서 리턴한다.
		if (b == 0) {
			return a;
		}

		int mod = a % b;

		return gcd(b, mod);
	}

}