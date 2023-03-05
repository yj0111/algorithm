import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc<=T; tc++) {
			int N = sc.nextInt();
			
			int[][] list = new int[N][N];
			
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<N; j++) {
					list[i][j] = sc.nextInt();
				}
			}
			System.out.println("#"+tc);
			for(int j = 0; j<N; j++) {
				//90도 돌리기 
				for(int i = N-1; i>=0; i--) {
					System.out.print(list[i][j]);
				}
				System.out.print(" ");
				//180도 돌리기 
				for(int i = N-1; i>=0; i--) {
					System.out.print(list[N-(j+1)][i]);
				}
				//270도 돌리기
				System.out.print(" ");
				for(int i = 0; i<N; i++) {
					System.out.print(list[i][N-(j+1)]);
				}
				
				System.out.println();
			}
			
			
			
			
		}
		
	}

}