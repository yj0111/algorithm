import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int[][] dpMax = new int[2][3];
        int[][] dpMin = new int[2][3];
        st = new StringTokenizer(br.readLine());

        dpMax[0][0] = dpMin[0][0] = Integer.parseInt(st.nextToken());
        dpMax[0][1] = dpMin[0][1] = Integer.parseInt(st.nextToken());
        dpMax[0][2] = dpMin[0][2] = Integer.parseInt(st.nextToken());

        for (int i = 1; i < N; i++) {
        	st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            //최댓값 구하기
            dpMax[i % 2][0] = Math.max(dpMax[(i - 1) % 2][0], dpMax[(i - 1) % 2][1]) + a;
            dpMax[i % 2][1] = Math.max(dpMax[(i - 1) % 2][0], Math.max(dpMax[(i - 1) % 2][1], dpMax[(i - 1) % 2][2])) + b;
            dpMax[i % 2][2] = Math.max(dpMax[(i - 1) % 2][1], dpMax[(i - 1) % 2][2]) + c;

            //최솟값 구하기
            dpMin[i % 2][0] = Math.min(dpMin[(i - 1) % 2][0], dpMin[(i - 1) % 2][1]) + a;
            dpMin[i % 2][1] = Math.min(dpMin[(i - 1) % 2][0], Math.min(dpMin[(i - 1) % 2][1], dpMin[(i - 1) % 2][2])) + b;
            dpMin[i % 2][2] = Math.min(dpMin[(i - 1) % 2][1], dpMin[(i - 1) % 2][2]) + c;
        }

        int max = Math.max(dpMax[(N - 1) % 2][0], Math.max(dpMax[(N - 1) % 2][1], dpMax[(N - 1) % 2][2]));
        int min = Math.min(dpMin[(N - 1) % 2][0], Math.min(dpMin[(N - 1) % 2][1], dpMin[(N - 1) % 2][2]));

        bw.append(String.valueOf(max+" "+min));
        bw.flush();
    }
}