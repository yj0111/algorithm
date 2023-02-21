import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 10개
		for(int i = 0; i<10; i++) {
			
			//부호만
			Stack<String> stack1 = new Stack<>();
			//숫자만
			Stack<Integer> stack2 = new Stack<>();
			
			
			//문자열 계산식의 길이 
			int t = sc.nextInt();
			
			String text = sc.next();
			
			for(int j = 0; j<t; j++) {
				if(text.substring(j, j+1).equals("+")) {
					stack1.push(text.substring(j, j+1));
				}else {
					stack2.push(Integer.parseInt(text.substring(j, j+1)));
				}
				
			}
			
//			System.out.println(stack1);
//			System.out.println(stack2);
			//연산하기 
			int sum = stack2.pop();
			while(true){
				if(stack1.isEmpty() && stack2.isEmpty())break;
				if(stack1.pop().equals("+")) {
					sum += stack2.pop();
//					System.out.println(stack2);
				}
			}
			System.out.println("#"+(i+1)+ " " +sum);
			
		}
		
	}

}