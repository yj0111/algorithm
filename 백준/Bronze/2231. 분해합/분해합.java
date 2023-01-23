import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		//분해합
		int sum = 0;
		int min = 0;
		for(int i = 0; i<=N; i++) {
			int n = i;
			sum = 0;
			
			//자리수 합 더하기
			while(n != 0) {
				sum += n % 10;
				n = n/10;
			}
		
			if(sum + i == N) {
				min = i;
				break;
			}
		}
		System.out.println(min);
	}
}