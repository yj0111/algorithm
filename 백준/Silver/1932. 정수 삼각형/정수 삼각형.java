import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[][] tri = new int[N][];

		for (int i = 0; i < N; i++) {
			tri[i] = new int[i + 1];
			for (int j = 0; j <= i; j++)
				tri[i][j] = sc.nextInt();
		}

		// 밑에서 위로 더하면서 최대값 찾기 !
		for (int i = N - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				tri[i - 1][j] += Math.max(tri[i][j], tri[i][j + 1]);
			}
		}
		// 최대값은 맨 꼭대기층!
		System.out.println(tri[0][0]);
	}
}