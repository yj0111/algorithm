import java.io.IOException;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws Exception, IOException {
		Scanner sc = new Scanner(System.in);
		//테스트 케이스 수 
		int T = sc.nextInt();
		
		
		for(int i = 0; i<T; i++) {

		int N = sc.nextInt();
		
		char[][] list = new char[N][N];
		
		//왼 왼아래 아래  오른쪽아래 오른쪽 오른쪽위 위 왼쪽위
		int dr[] = {-1,-1,0,1,1,1,0,-1};
		int dc[] = {0,1,1,1,0,-1,-1,-1};
		
		
		for(int r=0; r<N; r++) {	
			String text = sc.next();
				for(int c=0; c<N; c++) {
					list[r][c] = text.charAt(c);
				}
		}
		
		//확인용
//		for(int r=0; r<N; r++) {	
//			for(int c=0; c<N; c++) {
//				System.out.print(list[r][c]+"\t");
//			}System.out.println();
//		}
		
		//Yes or No
		boolean game = false;
		
		for(int r= 0; r<N; r++) {
			for(int c = 0; c<N; c++) {
				//돌다가 o을 만나면 ..!
				if(list[r][c] == 'o') {
					//dr dc 돌기
					for(int d=0; d<8; d++) {
						//오목 개수
						for(int cnt = 1; cnt<5; cnt++) {
							//이미 오목돌 발견 ! 1부터 시작 
//							System.out.println(cnt);
							int nr = r + dr[d] * cnt; 
							int nc = c + dc[d] * cnt;
//							System.out.println("nr:"+nr);
//							System.out.println("nc:"+nc);
							if(nr<0 || nc<0 || nr >=N || nc >=N) {
								//범위 나가면 안됨 !
								break;
							}else if(list[nr][nc] != 'o') {
								//o가 없으면...
								break;
							}
							
							if(cnt == 4) {
								game = true;
							}
							
						}
					}
				}
			}
		}
		if(game == true) {
			System.out.println("#"+ (i+1) + " YES");
		}else {
			System.out.println("#"+ (i+1) + " NO");
		}
		
		
		}
		
	}
}