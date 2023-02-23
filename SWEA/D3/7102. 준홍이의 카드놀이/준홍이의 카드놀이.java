import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트 케이스
		int T = sc.nextInt();
		
		for(int t = 1; t<=T; t++) {
		
		//카드 세트 1
		int N = sc.nextInt();
			
		//카드 세트 2
		int M = sc.nextInt();
		
		//카드 세트에서 하나씩 더한거 카운트 할 배열 
		int[] count = new int[N+M+1];

		for(int i = 1; i<=N; i++) {
			for(int j = 1; j<=M; j++) {
				count[i+j]++;
			}
		}
		//젤 마니 나오는 숫자 찾기
		int max = 0;
		for(int i = 1; i<count.length; i++) {
			if(max < count[i]) {
				max = count[i];
			}
		}
		System.out.print("#"+t);
		// 그 값이랑 같은 값이있을수도 있으니까 찾기
		for(int i = 1; i<count.length; i++) {
			if(max == count[i]) {
				System.out.print(" "+i);
			}
		}
		System.out.println();
		}	
	}
}