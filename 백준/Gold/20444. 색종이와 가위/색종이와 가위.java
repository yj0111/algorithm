import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// n,k 범위가 (1 ≤ n ≤ 2^23-1, 1 ≤ k ≤ 2^63-1)..;;
		long n = sc.nextInt();
		long k = sc.nextLong();

		long left = 0; // n번의 가위질
		long right = n / 2; // k개의 색종이 조각

		while (left <= right) {
			long row = (left + right) / 2;
			long col = n - row;

			long count = (row + 1) * (col + 1);

			if (count == k) {
				System.out.println("YES");
				return;
			} else if (count > k) {
				right = row - 1;
			} else if (count < k) {
				left = row + 1;
			}
		}
		System.out.println("NO");
	}
}