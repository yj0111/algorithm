import java.util.*;

public class Main {
    
    static int r;
    static int c;
    static int[][] map;
    static boolean[][] visited;
    static int cheese;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        r = sc.nextInt(); // 세로
        c = sc.nextInt(); // 가로
        map = new int[r][c];
        
        cheese = 0;
        
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                map[i][j] = sc.nextInt();
                if(map[i][j] == 1) { // 전체 치즈 개수 구하기
                    cheese++;
                }
            }
        }
        
        int cnt = 0; // 모두 녹기 한 시간 전 치즈가 있는 칸
        int time = 0; // 모두 녹는 시간

        while(cheese != 0) { // 모두 녹지 않았을 때만 
            cnt = cheese;
            time++;
            visited = new boolean[r][c];
            bfs();
        }
        // 출력
        System.out.println(time);
        System.out.println(cnt);
        
    }
    
    public static void bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {0, 0});
        visited[0][0] = true;
        
        while(!q.isEmpty()) {
            int[] curr = q.poll();
            
            for(int i = 0; i < 4; i++) { 
                // 상하좌우로 탐색
                int nx = curr[0] + dx[i];
                int ny = curr[1] + dy[i];
                
                // 범위 안, 방문하지 않았을 때
                if(nx >= 0 && ny >= 0 && nx < r && ny < c && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    if(map[nx][ny] == 0) {
                        q.offer(new int[] {nx, ny}); // 빈 공간이면 큐에 추가하여 탐색 계속 진행
                    } else { // 1이면 치즈니까 0으로 바꿔주고 치즈 개수 줄이기
                        cheese--;
                        map[nx][ny] = 0;
                    }
                }
            }
        }
    }
}