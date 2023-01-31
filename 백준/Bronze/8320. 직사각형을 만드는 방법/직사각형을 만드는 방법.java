import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정사각형  1인거 n개 
		int N = sc.nextInt();

		int count = 0;
		
		//가로 X 세로 <= N 개수 !
		
		for(int i = 1; i<= N; i++) {
			for(int j = 1; j<=i; j++) {
				if( i * j <= N ) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}