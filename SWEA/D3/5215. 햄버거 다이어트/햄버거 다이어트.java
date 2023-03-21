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

			int[] s_result = new int[(1 << N)];
			int[] c_result = new int[(1 << N)];

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
					c_result[i] = c_sum;
					s_result[i] = s_sum;
				}
			}
			int max = 0;
			for (int i = 0; i < s_result.length; i++) {
				if (max < s_result[i]) {
					max = s_result[i];
				}
			}

			System.out.println("#"+tc+" "+max);
		}
	}
}