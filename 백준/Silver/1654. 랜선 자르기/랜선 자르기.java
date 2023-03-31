import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();

		long[] list = new long[K];

		long N = sc.nextInt();

		for (int i = 0; i < K; i++) {
			list[i] = sc.nextInt();
		}

		Arrays.sort(list);

		long max = list[K - 1];
		max++;

		long min = 0;
		long mid = 0;

		while (min < max) {
			mid = (max + min) / 2;
			int count = 0;

			for (int i = 0; i < list.length; i++) {
				count += (list[i] / mid);
			}

			if (count < N) {
				max = mid;
			} else {
				min = mid + 1;
			}

		}

		System.out.println(min - 1);

	}
}