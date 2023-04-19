import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int[] dp = new int[n];
		for (int i = 0; i < n; i++) {
			dp[i] = 1;
		}
		
		int max[] = new int[n];
		for (int i = 0; i < n; i++) {
			max[i] = arr[i];
		}

		
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if(arr[j] < arr[i]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
					max[i] = Math.max(max[i], max[j]+arr[i]);
				}
			}
		}
		Arrays.sort(max);
		//System.out.println(Arrays.toString(max));
		System.out.println(max[n-1]);
	}
}