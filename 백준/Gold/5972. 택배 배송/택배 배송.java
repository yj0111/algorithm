import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int N, M;
    static ArrayList<Node>[] graph;
    static int[] dist;
    static boolean[] visited;

    static class Node implements Comparable<Node> {
        int index, weight;

        Node(int index, int weight) {
            this.index = index;
            this.weight = weight;
        }

        public int compareTo(Node o) {
            return weight - o.weight;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        graph = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph[a].add(new Node(b, c));
            graph[b].add(new Node(a, c));
        }

        dist = new int[N+1];
        visited = new boolean[N+1];
        for (int i = 1; i <= N; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        // 다익스트라 알고리즘 시작
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(1, 0));
        dist[1] = 0;

        while (!pq.isEmpty()) {
            Node curNode = pq.poll();
            int curIndex = curNode.index;

            if (visited[curIndex]) {
                continue;
            }

            visited[curIndex] = true;

            for (Node nextNode : graph[curIndex]) {
                int nextIndex = nextNode.index;
                int nextWeight = nextNode.weight;

                if (!visited[nextIndex] && dist[nextIndex] > dist[curIndex] + nextWeight) {
                    dist[nextIndex] = dist[curIndex] + nextWeight;
                    pq.add(new Node(nextIndex, dist[nextIndex]));
                }
            }
        }

        System.out.println(dist[N]);
    }
}