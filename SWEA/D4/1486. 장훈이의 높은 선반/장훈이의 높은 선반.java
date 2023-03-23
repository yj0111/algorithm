import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			// 몇명 ?
			int N = sc.nextInt();
			
			int[] list = new int[N];
			// 선반높이
			int B = sc.nextInt();
			
			//키 입력
			for (int i = 0; i < N; i++) {
				list[i] = sc.nextInt();
			}
			
			//최소값
			int min = Integer.MAX_VALUE;
			
			for (int i = 0; i < (1 << N); i++) {
				int sum = 0;
				for (int j = 0; j < N; j++) {
					if ((i & (1 << j)) > 0) {
						sum += list[j];
					}
				}
				
				if(sum >= B) {
					if(min >= sum) {
						min = sum;
					}
				}
			}
			System.out.println("#"+tc+" "+(min-B));
		}
	}

}