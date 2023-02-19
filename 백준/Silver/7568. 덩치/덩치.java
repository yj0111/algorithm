import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//몸무게 x 키 y 덩치(x,y)
		// x>p y>q A가 덩치 더 크다..

		Scanner sc = new Scanner(System.in);
		//전체 사람 수 
		int N = sc.nextInt();
		
		//키 몸무게 담을 리스트
		int[][] list = new int[N][2];
	
		for(int i = 0; i<N; i++) {
			//몸무게
			list[i][0] = sc.nextInt();
			//키
			list[i][1] = sc.nextInt();
		}
		
		//등수
		for(int i = 0; i < N; i++) {
			int rank = 1;
			
		for(int j = 0; j < N; j++) {
			//하나하나 다 비교하기 i == j 이면 넘어가
			if(i == j) continue;
			// 키 몸무게 다 크면 등수 +1
			if (list[i][0] < list[j][0] && list[i][1] < list[j][1]) {
				rank++;
			}
		}
		System.out.print(rank + " ");
	}
	}
}