import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// nCm = n!/(n-m)!*m!

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		//BigInte
		BigInteger x = BigInteger.ONE;
		BigInteger y = BigInteger.ONE;

		for (int i = 0; i < m; i++) {
			x = x.multiply(new BigInteger(String.valueOf(n - i)));
			y = y.multiply(new BigInteger(String.valueOf(i + 1)));
		}

		System.out.println(x.divide(y));
	}
}