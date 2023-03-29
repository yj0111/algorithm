import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Solution {
	static int V;
	static int E;
	static int[] p;
	static int[][] edges;

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			V = Integer.parseInt(st.nextToken());

			E = Integer.parseInt(st.nextToken());

			edges = new int[E][3];

			for (int i = 0; i < E; i++) {
				st = new StringTokenizer(br.readLine());
				edges[i][0] = Integer.parseInt(st.nextToken());
				edges[i][1] = Integer.parseInt(st.nextToken());
				edges[i][2] = Integer.parseInt(st.nextToken());
			}

			Arrays.sort(edges, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[2] - o2[2];
				}
			});

			p = new int[V + 1];
			makeset();

			long result = 0;
			for (int i = 0; i < E; i++) {
				if (union(edges[i][0], edges[i][1])) {
					result += edges[i][2];
				}
			}

			System.out.println("#" + tc + " " + result);
		}
	}

	static void makeset() {
		for (int i = 1; i <= V; i++) {
			p[i] = i;
		}
	}

	static int findset(int a) {
		if (p[a] == a) {
			return a;
		} else {
			return p[a] = findset(p[a]);
		}
	}

	static boolean union(int a, int b) {
		int aRoot = findset(a);
		int bRoot = findset(b);

		if (aRoot != bRoot) {
			p[bRoot] = aRoot;
			return true;
		}
		return false;
	}
}