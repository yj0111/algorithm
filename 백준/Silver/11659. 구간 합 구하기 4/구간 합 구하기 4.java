import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());// 수의 개수
        int M = Integer.parseInt(st.nextToken());// 합을 구해야하는 횟수

        long[] prefix_sum = new long[N+1]; // 누적합 배열 만들기

        st = new StringTokenizer(br.readLine());

        for(int i = 1; i<=N; i++) { //그냥 첫번째는 0으로 처리하기
            prefix_sum[i] = prefix_sum[i-1]+Integer.parseInt(st.nextToken());
        }

        //a번째에서 b번째까지의 합이니까 누적합 배열에서 b 번째 - (a-1)번쨰
        for(int j = 0; j<M; j++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(prefix_sum[b]-prefix_sum[a-1]);
        }
    }
}