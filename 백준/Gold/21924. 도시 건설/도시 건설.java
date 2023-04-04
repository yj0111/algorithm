import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[] p;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		// 도로를 다 설치했을때 드는 최대 비용
		long max = 0;
		// 최소로 설치할 수 있는 비용
		long min = 0;
		int[][] map = new int[M][3];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			map[i][0] = Integer.parseInt(st.nextToken());
			map[i][1] = Integer.parseInt(st.nextToken());
			map[i][2] = Integer.parseInt(st.nextToken());
			max += map[i][2];
		}

		Arrays.sort(map, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[2] - o2[2];
			}
		});

		p = new int[N + 1];
		
		// makeset
		for (int i = 1; i <= N; i++) {
			p[i] = i;
		}

		//result 구하기
		for (int i = 0; i < M; i++) {
			if (union(map[i][0], map[i][1])) {
				min += map[i][2];
			}
		}
		
		//모든 도시가 서로 연결되어있는지 아닌지 찾는 방법
		//1번 도시를 부모 노드로 해서 다른 도시의 부모 노드가 1번 노드랑 같은지 검사하는 방법 !! 
		//통일 안되어있으면 -1 출력해서 끝내버리기
		int root = findset(1);
		for (int i = 2; i <= N; i++) {
		    if (findset(i) != root) {
		        System.out.println("-1");
		        return;
		    }
		}
		
		//절약하는 비용
		bw.append(String.valueOf(max-min));
		bw.flush();
	}

	private static int findset(int x) {
		if (p[x] == x) {
			return x;
		} else {
			return p[x] = findset(p[x]);
		}
	}

	static boolean union(int x, int y) {
		int rootX = findset(x);
		int rootY = findset(y);

		if (rootX != rootY) {
			p[rootY] = rootX;
			return true;
		}
		return false;
	}

}