import java.util.Scanner;
import java.util.Stack;

public class Main {
	//수업ppt 에 있는 내용
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i<T; i++) {
		
		//글자 입력
		String str = sc.next();
		//true or false
		boolean flag = true;
		
		Stack<String> stack = new Stack<>();
		
		for(int j = 0; j<str.length(); j++) {
			//왼쪽 괄호면 넣고
			if(str.substring(j, j+1).equals("(")){
				stack.push(str.substring(j, j+1));
			}else {
				//오른쪽괄호
				//비어있으면 false
				if(stack.isEmpty()) {
					flag = false;
					break;
				}
				
				//맨위값 꺼내 
				String top = stack.peek();
				//꺼낸 값이 (이면 () 세트니까 지워버려
				if(top.equals("(") && str.substring(j, j+1).equals(")")){
					stack.pop();
				}else {
					flag = false;
					break;
				}
			}
		}
			
		if(stack.isEmpty() && flag == true) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
		
	}	
		
}