import java.util.Scanner;

public class Main {
    //DP문제 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //직사각형을 채우는 방법의 수
        int[] cnt = new int[n + 1];

        cnt[1] = 1;
        if (n >= 2) {
            cnt[2] = 2;
        }

        for (int i = 3; i <= n; i++) {
            cnt[i] = (cnt[i - 1] + cnt[i - 2]) % 10007;
        }

        System.out.println(cnt[n]);
    }
}