import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] ball = new int[N];

		int M = sc.nextInt();

		for (int i = 0; i < M; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int ballnum = sc.nextInt();
			for (int j = start - 1; j < end; j++) {
				ball[j] = ballnum;
			}
		}
		for (int i = 0; i < ball.length; i++) {
			System.out.print(ball[i] + " ");
		}
	}

}