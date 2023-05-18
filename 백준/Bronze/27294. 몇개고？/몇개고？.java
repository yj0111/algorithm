import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int S = sc.nextInt();

		if (S == 1 || T <= 11 || T > 16) {
			System.out.println("280");
		} else if (T >= 12 && T <= 16 && S == 0) {
			System.out.println("320");
		}
	}
}