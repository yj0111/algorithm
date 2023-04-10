import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] weights = new int[N + 1];
		int[] cost = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			weights[i] = sc.nextInt();
			cost[i] = sc.nextInt();
		}

		int[][] dp = new int[N + 1][W + 1];
		for (int i = 1; i <= N; i++) {
			for (int w = 0; w <= W; w++) {
				if (weights[i] <= w) {
					// 해당 w의 최적해는 : dp[i-1][w]
					// 이번 물건을 고려하는 최적해는 : dp[i-1][w-weights[i]]+cost[i]
					// 위의 두개의 값중 더 좋은걸로 갱신하겠다.
					dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i]] + cost[i]);
				} else {
					// 현재 임시무게가 지금 물건을 담을 수 없어서 고려제외
					dp[i][w] = dp[i - 1][w];
				}
			}
		}
		System.out.println(dp[N][W]);
	}
}