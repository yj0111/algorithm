import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0 ; i<T; i++) {
			int R = sc.nextInt();
			String S = sc.next();
			
			for(int l = 0; l <S.length(); l++) {
				for(int p = 0; p<R; p++) {
					System.out.print(S.charAt(l));					
				}
			}
			System.out.println();
		}
	}
}