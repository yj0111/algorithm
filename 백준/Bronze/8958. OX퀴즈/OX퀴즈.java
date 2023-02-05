import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		String text = null;
		int score = 0;
		
		for(int i=0; i<N; i++) {
			int count = 0;
			score = 0;
			text = sc.next();
			for(int j=0; j<text.length(); j++) {
				if(text.charAt(j)=='O') {
					count++;
					score += count;
				} else if (text.charAt(j)=='X') {
					count = 0;
				}
			}
			System.out.println(score);
		}
	}
}