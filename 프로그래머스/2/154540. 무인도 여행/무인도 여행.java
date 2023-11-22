import java.io.*;
import java.util.*;

class Solution {
    static int r;
    static int c;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static PriorityQueue<Integer> pq;
    
    public int[] solution(String[] maps) {
        r = maps.length;           
        c = maps[0].length();       
        map = new char[r][c];  
        visited = new boolean[r][c];
        
        for(int i = 0; i < r; i ++) {
            for(int j = 0; j < c; j ++) {
                map[i][j] = maps[i].charAt(j);
            }
        }

        //bfs
        bfs(0,0);

        int cnt = pq.size();
        int[] answer = new int[cnt];
        
        if(cnt == 0)return new int[] {-1};
        
        for(int i = 0; i < cnt; i ++) {
            answer[i] = pq.poll();
        }

        return answer;
    }
    
    //----------------------------------------------------------------------
    public static void bfs(int x, int y){
        pq = new PriorityQueue<>(); // 오름차순 저장할라고
        Queue<int[]> q = new LinkedList<>();    
        for(int i = 0; i < r; i ++) {
            for(int j = 0; j < c; j ++) {
                if(visited[i][j] || map[i][j] == 'X'){
                  continue;  
                }
                q.offer(new int[] {i, j}); 
                visited[i][j] = true; 
                int sum = map[i][j] - '0';

                while(!q.isEmpty()) {
                    int day = q.size();
                    for(int t = 0; t < day; t ++) {
                        int[] temp = q.poll();
                        for(int d = 0; d < 4; d ++) {
                            int nx = temp[0] + dx[d];
                            int ny = temp[1] + dy[d];
                            if(nx < 0 || nx >= r || ny < 0 || ny >= c || visited[nx][ny]) continue;
                            //바다
                            if(map[nx][ny] == 'X') continue;
                            //섬
                            sum += map[nx][ny] - '0';
                            q.offer(new int[] {nx, ny});
                            visited[nx][ny] = true;
                        }
                    }
                }
                pq.offer(sum);
            }
        }
    }
}