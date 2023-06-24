import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        boolean[] arr = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num % 2 == 0;
        }

        int max = 0;
        int left = 0;
        int right = 0;
        int cnt = 0;
        
        while (right < n) {
            if (cnt < k) {
                if (!arr[right]) {
                    cnt++;
                }
                right++;
                max = Math.max(right - left - cnt, max);
            } else if (arr[right]) {
                right++;
                max = Math.max(right - left - cnt, max);
            } else {
                if (!arr[left]) {
                    cnt--;
                }
                left++;
            }
        }

        System.out.println(max);
    }
}