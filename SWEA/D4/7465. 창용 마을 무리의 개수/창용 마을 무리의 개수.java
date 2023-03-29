import java.util.Scanner;

public class Solution {
	static int N, M, cnt;
	static int[] p;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			M = sc.nextInt();
			cnt = 0;

			p = new int[N + 1];
			visited = new boolean[N + 1];
			for (int i = 0; i < p.length; i++) {
				p[i] = i;
			}

			for (int i = 0; i < M; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				unionset(a, b);
			}

			for (int i = 1; i < N + 1; i++) {
				findset(i);

				if (!visited[p[i]]) {
					cnt++;
					visited[p[i]] = true;
				}
			}
			System.out.println("#" + tc + " " + cnt);
		}
	}

	static int findset(int x) {
		if (p[x] != x) {
			p[x] = findset(p[x]);
		}
		return p[x];
	}

	static void unionset(int a, int b) {
		p[findset(b)] = findset(a);
	}
}