import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int[] list = new int[N];
		
		for(int i=0; i<N; i++) {
			list[i] = sc.nextInt();
		}
		
		for(int i=0; i<list.length; i++) {
			if(X > list[i]) {
				System.out.print(list[i] + " ");
			}			
		}
	}
}