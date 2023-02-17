import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//총 10개
		for(int i = 0; i<10; i++) {
			//케이스 번호
			int t = sc.nextInt();
			
			//찾는 문자
			String find = sc.next();
			int m = find.length();
			
			//긴 문자
			String text = sc.next();
			int n = text.length();
			
			int count = 0;
			for(int a = 0; a<n-m+1; a++) {
				String check = text.substring(a, a+m);
					if(check.equals(find)) {
						count++;
					}
				}
				System.out.println("#"+t+ " " +count);
			}
			
			}
	}