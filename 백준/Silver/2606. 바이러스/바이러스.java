import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int N,M;
	static int[][] graph;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		graph = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = 1;
			graph[b][a] = 1;
		}
		
		bfs(1);
	}
	
	public static void bfs(int n) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(n);
		visited[n] = true;
		
		int cnt = 0;
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			
			for (int i = 1; i <= N; i++) {
				if(!visited[i] && graph[curr][i] == 1) {
					q.offer(i);
					visited[i] = true;
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}