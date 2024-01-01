import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int c = (int) Math.sqrt(A * A - B);

		int result_1 = (-1 * A) - c;
		int result_2 = (-1 * A) + c;

		if (result_1 == result_2) {
			System.out.println(result_1);
		} else {
			System.out.println(result_1 + " " + result_2);
		}
	}

}