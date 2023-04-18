import java.util.Scanner;

public class Main {
	static int[] T;
	static int[] P;
	static int N;
	static int ans = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			N = sc.nextInt();
			T = new int[N];
			P = new int[N];
			for (int i = 0; i < N; i++) {
				T[i] = sc.nextInt();
				P[i] = sc.nextInt();
			}
			dfs(0, 0);
			System.out.println(ans);
	}

	public static void dfs(int day, int sum) {
		if (day == N) {
			ans = Math.max(ans, sum); 
			return;
		}

		if (day + T[day] <= N) { // 저 날에 일을 할 수 있는 경우
			// 일을 하고 다음 날로 이동
			dfs(day + T[day], sum + P[day]); 
		}
		dfs(day + 1, sum); // 다음 날로 이동
	}
}