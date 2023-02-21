import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//총 테스트 케이스 수 
		int T = sc.nextInt();
		for(int t = 1; t<=T; t++) {
			
		int N = sc.nextInt();
		
		//i =1 부터 저장할라구 !
		int[] A = new int[N+1];
		int[] B = new int[N+1];

		for(int i = 1; i<=N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		System.out.printf("#%d", t);
		//몇개 노선인지 
		int count = 0;
		
		int P = sc.nextInt();
		for(int i = 1; i<=P; i++) {
			int j = sc.nextInt();
			count = 0;
			for(int k = 1; k<=N; k++) {
				//A[i]랑 B[i] 사이에 있는거면 !
				if(A[k] <= j && j <=B[k]) {
					count++;
				}
			}
			System.out.printf(" %d" ,count);
		}
		System.out.println();
		}
	}
}