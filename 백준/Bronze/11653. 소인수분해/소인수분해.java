import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 2; i <= N; i++) {
			while(true) {
				if (N % i == 0) {
					System.out.println(i);
					N = N / i;
				} else {
					break;
				}
			}
		}

	}

}