import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a_card = new int[10];
		int[] b_card = new int[10];

		for (int i = 0; i < 10; i++) {
			a_card[i] = sc.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			b_card[i] = sc.nextInt();
		}

		int a_sum = 0;
		int b_sum = 0;
		boolean a_win = false;
		boolean b_win = false;
		for (int i = 0; i < 10; i++) {
			if (a_card[i] > b_card[i]) {
				a_sum += 3;
				b_win = false;
				a_win = true;
			} else if (a_card[i] == b_card[i]) {
				a_sum += 1;
				b_sum += 1;
			} else {
				b_sum += 3;
				a_win = false;
				b_win = true;
			}
		}

		System.out.println(a_sum + " " + b_sum);
		if (a_sum > b_sum) {
			System.out.println("A");
		} else if (a_sum == b_sum) {
			if (a_win) {
				System.out.println("A");
			} else if (b_win) {
				System.out.println("B");
			} else {
				System.out.println("D");
			}
		} else {
			System.out.println("B");
		}
	}
}