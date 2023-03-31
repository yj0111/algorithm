import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문자의 길이
		int L = sc.nextInt();
		//입력받는 문자 
		String text = sc.next();
		
		//거듭제곱 곱한거의 합
		int sum = 0;
		
		//Math.pow(a,b) 가 a의 b 거듭 제곱이래
		for (int i = 0; i < L; i++) {
			int a = text.charAt(i)-'a'+1;
			double result = Math.pow(31, i);
			sum += a * result;
		}
		
		int M = 1234567891;
		System.out.println(sum%M);
		
	}
}