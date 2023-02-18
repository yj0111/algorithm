import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//종이
		int[][] paper = new int[101][101];

		//색종이 개수
		int T = sc.nextInt();

		
		for(int i=0; i<T; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++)
					paper[j][k] = 1;
			}
		}
		
		//둘레길 세기 
		int count = 0;
		
		int dx[] = {-1,1,0,0};
		int dy[] = {0,0,1,-1};
		
		for(int i=1; i<=100; i++) {
			for(int j=1; j<=100; j++) {
				if(paper[i][j] == 1) {
					for(int k=0; k<4; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						
						if(nx>=1&&nx<=100&&ny>=1&&ny<=100 && paper[nx][ny] == 0)
							count++;
						else if(nx<1 || nx>100 || ny<1 || ny>100)
							count++;
					}
				}
			}
		}
		
		System.out.println(count);
	}

}