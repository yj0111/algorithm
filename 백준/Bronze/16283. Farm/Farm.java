import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int w = sc.nextInt();

		int sheep = 1;
		int cnt = 0;
		int S = 0;
		int G = 0;
		for (sheep = 1; sheep < n; sheep++) {
			if (sheep * a + (n - sheep) * b == w) {
				cnt++;
				S = sheep;
				G = n - sheep;
			}
		}
		
		if (cnt == 1) {
			System.out.println(S + " " + G);
		} else {
			System.out.println("-1");
		}
	}
}