import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	//BufferedWriter 출력 초과
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();

		int n = Integer.parseInt(st.nextToken());
		//헷갈리니까 1부터 넣기
		int list[] = new int[n+1];
		

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		int num = 1;
		boolean check = true;
		
		for (int i = 1; i <= n; i++) {
			if (list[i] >= num) {
				while (list[i] >= num) {
					stack.add(num++);
					sb.append("+\n");
				}
			}
			if (stack.peek() != list[i]) {
				check = false;
				break;
			}
			stack.pop();
			sb.append("-\n");
		}
		
		if(check == true) {
			System.out.println(sb);
		}else {
			System.out.println("NO");
		}
	}
}