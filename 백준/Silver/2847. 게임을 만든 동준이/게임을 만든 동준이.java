import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[n];

		for (int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}

		int result = 0; // 점수를 내린 횟수

		for (int i = n - 2; i >= 0; i--) {
			if (list[i] >= list[i + 1]) { // 낮은 레벨 점수 >= 높은 레벨 점수
				// 낮은 레벨 점수 = 높은 레벨 점수 - 1이 되려면 x번 내려야함
				result += list[i] - list[i + 1] + 1;

				list[i] = list[i + 1] - 1; // 낮은 레벨 점수 = 높은 레벨 점수 - 1				
			}
		}
		System.out.println(result);
	}
}