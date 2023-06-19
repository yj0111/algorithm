import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 양동이의 개수
        int K = sc.nextInt(); // K만큼 떨어진 양동이까지 가능

        int[] arr = new int[1000001];
        for (int i = 0; i < N; i++) {
            int g = sc.nextInt(); // 양동이의 얼음 양
            int x = sc.nextInt(); // 양동이의 좌표
            arr[x] = g; 
        }

        int max = 0; 
        int sum = 0; // 윈도우의 얼음 양 합계

        for (int i = 0; i < 1000001; i++) {
            // 범위를 벗어나면 , 합 - 양동이 얼음
            if (i > K * 2) {
                sum -= arr[i - (K * 2) - 1];
            }
            
            sum += arr[i];

            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);
    }
}