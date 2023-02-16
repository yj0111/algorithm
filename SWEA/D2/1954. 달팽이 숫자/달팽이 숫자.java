import java.util.Scanner;

public class Solution {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		
			//테스트 케이스
			int T = sc.nextInt();
			
			for(int t=1; t<=T; t++) {
				
				int N = sc.nextInt();
				int arr[][] = new int[N][N];
	
				int x = 0;
				int y = 0;
				int num = 1;
				//가는 횟수?
				int f = N;
	
				for (int i = 0; i < 2*N-1; i++) {
					switch (i % 4) {
					case 0: // 오른쪽으로 가기
						for (int k = 0; k < f ;k++) {
							arr[y][x] = num;
							x++;
							num++;
						}
						//x값 다시 내려주기..
						x--;
						y++;
						f--;
						break;
					case 1: // 아래로
						for (int k = 0; k < f ;k++) {
							arr[y][x] = num;
							y++;
							num++;
						}
						y--;
						x--;
						break;
					case 2:  // 왼쪽
						for (int k = 0; k < f ;k++) {
							arr[y][x] = num;
							x--;
							num++;
						}
						x++;
						y--;
	
						f--;
						break;
					case 3:  // 위로
						for (int k = 0; k < f ;k++) {
							arr[y][x] = num;
							y--;
							num++;
						}
						y++;
						x++;
						break;
					}
				}
				
				System.out.println("#"+ t);
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N ; j++){
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
			}

		}
	}