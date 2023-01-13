import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		double D_A = (double)A;
		double D_B = (double)B;
		System.out.println(D_A/D_B);
	}
}