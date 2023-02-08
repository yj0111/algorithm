import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int bingoCnt = 0;
		
		//빙고판채우기
		int[][] bingo = new int[5][5];
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				bingo[i][j] = sc.nextInt();
			}
		}
		
		
		//확인용
//		for(int i = 0; i<5; i++) {
//			for(int j = 0; j<5; j++) {
//				System.out.print(bingo[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		//사회자가 빙고 부르기 1~25

		//빙고 채우기
		for(int m = 1; m<=25; m++) {
			//빙고 개수
			//3줄 맞으면 승자
			bingoCnt = 0;
			int mc = sc.nextInt();
			
			for(int i = 0; i<5; i++) {
				for(int j = 0; j<5; j++) {
					if(bingo[i][j] == mc) {
						bingo[i][j] = 0;
					}
				}		
			}
			
			//빙고 맞추기
			//1 가로 방향
			for(int i = 0; i<5; i++) {
				//맞춘개수 
				int count = 0;
				for(int j = 0; j<5; j++) {
					if(bingo[i][j] == 0) {
						count++;
					}
				}
				//한줄 완성하면 ! 
				if(count == 5) {
					bingoCnt++;
				}
			}
			
			
			//2 세로 방향
			for(int i = 0; i<5; i++) {
				int count = 0;
				for(int j = 0; j<5; j++) {
					if(bingo[j][i] == 0) {
						count++;
					}
				}
				
				if(count == 5) {
					bingoCnt++;
				}
			}
			
			
			//3 \ 방향
			int count = 0;
			for(int i = 0; i<5; i++) {
					if(bingo[i][i] == 0) {
						count++;
				}
				
				if(count == 5) {
					bingoCnt++;
				}
			}
			
			//4 / 방향
			count = 0;
			for(int i = 0; i<5; i++) {
					if(bingo[i][4-i] == 0) {
						count++;
				}
				
				if(count == 5) {
					bingoCnt++;
				}
			}
			
			if(bingoCnt >= 3) {
				System.out.println(m);
				break;
			}
		}			
	}		
}