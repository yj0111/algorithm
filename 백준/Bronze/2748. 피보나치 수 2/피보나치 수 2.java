import java.io.IOException;
import java.util.Scanner;

public class Main {
	//60넘으면 int타입 넘어가서 오류남 -> long타입으로 써줘야함
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] fibo1 = new long[N+1];
		fibo1[0] = 0;
		fibo1[1] = 1;
		for (int k = 2; k <= N; k++) {
			fibo1[k] = fibo1[k - 1] + fibo1[k - 2];
		}
		System.out.println(fibo1[N]);
	}
}