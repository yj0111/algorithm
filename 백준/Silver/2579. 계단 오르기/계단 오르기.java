import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] score = new int[n + 1];
		int[] dp = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			score[i] = sc.nextInt();
		}

		dp[1] = score[1];
		
		if (n >= 2) {
			dp[2] = score[1] + score[2];
		}

		// 무조건 마지막 계단은 밟아야함
		// 연속 3개 계단 밟는건 안되니까
		// i-2를 밟으면 i-1을 밟으면 안됨
		for (int i = 3; i <= n; i++) {
			dp[i] = Math.max(dp[i - 2] + score[i], dp[i - 3] + score[i - 1] + score[i]);
		}

		System.out.println(dp[n]);
	}
}