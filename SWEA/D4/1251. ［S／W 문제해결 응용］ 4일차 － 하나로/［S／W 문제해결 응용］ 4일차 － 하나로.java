import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
	static int N;
	static double E;
	static double x[], y[]; // x좌표, y좌표
	static int[] p; // 대표를 저장할 배열
	static Edge[] nodes;
	static ArrayList<Edge> list;
	static double money;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			x = new double[N];
			y = new double[N];
			// 대표를 저장할 배열
			p = new int[N];
			list = new ArrayList<Edge>();

			// 최소 환경 부담금
			money = 0;

			// 섬의 X좌표
			for (int i = 0; i < N; i++) {
				x[i] = sc.nextDouble();
			}

			// 섬의 Y좌표
			for (int i = 0; i < N; i++) {
				y[i] = sc.nextDouble();
			}
			// 환경 부담 세율
			E = sc.nextDouble();

			for (int i = 0; i < N - 1; i++) {
				for (int j = i + 1; j < N; j++) {
					//두 섬 사이의 거리 
					double w = E * (double) (Math.pow(x[i] - x[j], 2) 
								+ Math.pow(y[i] - y[j], 2));
					list.add(new Edge(i, j, w));
				}
			}

			// 정렬
			Collections.sort(list);

			// 대표 배열
			for (int i = 0; i < N; i++) {
				p[i] = i;
			}


			for (Edge e : list) {
				if (union(e.start, e.end)) {
					money = money + e.weight;
				}
			}

			// 최소 환경 부담금을 소수 첫째 자리에서 반올림
			System.out.println("#" + tc + " " + Math.round(money));
		}
	}

	static class Edge implements Comparable<Edge> {
		int start, end;
		double weight;

		public Edge(int x, int y, double weight) {
			this.start = x;
			this.end = y;
			this.weight = weight;
		}

		@Override
		public int compareTo(Edge o) {
			return Double.compare(this.weight, o.weight);
		}
	}

	static int findset(int a) {
		if (a != p[a])
			p[a] = findset(p[a]);
		return p[a];
	}

	static boolean union(int a, int b) {
		if (findset(a) != findset(b)) {
			p[findset(b)] = findset(a);
			return true;
		}
		return false;
	}
}