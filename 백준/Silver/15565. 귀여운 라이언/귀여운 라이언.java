import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 인형 총 개수
		int K = sc.nextInt(); // 라이언 목표
		int[] dolls = new int[N];
		for (int i = 0; i < N; i++) {
			dolls[i] = sc.nextInt();
		}

		int result = Integer.MAX_VALUE;

		int left = 0;
		int lion_cnt = 0;

		for (int right = 0; right < N; right++) {
			if (dolls[right] == 1) {
				lion_cnt++;
			}

			while (lion_cnt >= K) {
				result = Math.min(result, right - left + 1);
				if (dolls[left] == 1) {
					lion_cnt--;
				}
				left++;
			}
		}

		if (result == Integer.MAX_VALUE) {
			System.out.println("-1");
		} else {
			System.out.println(result);
		}
	}
}