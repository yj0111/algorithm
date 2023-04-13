import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] dp = new int[11]; //n은 양수이며 11보다 작다.
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int tc = 0; tc < T; tc++) {
            int n = sc.nextInt();
            for (int j = 4; j <= n; j++) {
                dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
            }
            System.out.println(dp[n]);
        }
    }
}