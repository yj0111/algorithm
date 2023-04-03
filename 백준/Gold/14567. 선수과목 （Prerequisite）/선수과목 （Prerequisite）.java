import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class Node{
		int x , cnt;

		public Node(int x, int cnt) {
			super();
			this.x = x;
			this.cnt = cnt;
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		List<Integer>[] adjList = new ArrayList[N+1];
		for(int i = 1 ; i < N+1 ; i++) adjList[i] = new ArrayList<>();
		
		int[] inDegree = new int[N+1];
		boolean[] visited = new boolean[N+1];
		
		for(int i = 0 ; i < M ; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			adjList[s].add(e);
			inDegree[e]++;
		}
		
		Queue<Node> q = new LinkedList<>();
		int[] ans = new int[N+1];
		
		for(int i = 1 ; i < N+1 ; i++) {
			if(inDegree[i] == 0) q.add(new Node(i, 1));
		}
		
		while(!q.isEmpty()) {
			Node cur = q.poll();
			ans[cur.x] = cur.cnt;
			
			if(visited[cur.x]) continue;
			visited[cur.x] = true;
			
			for(int next : adjList[cur.x]) {
				inDegree[next]--;
				if(inDegree[next]==0) q.add(new Node(next, cur.cnt+1));
			}
		}
		for(int i = 1 ; i < N+1 ; i++) {
			System.out.print(ans[i]+" ");
		}
	}
}