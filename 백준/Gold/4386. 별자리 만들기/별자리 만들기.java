import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	static int[] p;
	static int N;
	static double ans;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		double[][] stars = new double[N][2];
		for (int i = 0; i < N; i++) {
			stars[i][0] = sc.nextDouble();
			stars[i][1] = sc.nextDouble();
		}

		int edgeCount = N * (N - 1) / 2;
		double[][] edges = new double[edgeCount][3];

		int idx = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				edges[idx][0] = i;
				edges[idx][1] = j;
				//두 점 사이의 거리 구하기
				edges[idx][2] = Math.sqrt(Math.pow(stars[i][0] - stars[j][0], 2) + Math.pow(stars[i][1] - stars[j][1], 2));
				idx++;
			}
		}

		Arrays.sort(edges, new Comparator<double[]>() {
		    @Override
		    public int compare(double[] a, double[] b) {
		        return Double.compare(a[2], b[2]);
		    }
		});

		p = new int[N];
		Arrays.fill(p, -1);

		for (int i = 0; i < edgeCount; i++) {
			int x = (int) edges[i][0];
			int y = (int) edges[i][1];
			double result = edges[i][2];

			if (union(x, y)) {
				ans += result;
			}
		}

		System.out.printf("%.2f", ans);
	}

	static int findset(int n) {
		if (p[n] < 0) {
			return n;
		}
		p[n] = findset(p[n]);
		return p[n];
	}

	static boolean union(int a, int b) {
		int rootA = findset(a);
		int rootB = findset(b);

		if (rootA == rootB) {
			return false;
		}
		p[rootB] = rootA;
		return true;
	}

}