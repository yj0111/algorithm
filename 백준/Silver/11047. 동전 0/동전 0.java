import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//돈의 개수
		int N = sc.nextInt();
		
		//금액
		int K = sc.nextInt();
		
		int[] list = new int[N];
		for(int i = 0; i<N; i++) {
			list[i] = sc.nextInt();
		}
		
		//필요한 돈의 개수 
		int count=0;
		
		for(int i=list.length-1; i>=0; i--) {
			count += K/list[i];
			K = K%list[i];
			if(K == 0) break;
		}
		
		System.out.println(count);
	}
}