import java.util.Scanner;

public class Solution {
	static int N, M;
	static int[] p;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		// 테스트 케이스
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			// N개의 집합
			N = sc.nextInt();

			// 연산의 개수
			M = sc.nextInt();

			p = new int[N + 1];

			for (int i = 1; i < N + 1; i++) {
				p[i] = i;
			}

			sb.append("#" + tc + " ");

			for (int i = 0; i < M; i++) {
				int num = sc.nextInt();
				int a = sc.nextInt();
				int b = sc.nextInt();

				// num이 0이면 집합을 합친다는 뜻
				switch (num) {
				case 0:
					unionset(a, b);
					break;
				// num이 1이면 a와 b가 같은 집합인지 확인하는 연산
				case 1:
					if (findset(a) == findset(b)) {
						sb.append("1");
					} else {
						sb.append("0");
					}
					break;
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
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