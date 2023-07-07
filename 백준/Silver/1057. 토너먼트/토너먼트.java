import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int jimin = sc.nextInt();
		int hansu = sc.nextInt();
		int cnt = 0;

		while (jimin != hansu) {
			jimin = (jimin / 2) + (jimin % 2);
			hansu = (hansu / 2) + (hansu % 2);
			cnt++;
		}
		System.out.println(cnt);

	}
}