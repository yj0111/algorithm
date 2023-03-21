import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 테스트 케이스
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int[] list = new int[N];
			
			for (int i = 0; i < N; i++) {
				list[i] = sc.nextInt();
			}
			
			//몇애 있는지 카운트
			int count = 0;
			
			for (int i = 0; i < (1 <<N); i++) {
				int sum = 0;
				for (int j = 0; j < N; j++) {
					if ((i & (1 << j)) > 0) {
						sum += list[j];
					}
				}
				if(sum == K) {
					count++;
				}
			}
			System.out.println("#"+tc+" "+count);
		}
	}
}