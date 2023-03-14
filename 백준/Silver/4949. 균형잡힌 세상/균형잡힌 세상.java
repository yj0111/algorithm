import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String text = sc.nextLine();
		// .을 만나면 종료한다
		while (!text.equals(".")) {

			Stack<Character> stack = new Stack<>();
			for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) == '(' || text.charAt(i) == '[') {
					stack.push(text.charAt(i));
				} else {
					if (text.charAt(i) == ')') {
						if (!stack.isEmpty() && stack.peek() == '(')
							stack.pop();
						else
							stack.push(text.charAt(i));
					} else if (text.charAt(i) == ']') {
						if (!stack.isEmpty() && stack.peek() == '[')
							stack.pop();
						else
							stack.push(text.charAt(i));
					}

				}
			}
			if (stack.isEmpty())
				System.out.println("yes");
			else
				System.out.println("no");
			text = sc.nextLine();
		}

	}
}