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

		int N = Integer.parseInt(st.nextToken());

		int[][] money = new int[N][3];
		int[][] dp = new int[N][3];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				money[i][j] = Integer.parseInt(st.nextToken());
				if (i == 0) {
					dp[i][j] = money[i][j];
				} else if (j == 0) { // i 빨강색
					// i-1 초록or파랑 + i 빨강 돈
					dp[i][j] = Math.min(dp[i - 1][1], dp[i - 1][2]) + money[i][j];
				} else if (j == 1) {// i 초록색
					// i-1 빨강or파랑 + i 초록 돈
					dp[i][j] = Math.min(dp[i - 1][0], dp[i - 1][2]) + money[i][j];
				} else {// i 파란색
					dp[i][j] = Math.min(dp[i - 1][0], dp[i - 1][1]) + money[i][j];
				}
			}
		}
		bw.append(String.valueOf(Math.min(dp[N - 1][0], Math.min(dp[N - 1][1], dp[N - 1][2]))));
		bw.flush();
	}
}