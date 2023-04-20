import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] list;
    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        list = new int[N];
        result = new int[M];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st1.nextToken());
        }
        Arrays.sort(list);
        check(0, 0);
    }

    public static void check(int at, int idx) {
        if (idx == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        int last = -1; // 마지막에 선택한 수 초기화
        for (int i = at; i < N; i++) {
            if (last != list[i]) { // 중복된 수를 선택하지 않도록 함
                result[idx] = list[i];
                last = list[i];
                check(i, idx + 1);
            }
        }
    }
}