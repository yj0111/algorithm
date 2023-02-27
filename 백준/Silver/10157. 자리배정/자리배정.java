import java.util.Scanner;

public class Main {
	static int[] dr = {1,0,-1,0}; // 하 우 상 좌 순서
	static int[] dc = {0,1,0,-1};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int R = sc.nextInt(); 
			int C = sc.nextInt(); 
			int[][] nums = new int[C][R]; 
			
			int K = sc.nextInt();
			
			int dir = 0; // 현재 방향 인덱스
			int r = 0, c = 0; // 시작 좌표
			if(R*C < K) {
				System.out.println(0);
			}else {
				for (int i = 1; i <= R * C; i++) {
					nums[r][c] = i;
					if (r + dr[dir] >= C || r + dr[dir] < 0 || c + dc[dir] >= R || c + dc[dir] < 0
							|| nums[r + dr[dir]][c + dc[dir]] != 0) {
						dir = (dir + 1) % 4; // 방향전환
					}
					r += dr[dir];
					c += dc[dir];
				}
//				for(int i = 0; i<C; i++) {
//					for(int j = 0; j<R; j++) {
//						System.out.print(nums[i][j]+" ");
//					}System.out.println();
//				}

				for(int i = 0; i<C; i++) {
					for(int j = 0; j<R; j++) {
						if(nums[i][j] == K) {
							System.out.println((j+1)+ " " + (i+1));
						}
					}
				}
			}
	}
}