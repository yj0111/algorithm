import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		int[][] ground = new int[N][M];

		// 땅의 최대 높이 , 최소 높이 구하려구
		int min = 256;
		int max = 0;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				ground[i][j] = Integer.parseInt(st.nextToken());
				if (min > ground[i][j])
					min = ground[i][j];
				if (max < ground[i][j])
					max = ground[i][j];
			}
		}

		// 시간 걍 최대로
		int time = Integer.MAX_VALUE;
		int result = 0;

		// 평탄화할 높이
		for (int x = min; x <= max; x++) {
			int count = 0;
			int inven = B;

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					// 1번 작업
					if (x < ground[i][j]) {
						count += ((ground[i][j] - x) * 2);
						inven += (ground[i][j] - x);
						// 2번 작업
					} else {
						count += (x - ground[i][j]);
						inven -= (x - ground[i][j]);
					}
				}
			}

			if (inven < 0)
				break;

			if (time >= count) {
				time = count;
				result = x;
			}
		}
		System.out.println(time + " " + result);
	}
}