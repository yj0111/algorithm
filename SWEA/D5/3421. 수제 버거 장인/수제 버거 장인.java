import java.io.*;
import java.util.*;

public class Solution {
    static int N, M, cnt;
    static Set<Integer> burger = new HashSet<>();
    static int[][] no;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            no = new int[M][2];
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                no[i][0] = Integer.parseInt(st.nextToken());
                no[i][1] = Integer.parseInt(st.nextToken());
            }

            cnt = 0;
            backtrack(1);
            bw.write("#" + tc + " " + cnt + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    static void backtrack(int idx) {
        if (idx > N) {
            cnt++;
            return;
        }

        // 해당 재료를 선택한 경우
        burger.add(idx);
        if (check()) {
            backtrack(idx+1);
        }
        burger.remove(idx);

        // 해당 재료를 선택하지 않은 경우
        backtrack(idx+1);
    }

    static boolean check() {
        for (int i = 0; i < M; i++) {
            if (burger.contains(no[i][0]) && burger.contains(no[i][1])) {
                return false;
            }
        }
        return true;
    }
}