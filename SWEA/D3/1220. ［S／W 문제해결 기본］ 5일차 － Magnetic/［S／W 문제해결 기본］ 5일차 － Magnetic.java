import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트 케이스 10 개
		
		for(int i = 1; i<=10; i++) {
			//정사각형 한 변의 길이
			//근데 100임
			int N = sc.nextInt();
			
			int[][] list = new int[N][N];
			
			//일단 2차원 배열에 넣기 
			for(int r = 0; r<N; r++) {
				for(int c = 0; c<N; c++) {
					list[r][c] = sc.nextInt();
				}
			}
//			for(int c = 0; c<N; c++) {
//				for(int r = 0; r<N; r++) {
//					System.out.print(list[r][c]+" ");
//				}System.out.println();
//			}
			//교착상태 몇개인지?
			int sum = 0;
			
			//1은 N극 성질을 가지는 자성체를 2는 S극 성질
			//열 우선 탐색
			for(int c = 0; c<list.length; c++) {
				boolean findRed =  false;
				for(int r = 0; r<list.length; r++) {
					int count = 0;
					if(findRed == false) {
						//빨강을 찾으면
						if(list[r][c] == 1) {
							findRed = true;
						}
					}else if(findRed == true) {
						if(list[r][c] == 2) {
							//빨강색 찾고, 파랑을 찾으면 
							findRed = false;
							count++; 
						}
					}
					sum+= count;
			}
		}
			//결과
			System.out.println("#"+i+" "+sum);
	}

	}
}