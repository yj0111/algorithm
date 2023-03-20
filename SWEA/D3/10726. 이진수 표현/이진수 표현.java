import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			// N만큼 1이 채워진거랑 & 연산한 것이 다 1 이면 ON
			int X = (1 << N) - 1;
			if ((M & X) == X)
				System.out.printf("#%d ON\n", tc);
			else
				System.out.printf("#%d OFF\n", tc);
		}
	}
}