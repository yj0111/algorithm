import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//총 인원
		int N = sc.nextInt();
		//상 받는 인원
		int k = sc.nextInt();
		
		//전체 배열
		int[] arr = new int[N];
		
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		//정렬
		Arrays.sort(arr);

		System.out.println(arr[N-k]);
	}

}