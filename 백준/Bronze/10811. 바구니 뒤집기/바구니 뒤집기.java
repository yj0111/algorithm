import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int[] list = new int[M];

		for (int i = 0; i < list.length; i++) {
			list[i] = i + 1;
		}

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int order1 = sc.nextInt() - 1;
			int order2 = sc.nextInt() - 1;

			while (order1 < order2) {
				int temp = list[order1];
				list[order1++] = list[order2];
				list[order2--] = temp;
			}

		}
		String text = "";
		for (int j = 0; j < list.length; j++) {
			text += list[j] + " ";
		}
		System.out.print(text.trim());
		sc.close();
	}
}