import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		// 인접 리스트
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			arr.add(new ArrayList<>());
		}

		for (int i = 0; i < N - 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr.get(a).add(b);
			arr.get(b).add(a);
		}

		Queue<Integer> q = new LinkedList<>();
		boolean[] visit = new boolean[N + 1];
		int[] parent = new int[N + 1];

		q.add(1);
		visit[1] = true;

		while (!q.isEmpty()) {
			int curr = q.poll();
			for (int next : arr.get(curr)) {
				if (!visit[next]) {
					visit[next] = true;
					parent[next] = curr;
					q.add(next);
				}
			}
		}

		for (int i = 2; i <= N; i++) {
			sb.append(parent[i] + "\n");
		}
		System.out.println(sb);

	}
}