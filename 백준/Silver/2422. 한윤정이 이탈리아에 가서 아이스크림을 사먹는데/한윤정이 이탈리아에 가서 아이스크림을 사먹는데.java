import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//아이스크림 종류 
		int N = sc.nextInt();
		boolean[][] icecream = new boolean[N+1][N+1];

		//섞어 먹으면 안되는 조합
		int M = sc.nextInt();
		
		for(int i = 0; i<M; i++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			
			icecream[m][n] = true;
			icecream[n][m] = true;
		}
		
		 int result = 0;
	        for (int i = 1; i <= N; i++) {
	            for(int j=i+1; j<=N; j++){
	                if(icecream[i][j]) {
	                	continue; 
	                }
	                for (int k = j + 1; k <= N; k++) {
	                    if(!icecream[j][k] && !icecream[k][i]){ 
	                        result++;
	                    }
	                }
	            }
	        }
	        System.out.println(result);
		
	}
}