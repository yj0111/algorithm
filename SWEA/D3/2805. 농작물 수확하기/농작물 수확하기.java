import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//테스트 케이스
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			//합
			int sum = 0;
			
			//농장의 크기
			int N = sc.nextInt();
			int[][] farm = new int[N][N];
			
			for(int i =0; i < N; i++) {
            	String str = sc.next();
            	for(int j = 0; j < N; j++) {
            		farm[i][j] = str.charAt(j)-'0'; 
            	}
            }

			
			//위에 삼각형
			for(int i = 0; i<N/2; i++) {
				for(int j = N/2-i; j<=(N/2+i) ; j++) {
					sum += farm[i][j];
				}
			}
			
			//밑에 삼각형
			for(int i=N/2; i>=0; i--){
				for(int j = N/2-i; j<=N/2+i ; j++) {
					sum += farm[N-i-1][j];
				}
			}
			
			System.out.println("#"+t+ " "+sum);
		
		}
	}

}