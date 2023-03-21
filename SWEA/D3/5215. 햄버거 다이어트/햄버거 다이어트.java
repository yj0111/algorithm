import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 테스트 케이스
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			// 재료 수

			int N = sc.nextInt();
			// 제한 칼로리
			int K = sc.nextInt();

			int[] list = new int[N];
			int[] cal = new int[N];

			for (int i = 0; i < N; i++) {
				list[i] = sc.nextInt();
				cal[i] = sc.nextInt();
			}

			int max = 0;
			for (int i = 0; i < (1 << N); i++) {
				int s_sum = 0;
				int c_sum = 0;
				for (int j = 0; j < N; j++) {
					if ((i & (1 << j)) > 0) {
						s_sum += list[j];
						c_sum += cal[j];
					}
				}
				if (c_sum < K) {
					if (max < s_sum) {
						max = s_sum;
					}

				}
			}

			System.out.println("#" + tc + " " + max);
		}
	}
}