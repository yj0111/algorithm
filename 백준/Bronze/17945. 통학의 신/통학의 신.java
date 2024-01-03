import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		for (int x = -999; x <= 999; x++) {
			if (x * x + 2 * A * x + B == 0) {
				System.out.print(x + " ");
			}
		}
	}

}