import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트 케이스 T
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			//N x N 파리
			int N = sc.nextInt();
			int[][] list = new int[N][N];
			
			//스프레이 세기 M
			int M = sc.nextInt();
			
			//파리 넣기
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<N; j++) {
					list[i][j] = sc.nextInt();
				}
			}
			
			//최대값
	        int max = 0;
	        int sum1 = 0;
	        int sum2 = 0;
	        
	        for(int r=0;r<N;r++) {
	            for(int c=0;c<N;c++) {
	                   sum1 = list[r][c];
	                   sum2 = list[r][c];
	                   //세기만큼..
	                  for(int a=1;a<M;a++) {
	                    int[] dr1 = { 0 , 0, -a, a };
	                    int[] dc1 = { -a, a, 0 , 0 };
	                    int[] dr2 = { -a, -a , a, a};
	                    int[] dc2 = { a, -a, -a, a};
	                      for(int b=0;b<4;b++) {
	                    	  int nr = r + dr1[b];
	                    	  int nc = c + dc1[b]; 
	                    	  int nr1 = r + dr2[b];
	                    	  int nc1 = c + dc2[b];
	                          if(nr>=0 && nr<N && nc>= 0 && nc<N) {
	                              sum1 += list[nr][nc];
	                          }
	                          if (nr1>=0 && nr1<N && nc1>= 0 && nc1<N) {
	                               sum2 += list[nr1][nc1];
	                          }}
	               }
	                  if(sum1 > max) max = sum1;
	                  if(sum2 > max) max = sum2;

	               }
	            }
	        System.out.println("#"+t+" "+max);
	    }
	 
	}
	}