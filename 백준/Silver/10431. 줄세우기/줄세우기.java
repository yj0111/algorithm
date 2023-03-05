import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 테스트 케이스 수
		int P = sc.nextInt();

		for (int tc = 1; tc <= P; tc++) {
			// 테스트 케이스
			int T = sc.nextInt();

			int[] list = new int[20];

			// 20개 입력
			for (int i = 0; i < 20; i++) {
				list[i] = sc.nextInt();
			}
			
			//뒤로 가는 횟수
			int cnt = 0;
			
			for (int i = 0; i < 20; i++) {
				for (int j = 0; j < i; j++) {
					if (list[j] > list[i]) {
						int temp = list[j];
						list[j] = list[i];
						list[i] = temp;
						cnt++;
					}
				}
			}
			//System.out.println(Arrays.toString(list));
			System.out.println(T + " " + cnt);
		}
	}

}