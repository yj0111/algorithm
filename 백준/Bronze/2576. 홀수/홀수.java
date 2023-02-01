import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] list = new int[7];
		
		for(int i = 0; i<7; i++) {
			list[i] = sc.nextInt();
		}
		
		int sum = 0;
		int min = 100;
		
		for(int i = 0; i<7; i++) {
			if(list[i] % 2 !=0 ) {
				if(min > list[i]) {
					min = list[i];
				}
				sum += list[i];
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

}