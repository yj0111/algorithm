import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	//우선순위큐 방법
    static class Node implements Comparable<Node> {
        int v, w;

        public Node(int v, int w) {
            this.v = v;
            this.w = w;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.w, o.w);
        }
    }

    static final int INF = Integer.MAX_VALUE;
    static int V, E, K;
    static List<Node>[] adjList;
    static int[] dist;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        V = sc.nextInt();
        E = sc.nextInt();
        K = sc.nextInt();

        adjList = new ArrayList[V+1];
        for (int i = 0; i < V+1; i++) {
            adjList[i] = new ArrayList<>();
        }

        dist = new int[V+1];
        Arrays.fill(dist, INF);

        for (int i = 0; i < E; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int W = sc.nextInt();

            adjList[A].add(new Node(B, W));
        }

        dijkstra();

        for (int i = 1; i < dist.length; i++) {
            if(dist[i] == INF) {
                System.out.println("INF");
            }else {
                System.out.println(dist[i]);
            }
        }
    }

    private static void dijkstra() {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(K, 0));
        dist[K] = 0;

        while(!pq.isEmpty()) {
            Node curr = pq.poll();
            int currV = curr.v;
            int currW = curr.w;

            if(currW > dist[currV]) continue;

            for(Node next : adjList[currV]) {
                int nextV = next.v;
                int nextW = currW + next.w;

                if(nextW < dist[nextV]) {
                    dist[nextV] = nextW;
                    pq.offer(new Node(nextV, nextW));
                }
            }
        }
    }
}