import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] list = new int[N];
		
		for(int i = 0; i<N; i++) {
			list[i] = sc.nextInt();
			
		}
		
		Arrays.sort(list);
		
		//인당 소요시간
		int time = 0;
		//총 시간
		int sum = 0;
		
		for(int i = 0; i<N; i++) {
			sum += time +list[i];
			
			time += list[i];
		}
		
		System.out.println(sum);
		
	}

}