import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int count = 0;
		
		int[][] arr = new int[100][100];
		
		for(int i = 0; i<T; i++) {
			int r = sc.nextInt();
			int c = sc.nextInt();
				for(int k = r; k<r+10; k++) {
					for(int j = c; j<c+10; j++) {
						arr[k][j] = 1;
					}
				}
		}
		
		for(int a = 0 ; a<100; a++) {
			for(int b =0; b<100; b++) {
				if(arr[a][b] == 1) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}