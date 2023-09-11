import java.io.*;
import java.util.*;
//8:25 ~ 8:45
//행복한 수열의 개수
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int happyCnt = 0;

        // 가로 확인
        for (int i = 0; i < n; i++) {
            int cnt = 1; //연속하는 숫자
            int max = 1; 
            for (int j = 1; j < n; j++) {
                if (map[i][j - 1] == map[i][j])
                    cnt++;
                else
                    cnt = 1;

                max = Math.max(max, cnt);
            }

            if (max >= m)
                happyCnt++;
        }

        // 세로 확인  
        for (int j = 0; j < n; j++) {
            int cnt = 1;
            int max = 1;
            for (int i = 1; i < n; i++) {
                if (map[i - 1][j] == map[i][j])
                    cnt++;
                else
                    cnt = 1;

                max = Math.max(max, cnt);
            }

            if (max >= m)
                happyCnt++;
        }

        System.out.print(happyCnt);
    }
}
