import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 T
		int T = sc.nextInt();
		
		for(int i = 0; i<T; i++) {
			//총 5줄로 이루어짐
			
				Stack<Object> stack1 = new Stack<>();
				String str = sc.next();
				for(int k = 0; k<str.length(); k++) {
					stack1.push(str.substring(k, k+1));
				}

				Stack<Object> stack2 = new Stack<>();
				String str2 = sc.next();
				for(int k = 0; k<str2.length(); k++) {
					stack2.push(str2.substring(k, k+1));
				}

				Stack<Object> stack3 = new Stack<>();
				String str3 = sc.next();
				for(int k = 0; k<str3.length(); k++) {
					stack3.push(str3.substring(k, k+1));
				}

				Stack<Object> stack4 = new Stack<>();
				String str4 = sc.next();
				for(int k = 0; k<str4.length(); k++) {
					stack4.push(str4.substring(k, k+1));
				}
				
				Stack<Object> stack5 = new Stack<>();
				String str5 = sc.next();
				for(int k = 0; k<str5.length(); k++) {
					stack5.push(str5.substring(k, k+1));
				}
				
				int max = Math.max(Math.max(Math.max(Math.max(str.length(), str2.length()),str3.length()),str4.length()),str5.length());
				
				StringBuilder sb = new StringBuilder();

				while(!(stack1.isEmpty()&&stack2.isEmpty()&&stack3.isEmpty()&&stack4.isEmpty()&&stack5.isEmpty())){
					if(max == stack5.size()) {
						sb.append(stack5.pop());
					}
					if(max == stack4.size()) {
						sb.append(stack4.pop());
					}
					if(max == stack3.size()) {
						sb.append(stack3.pop());
					}
					if(max == stack2.size()) {
						sb.append(stack2.pop());					
					}
					if(max == stack1.size()) {
						sb.append(stack1.pop());					
					}
					max--;
				}
				System.out.print("#"+(i+1)+ " "+ sb.reverse()+"\n");
				
				
		}
		
		
	}

}

//Stack 안쓰고 다른방법으로 푼 풀이 !

public class 의석이2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트 케이스 T
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			String[] list = new String[5];
			
			for(int i = 0; i < 5; i++) {
				list[i] = sc.next();
			}
			
			int max = 0;
			
			for(int i = 0; i < 5; i++) {
				max = Math.max(max, list[i].length());
			}
			
			System.out.print("#" + t + " ");
			for(int i = 0; i < max; i++) {
				for(int j = 0; j < 5; j++) {
					if(list[j].length() <= i) {
						continue;
					}
					System.out.print(list[j].charAt(i));
				}
			}
			System.out.println();
		}
	}
}

