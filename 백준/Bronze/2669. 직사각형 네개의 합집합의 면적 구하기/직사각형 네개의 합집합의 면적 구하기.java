import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] list = new int[101][101];
		
		//4번
		for(int i = 0; i<4; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			for(int j = x1; j <x2; j++) {
				for(int k = y1; k<y2; k++) {
						list[k][j] = 1;						
				}
			}	
		}
		
        // x 100 y 100까지 
		int count = 0;
		for(int i = 0; i<=100; i++) {
			for(int j = 0; j <=100; j++) {
				if(list[i][j] == 1) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

}