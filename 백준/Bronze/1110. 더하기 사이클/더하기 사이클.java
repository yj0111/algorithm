import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int newNum = N;
		int count = 0;
		
		
		while(true) {

			//십의자리
			int A = newNum / 10;
			//일의자리
			int B = newNum % 10;
			
			newNum = B * 10 + (A + B) % 10;
			count++;
			if(N == newNum) {
				break;
			}
		}
		
		System.out.println(count);
	}

}