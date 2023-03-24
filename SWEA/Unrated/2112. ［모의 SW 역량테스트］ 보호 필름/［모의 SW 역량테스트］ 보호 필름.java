import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	static int D, W, K, result;
	static int[][] arr, copy;

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			D = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());

			arr = new int[D][W];
			copy = new int[D][W]; // 배열 복사해두기
			result = Integer.MAX_VALUE;

			for (int i = 0; i < D; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < W; j++) {
					arr[i][j] = copy[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			// 시작
			replay(0, 0);

			// 출력결과
			if (search()) {
				bw.append("#" + tc + " " + 0 + "\n");
			} else {
				bw.append("#" + tc + " " + result + "\n");
			}

			bw.flush();
		}

	}

	private static void replay(int count, int idx) {
		if (count >= result) {
			return; // 가지치기
		}

		if (idx == D) {
			if (search()) {
				result = Math.min(count, result);
			}
			return;
		}
		replay(count, idx + 1);

		// 1로 다 주입해 준 경우
		for (int i = 0; i < W; i++) {
			arr[idx][i] = 1;
		}
		replay(count + 1, idx + 1);

		// 0으로 주입해 준 경우
		for (int i = 0; i < W; i++) {
			arr[idx][i] = 0;
		}
		replay(count + 1, idx + 1);

		// 원상복구 해주기
		for (int i = 0; i < W; i++) {
			arr[idx][i] = copy[idx][i];
		}

	}

	static boolean search() {
		boolean check = true;
		for (int i = 0; i < W; i++) {

			int count0 = 0;
			int count1 = 0;
			int cnt = 0;
			for (int j = 0; j < D; j++) {
				// 0카운트 해주기
				if (arr[j][i] == 0) {
					count0++;
				} else {
					count0 = 0;
				}

				// 1카운트 해주기
				if (arr[j][i] == 1) {
					count1++;
				} else {
					count1 = 0;
				}

				// 합격 기준
				if (count0 == K || count1 == K) {
					cnt = 1;
					break;
				}
			}

			// 카운트 0이면 바로 나가
			if (cnt == 0) {
				check = false;
				break;
			}

		}

		if (check) {
			return true;
		} else {
			return false;
		}

	}

}