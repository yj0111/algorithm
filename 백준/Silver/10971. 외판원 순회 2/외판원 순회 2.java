import java.util.Scanner;

public class Main {
    static int N;
    static int[][] map;
    static boolean[] visited;
    static int result = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        visited = new boolean[N];

        //입력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        //그냥 내맘대로 첫번째로 시작도시 고정
        visited[0] = true; 
        
        //출발지, 비용, 몇개 방문했는지
        dfs(0, 0, 1); 

        //출력
        System.out.println(result);

    }

    static void dfs(int start, int money, int cnt) {
    	//N개 다돌았으면 끝내기
    	if (cnt == N) {
            if (map[start][0] != 0) { //돌아갈수있으면
            	if(result > money+map[start][0]) {
            		result = money+map[start][0];
            	}
            }
            return;
        }

        for (int i = 1; i < N; i++) {
            if (!visited[i] && map[start][i] != 0) {
                visited[i] = true;
                dfs(i, money + map[start][i], cnt + 1);
                visited[i] = false;
            }
        }
    }
}