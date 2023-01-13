import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int q = sc.nextInt();
		int l = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int p = sc.nextInt();
		
		System.out.print(1 - k + " ");
		System.out.print(1 - q + " ");
		System.out.print(2 - l + " ");
		System.out.print(2 - b + " ");
		System.out.print(2 - n + " ");
		System.out.print(8 - p);
	}
}