import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] tree = new int[N];
		for (int i = 0; i < N; i++) {
			tree[i] = sc.nextInt();
		}

		Arrays.sort(tree);

		int max = tree[N - 1];
		int mid = 0;
		int min = 0;

		while (min < max) {
			mid = (max + min) / 2;

			long sum = 0;

			for (int i = 0; i < tree.length; i++) {
				if (tree[i] > mid) {
					sum += (tree[i] - mid);
				}
			}

			if (sum < M) {
				max = mid;
			} else {
				min = mid + 1;
			}
		}
		System.out.println(max - 1);
	}
}