import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text = sc.next();
		
		//N글자
		int N = text.length();
		int r = 0;
		int c = 0;
		int maxr = 0;
		for(c = 1; c<N; c++) {
			if(N % c == 0) {
				r = N/c;
				if(maxr < r && r <=c) {
					maxr = r;
				}
			}
		}
		
		//R이 최대일때 :maxr  
		if(maxr == 0) {
			maxr = 1;
		}
		c = N/maxr;
		
		//행이 r 열이 c
		String[][] list = new String[maxr][c];
		
		int t = 0;
		//메세지를 행렬에 넣기 
		for(int j =0; j<c; j++) {
			for(int i =0; i<maxr; i++) {
				if(t != N) {
					list[i][j] = text.substring(t, t+1);
					t++;
				}
			}
		}

		for(int i =0; i<maxr; i++) {
		for(int j =0; j<c; j++) {
				System.out.print(list[i][j]);
			}
		}
		
	}
}