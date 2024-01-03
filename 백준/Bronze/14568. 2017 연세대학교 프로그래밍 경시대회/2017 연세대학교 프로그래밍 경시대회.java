import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = 0;

		for (int z = 1; z < N - 2; z++) { //남규
			for (int y = 1; y <= N - 1; y++) { //영훈
					for (int x = 1; x <= N; x++) { //택희
					if (x + y + z == N && z >= y + 2 && x % 2 == 0) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}

}