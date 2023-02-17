import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 1; t<=T; t++) {
				
			StringBuilder sb = new StringBuilder();
			String text1 = sc.next();
			sb.append(text1);
			
			String sb1 = sb.reverse().toString();
			
			if(text1.equals(sb1)) {
				System.out.println("#"+t+" "+1);
			}else {
				System.out.println("#"+t+" "+0);
			}
		}
	}
}