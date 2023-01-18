import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		for(int r=0; r<9; r++) {
			for(int c=0; c<9; c++) {
				arr[r][c] = sc.nextInt();				
			}
		}
		
		int max = 0;
		int a =0;
		int b =0 ;
		
		for(int r=0; r<9; r++) {
			for(int c=0; c<9; c++) {
				if(max <= arr[r][c]) {
					max = arr[r][c];
					a = r+1;
					b = c+1;
				}
			}
		}
		System.out.println(max);
		System.out.println(a + " "+ b );
		
	}

}