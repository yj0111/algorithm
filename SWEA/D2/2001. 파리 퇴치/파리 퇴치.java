import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 T
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			//N x N 배열
			int N = sc.nextInt();
			
			//M x M 파리채
			int M = sc.nextInt();
			
			//파리 개수
			int[][] list = new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					list[i][j] =sc.nextInt();
				}
			}
				
			//최댓값
			int max = 0;
			
			//파리채로 때리기
			for(int i=0; i<=N-M; i++) {
				for(int j=0; j<=N-M; j++) {
					//죽일수 있는 파리
					int sum = 0;
					for(int m = i; m<i+M; m++) {
						for(int n = j; n<j+M; n++) {
							sum += list[m][n]; 		
						}
					}
					if(max < sum) max= sum;
					}
			}
			
			
			System.out.println("#"+t+" "+max);
		}
	}
}