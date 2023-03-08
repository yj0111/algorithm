import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();

		int N = sc.nextInt();
		int[] list = new int[N];

		for (int i = 0; i < N; i++) {
			list[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			while (!stack.isEmpty() && list[stack.peek()] < list[i]) {
				list[stack.pop()] = list[i];
			}

			stack.push(i);
		}

		while (!stack.isEmpty()) {
			list[stack.pop()] = -1;
		}

		for (int i = 0; i < N; i++) {
			sb.append(list[i]).append(" ");
		}

		System.out.println(sb);
	}
}