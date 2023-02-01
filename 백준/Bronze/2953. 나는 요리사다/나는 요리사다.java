import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		int[] list = new int[5];
		
		int sum = 0;
		int max = 0;
		
		for(int i = 0; i<5; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			sum = a+b+c+d;
			list[i] = sum;
			if(max < sum) {
				max = sum;
			}
		}
		
		for(int i = 0; i<5; i++) {
			if(list[i] == max) {
				System.out.println(i+1);
				System.out.println(max);
			}
		}
		
		
				
	}

}