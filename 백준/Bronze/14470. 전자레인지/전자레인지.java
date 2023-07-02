import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); 
		int B = sc.nextInt(); 
		int C = sc.nextInt(); 
		int D = sc.nextInt(); 
		int E = sc.nextInt(); 

		int sec = 0;

		if (A < 0) {
			sec = (A * C * -1) + (B * E) + D;
		} else {
			sec = (B - A) * E;
		}
		System.out.println(sec);
	}
}