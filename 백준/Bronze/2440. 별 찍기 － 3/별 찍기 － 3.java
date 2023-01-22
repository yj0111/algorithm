import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
	
		
		for(int j = 1; j<=N; j++) {
			for(int i = N-j; i>=0; i--) {
				System.out.print("*");			
			}System.out.println();
			
		}
	}

}