import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//카드 개수 N
		int N = sc.nextInt();
		//최댓값 M
		int M = sc.nextInt();
		
		//카드 배열에 담기
		int[] card = new int[N];
		
		for(int i = 0; i<N; i++) {
			card[i] = sc.nextInt();
		}
		
		//큰거 3개의 합
		int sum = 0;

		//제일 가까운 값
		int max = 0;
		
		for(int i =0; i<N; i++) {
			for(int j = i+1; j<N; j++) {
				for(int k=j+1; k<N; k++) {
					sum = card[i]+card[j]+card[k];
					
					if(M>=sum && max<sum) {
						max = sum;
					}
					
				}
			}
		}
		
		System.out.println(max);
		
	}

}