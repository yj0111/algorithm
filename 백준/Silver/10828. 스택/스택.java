import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//시간이 0.5초.. ! 
		StringBuilder sb = new StringBuilder();
		
		//명령의 수 
		int N = sc.nextInt();
		
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i<N; i++) {
			String order = sc.next();
			
			switch (order) {
			case "push":
				int num = sc.nextInt();
				stack.push(num);
				break;
				
			case "top":
				if(stack.isEmpty()) {
					sb.append(-1).append('\n');
				}else {
					sb.append(stack.peek()).append('\n');
				}
				break;
			case "size":
				sb.append(stack.size()).append('\n');
				break;
			case "empty":
				if(stack.isEmpty()) {
					sb.append(1).append('\n');
				}else {
					sb.append(0).append('\n');
				}
				break;	
			case "pop":
				if(stack.isEmpty()) {
					sb.append(-1).append('\n');
				}else {
					sb.append(stack.pop()).append('\n');
				}
				break;	
			default:
				break;
			}
		}
		System.out.println(sb);	
	}
}