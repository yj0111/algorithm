import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
 
		System.out.println(fibo(N));
 
	}
 
	// 피보나치 함수
	static int fibo(int N) {		
		if (N == 0)	return 0;
		if (N == 1)	return 1;
		return fibo(N - 1) + fibo(N - 2);
	}
}