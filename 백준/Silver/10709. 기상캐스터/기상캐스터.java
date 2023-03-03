import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 행
		int H = sc.nextInt();
		// 열
		int W = sc.nextInt();

		int cnt = 0;
		for (int i = 0; i < H; i++) {
			String sky = sc.next();
			for (int j = 0; j < W; j++) {
				if (sky.charAt(j) == '.' && cnt == 0) {
					System.out.print(-1 + " ");
				} else if (sky.charAt(j) == 'c') {
					System.out.print(0 + " ");
					cnt = 1;
				} else if (sky.charAt(j) == '.' && cnt != 0) {
					System.out.print(cnt + " ");
					cnt++;
				}
			}
			System.out.println();
			cnt = 0;
		}
	}
}