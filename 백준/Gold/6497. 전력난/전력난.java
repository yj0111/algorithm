import java.io.*;
import java.util.*;

public class Main {
    static int V;
    static int E;
    static int[] p;
    static int[][] edges;

    public static void main(String[] args) throws Exception, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            V = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());

            if (V == 0 && E == 0)
                break;

            edges = new int[E][3];
            int sum = 0;
            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                int Z = Integer.parseInt(st.nextToken());
                edges[i][0] = X;
                edges[i][1] = Y;
                edges[i][2] = Z;
                sum += Z;
            }

            Arrays.sort(edges, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[2] - o2[2];
                }
            });

            p = new int[V];
            makeset();

            int result = 0;
            for (int i = 0; i < E; i++) {
                if (union(edges[i][0], edges[i][1])) {
                    result += edges[i][2];
                }
            }

            System.out.println(sum - result);
        }
    }

    static void makeset() {
        for (int i = 0; i < V; i++) {
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