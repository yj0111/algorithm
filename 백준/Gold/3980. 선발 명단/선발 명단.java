import java.util.Scanner;

public class Main {
    static int[][] player; 
    static boolean[] visited;
    static int max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //테스트 케이스 입력
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            player = new int[11][11];
            visited = new boolean[11];
            max = 0; //능력치 최대값

            //입력받기
            for (int r = 0; r < 11; r++) {
                for (int c = 0; c < 11; c++) {
                    player[r][c] = sc.nextInt();
                }
            }
            
            // 깊이0,점수 0 에서 dfs 시작하기
            dfs(0, 0); 

            System.out.println(max);
        }
    }

    static void dfs(int depth, int score) {
        if (depth == 11) { //깊이가 11이면 끝이니까 
            max = Math.max(max, score); 
            return;
        }

        for (int i = 0; i < 11; i++) {
            if (!visited[i] && player[depth][i] > 0) { 
            	// 선수 아직 선택 안하고, 능력이 0이 아니면 선택하기
                visited[i] = true;
                dfs(depth + 1, score + player[depth][i]);
                // 깊이+1 하고, 점수는 더해주기
                visited[i] = false;
            }
        }
    }
}