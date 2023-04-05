import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int cnt = 0;
		boolean[] visited = new boolean[100001];
		Queue<Integer> q = new LinkedList<Integer>();
		// 언니가 출발하는 위치를 큐에 넣고 방문체크하기
		q.offer(N);
		visited[N] = true;

		while (!q.isEmpty()) {
			int size = q.size();

			// 큐에서 하나 꺼내고 , 이 위치에서 이동할수있는 모든 경우를 다 돌기
			for (int i = 0; i < size; i++) {
				int curr = q.poll();

				// 현재 위치가 동생이랑 만나면 멈추기
				if (curr == K) {
					System.out.println(cnt);
					return;
				}

				// 갈수있는 경우들 다 체크&&방문하지 않은 경우에만 확인하기
				if (curr - 1 >= 0 && !visited[curr - 1]) {
					q.offer(curr - 1);
					visited[curr - 1] = true;
				}

				if (curr + 1 <= 100000 && !visited[curr + 1]) {
					q.offer(curr + 1);
					visited[curr + 1] = true;
				}

				if (curr * 2 <= 100000 && !visited[curr * 2]) {
					q.offer(curr * 2);
					visited[curr * 2] = true;
				}
			}
			cnt++;
		}
	}
}