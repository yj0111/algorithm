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

		list = new int[N + 1];
		result = new int[M]; // 결과 순열
		visited = new boolean[N + 1];

		for (int i = 1; i <= N; i++) {
			list[i] = i;
		}

		check(0);
		bw.flush();
	}

	public static void check(int idx) throws IOException {
		if (idx == M) {
			for (int i = 0; i < M; i++) {
				bw.append(String.valueOf(result[i]) + " ");
			}
			bw.append("\n");
			return;
		}

		for (int i = 1; i <= N; i++) {
			//같은 수를 여러 번 골라도 된다! visited 검사 안해도 됨
			result[idx] = list[i]; 
			visited[i] = true; 
			check(idx + 1); 
			visited[i] = false; 
		}
	}
}