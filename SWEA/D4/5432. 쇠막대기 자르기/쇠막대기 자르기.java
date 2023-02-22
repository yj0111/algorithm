import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스
		int T = sc.nextInt();
		Stack<Character> stack = new Stack<>();
		
		for(int i = 1; i<=T; i++) {
			String text = sc.next();
			
			//총 막대기 수 
			int count = 0;
			
			//레이저를 X로 바꿔주기
			text = text.replace("()", "X");
			
			for(int j = 0; j<text.length(); j++) {
				char c = text.charAt(j);
				
			//레이저
			if(c == 'X') {
			//스택에 있는만큼 더하기
				count+= stack.size();
			//닫는 괄호를 발견하면 스택에 ( 넣어둔거 빼면서 count+ 해주기
			}else if(c == ')') {
				count++;
				stack.pop();
			// 여는 괄호만 있으면 스택에 넣기
			}else {
				stack.push(c);
			}
		}
			System.out.println("#"+i+" "+count);
		}
		
	}
}