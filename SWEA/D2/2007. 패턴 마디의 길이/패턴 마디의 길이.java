import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트 케이스 T
		int T = sc.nextInt();
		
		for(int i = 1; i<=T; i++) {
			//문자열 최대 길이 30 
			String text = sc.next();
			
			for(int j = 1; j<=10; j++) {
				//반복되는 문자열 
				String x = text.substring(0, j);
				String y = text.substring(j, j+j);
				if(x.equals(y)) {
					System.out.println("#"+i+" "+ x.length());
					break;
				}
			}
		}
	}
}