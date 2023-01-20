import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = 0;
		
		
		for(int i = 0; i<N; i++) {
			int M = sc.nextInt();
			
			for(int a = 2; a<=M; a++) {
				if(M % a == 0) {
					if(M>a) { break;
					}else if(M == a) {
						count++;
					}
				}
			}

		}
		System.out.println(count);
	}
}