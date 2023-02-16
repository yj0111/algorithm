import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] board = new int[101][101];
		

		//총 10 개 테스트 케이스 
		for(int t = 0 ; t<10; t++) {
			//도착점
			int end = 0;
			
		//테스트 케이스
		int T = sc.nextInt();
		
		//100X100에 일단 넣기
			for(int r=0; r<100; r++) {
				for(int c=0; c<100; c++) {
				board[r][c] = sc.nextInt();
				
				//도착할때 위치를 여기서 바로 알아내기
				if(board[r][c] == 2) {
					end = c;
				}
			}
		}

		int r = 98;
		boolean left = true;
		boolean right = true;

		while(true) {
			if(r == 0) {
				break;
			}
		
			if(end > 0) {
				if(board[r][end-1] ==1 && left) {
					end--;
					right = false;
					continue;
				}
			}
			
			if(r<99) {
				if(board[r][end+1] == 1 && right) {
					end++;
					left = false;
					continue;
				}
			}
			
			r--;
			right = true;
			left = true;
			
		}
		
		System.out.println("#"+ T +" "+end);
		
		
	}
}
	
}