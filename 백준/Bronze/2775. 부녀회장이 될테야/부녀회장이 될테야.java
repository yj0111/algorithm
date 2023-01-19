import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[][] arr = new int[15][15];
		
		for(int i = 1; i<15; i++) {
			//0층의 i 호에는 i 명이 산다
			//0호 없고 1호부터 있음
			arr[0][i] = i;
			arr[i][1] = 1;
		}

		for(int f = 1; f <15; f++) {//1-14층
			for(int b = 2; b<15; b++ ) { //1-14호
				arr[f][b] = arr[f-1][b] + arr[f][b-1];
			}
		}
		
		
		for(int i =0; i<T; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(arr[k][n]);
		}
		
		
	}

}