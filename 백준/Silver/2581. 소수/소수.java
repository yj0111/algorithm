import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int sum = 0;
		int min = N;

		for(int j =M; j<=N; j++) {
			for(int i = 2; i<=j; i++ ) {
				if(j % i == 0) {
					if(j > i) {
						break;
					}else if(j == i) {
						sum += j;
						if(min >j) {
							min = j;
						}
					}
				}
			}			
		}
		
		//출력 부분 
		//소수 합이 0이면..
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);			
		}
	}
}