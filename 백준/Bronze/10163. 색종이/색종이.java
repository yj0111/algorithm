import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//x 100~ y 100
		int[][] list = new int[101][101];
		
		int N = sc.nextInt();
		
		//N번
		int paper = 0;
		for(int i = 1; i<=N; i++) {
			int x1 = sc.nextInt(); 
			int y1 = sc.nextInt();
			
			int x2 = x1 + sc.nextInt();
			int y2 = y1 + sc.nextInt();
			
			// 1번 색종이에는 1 넣기 ! 
			for(int j = x1; j <x2; j++) {
				for(int k = y1; k<y2; k++) {
						list[k][j] = i;
				}
			}
			
		}
		//int count =0 ;을 밖에 썼더니 초기화X 합 누적돼서 틀림 ㅠ ㅠ
		for(int n=1; n<=N; n++) {
			int count = 0;
			for(int i=0; i<101; i++) {
				for(int j = 0; j<101; j++) {
					if(list[i][j] == n) {
						count++;
					}
				}
			}System.out.println(count);
		}
		
		
	}

}