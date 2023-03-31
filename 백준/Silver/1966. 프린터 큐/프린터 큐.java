import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			Queue<int[]> queue = new LinkedList<>();

			// 몇번째로 출력?
			int result = 0;

			for (int i = 0; i < N; i++) {
				queue.add(new int[] { i, sc.nextInt() });
			}

			while (true) {
				int now[] = queue.remove();
				boolean flag = true;

				for (int list[] : queue) {
					if (list[1] > now[1]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					result++;
					if (now[0] == M)
						break;
				} else {
					queue.add(now);
				}
			}
			System.out.println(result);
		}
	}
}