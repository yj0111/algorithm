import java.io.IOException;
import java.util.Scanner;

public class Main {
	// 문제에 나온거 쓰면 시간초과남 DP로 풀어야함
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] fibo0 = new int[41];
			int[] fibo1 = new int[41];
			fibo0[0] = 1;
			fibo0[1] = 0;
			fibo1[0] = 0;
			fibo1[1] = 1;
			for (int k = 2; k <= N; k++) {
				fibo0[k] = fibo0[k - 1] + fibo0[k - 2];
				fibo1[k] = fibo1[k - 1] + fibo1[k - 2];
			}
			System.out.println(fibo0[N] + " " + fibo1[N]);
		}
	}
}