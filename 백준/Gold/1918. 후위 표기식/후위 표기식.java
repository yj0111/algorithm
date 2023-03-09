import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String text = br.readLine();

		Stack<Character> stack = new Stack<Character>();
		
		char[] array = text.toCharArray();

		for (int i = 0; i < array.length; i++) {
			if ((int) array[i] >= 65 && (int) array[i] <= 90) {
				bw.append(array[i]);
			} else if (array[i] == '(') {
				stack.push(array[i]);
			} else if (array[i] == ')') {
				if (!stack.empty()) {
					while (stack.peek() != '(') {
						bw.append(stack.pop());
					}
					stack.pop();
				}
			} else if (array[i] == '*' || array[i] == '/') {
				while (!stack.empty() && (stack.peek() == '*' || stack.peek() == '/')) {
					bw.append(stack.pop());
				}
				stack.push(array[i]);
			} else if (array[i] == '+' || array[i] == '-') {
				while (!stack.empty()
						&& (stack.peek() == '*' || stack.peek() == '/' || stack.peek() == '+' || stack.peek() == '-')) {
					bw.append(stack.pop());
				}
				stack.push(array[i]);
			}
		}

		while (!stack.empty()) {
			bw.append(stack.pop());
		}

		bw.flush();
	}
}