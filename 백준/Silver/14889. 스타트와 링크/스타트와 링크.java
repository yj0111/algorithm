import java.util.Scanner;

public class Main {
	static int N = 0;
	static int[][] list;
	static boolean[] visited;
	static int Min = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		// 점수조합
		list = new int[N][N];
		// 방문했는지
		visited = new boolean[N];

		// 점수 입력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				list[i][j] = sc.nextInt();
			}
		}

		combi(0, 0);
		System.out.println(Min);

	}

	static void combi(int idx, int count) {
		if (count == N / 2) {
			// 점수 차이 구하기
			cal();
			return;
		}

		for (int i = idx; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				combi(i + 1, count + 1);
				visited[i] = false;
			}
		}

	}

	// 점수 차이 구하기
	static void cal() {
		// 스타트팀 점수
		int t_s = 0;
		// 링크팀 점수
		int t_l = 0;

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (visited[i] == true && visited[j] == true) {
					t_s += list[i][j];
					t_s += list[j][i];
				} else if (visited[i] == false && visited[j] == false) {
					t_l += list[i][j];
					t_l += list[j][i];
				}
			}
		}

		// 점수 차이
		int result = Math.abs(t_s - t_l);

		// 최솟값
		Min = Math.min(result, Min);
	}

}