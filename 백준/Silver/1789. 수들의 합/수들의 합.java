import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long sum = 0;
		int count = 0;
		int i = 1;

		while (true) {
			if (sum > num) {
				break;
			} else {
				sum += i;
				count++;
				i++;
			}
		}
		System.out.println(count - 1);
	}

}