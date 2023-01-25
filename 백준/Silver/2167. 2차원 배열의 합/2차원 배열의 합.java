import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] list = new int[N+1][M+1];
		
		//배열에 저장
		for(int j =1; j<=N; j++) {
			for(int k = 1; k<=M; k++) {
				list[j][k] = sc.nextInt();
			}
		}
		
		//합
		int sum = 0;
		
		//몇번 반복?
		int K = sc.nextInt();
		
		
		//K번 반복
		for(int r = 0; r<K; r++) {
			// i j x y
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			sum = 0;
			
			for(int j = a; j<=c; j++) {
				for(int k = b; k<=d; k++) {
					sum += list[j][k];
				}
			}
			System.out.println(sum);
		}
	}

}