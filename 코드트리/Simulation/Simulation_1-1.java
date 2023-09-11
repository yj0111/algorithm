import java.io.*;
import java.util.*;
//8:10 ~ 8:20
//최고의 33위치
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 입력
        int n = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][n];
       
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 정답
        int max = 0;

        // 3 x 3 크기 격자를 이동하면서 최대 동전 수를 찾음
        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= n - 3; j++) {
                int cnt = 0;
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        cnt += map[x][y];
                    }
                }
                max = Math.max(max, cnt);
            }
        }
        
        System.out.println(max);
    }
}
