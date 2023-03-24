import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[] list;
	static int[] result;
	static boolean[] visited;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		list = new int[M];
		visited = new boolean[N + 1];

		check(1, 0);
		bw.flush();
	}

	public static void check(int at, int idx) throws IOException {
		if (idx == M) {
			for (int i = 0; i < M; i++) {
				bw.append(String.valueOf(list[i]) + " ");
			}
			bw.append("\n");
			return;
		}
        
        //배열이 오름차순인것만 
		for (int i = at; i <= N; i++) {
			list[idx] = i;
			visited[i] = true; 
			check(i, idx + 1);
			visited[i] = false; 
		}
	}
}