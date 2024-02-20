import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] time = new int[N + 2]; // 날짜별 시간
        int[] pay = new int[N + 2]; // 금액

        for (int i = 1; i <= N; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
            time[i] = Integer.parseInt(st.nextToken());
            pay[i] = Integer.parseInt(st.nextToken());
        }

        // i + 1일에 돈 받음
        int[] dp = new int[N + 2];
        int max = 0; // i 일 까지의 최고 수익
        for (int i = 1; i <= N + 1; i++) {
            // i일 까지의 수익(dp[i])이 최대일 때 max값 갱신
            if (max < dp[i]) {
                max = dp[i];
            }
            // i 일에 상담하면 끝나는 날짜
            int day = i + time[i];
            // 퇴사 전까지 상담을 끝낼 수 있으면
            if (day <= N + 1) {
                dp[day] = Math.max(dp[day], max + pay[i]); //현재 날짜까지의 최대 금액 + 현재 상담 금액 or 현재 날짜에 기록된 금액  
            }
        }

        System.out.println(max);
    }

}