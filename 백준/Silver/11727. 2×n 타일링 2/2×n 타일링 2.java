import java.util.Scanner;

public class Main {
	static int[] d = new int[1001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println(dp(n));
	}

	private static int dp(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 3;
		} else if (d[n] != 0) {
			return d[n];
		} else {
			d[n] = (dp(n - 1) + 2 * dp(n - 2)) % 10007;
		}
		return d[n];
	}
}