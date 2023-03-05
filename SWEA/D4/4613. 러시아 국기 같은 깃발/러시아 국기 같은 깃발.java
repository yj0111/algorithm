import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 테케 수
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			// N개의 줄에
			int N = sc.nextInt();
			// M개의 문자로 이루어짐
			int M = sc.nextInt();

			int[][] map = new int[N][M];

			for (int i = 0; i < N; i++) {
				String text = sc.next();
				char[] arr = text.toCharArray();
				for (int j = 0; j < M; j++) {
					map[i][j] = arr[j];
				}
			}

			// 최소값
			int min = Integer.MAX_VALUE;

			for (int b = 1; b < N - 1; b++) {
				for (int r = 2; r < N; r++) {

					int cnt = 0;
					// 흰색
					for (int i = 0; i < b; i++) {
						for (int j = 0; j < M; j++) {
							if (map[i][j] != 'W') {
								cnt++;
							}
						}
					}
					//파랑색
					for (int i = b; i < r; i++) {
						for (int j = 0; j < M; j++) {
							if (map[i][j] != 'B') {
								cnt++;
							}
						}
					}
					
					//빨강색
					for (int i = r; i < N; i++) {
						for (int j = 0; j < M; j++) {
							if (map[i][j] != 'R')
								cnt++;
						}
					}

					if (min > cnt) {
						min = cnt;
					}
				}
			}
			System.out.println("#" + tc + " " + min);
		}
	}

}