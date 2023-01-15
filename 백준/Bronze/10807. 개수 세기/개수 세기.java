import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] list = new int[N];
		
		for(int i=0; i<N; i++) {
			list[i] = sc.nextInt();
		}

		int v = sc.nextInt();
		
		int count = 0;
		
		for(int i=0; i<list.length; i++) {
			if(v == list[i]) {
				count++;
			}			
		}
		System.out.println(count);
	}
}