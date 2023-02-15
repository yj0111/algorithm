import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//테스트 케이스 10개 
		for(int i = 0; i<10; i++) {
			
		//테스트 케이스 번호 	
		int T = sc.nextInt();	
			
		//배열 100X100
		int[][] list = new int[100][100];
		
		//일단 배열에 담기
		for(int r=0; r<100; r++) {
			for(int c=0; c<100; c++) {
				list[r][c] = sc.nextInt();
			}
		}
		
		//한줄씩 합
		int sum = 0;
		
		//최대값
		int max = 0;
		
		//가로 먼저 더하기
		for(int r=0; r<100; r++) {
			sum = 0;
			for(int c=0; c<100; c++) {
				sum += list[r][c];
			}
		if(max < sum) {
				max = sum;
			}
		}
		
		//세로 더하기
		for(int r=0; r<100; r++) {
			sum = 0;
			for(int c=0; c<100; c++) {
				sum += list[c][r];
			}
		if(max < sum) {
				max = sum;
			}
		}
		
		//대각선1 더하기
		sum =0;

		for(int r=0; r<100; r++) {
			sum+= list[r][r];
		}
		if(max < sum) {
			max = sum;
		}

		
		//대각선2 구하기
		sum = 0; 
		for(int r=0; r<100; r++) {
			sum+= list[r][99-r];
		}
		if(max < sum) {
				max = sum;
		}
	
		System.out.println("#"+ T + " " + max);	
			
		}
	}
}