import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스
		int T = sc.nextInt();
		
		for(int tc = 1; tc<=T; tc++) {
			
			//N개의 상자
			int N = sc.nextInt();
			int[] box = new int[N+1];
			
			//Q회 동안 숫자 변경 
			int Q = sc.nextInt();
			
			//Q개의 줄의 i번째 줄에는 L R 주어짐
			for(int i = 1; i<=Q; i++) {
				int L = sc.nextInt();
				int R = sc.nextInt();

				for(int j=L; j<=R; j++) {
					box[j] = i;
				}
			}

			System.out.print("#"+tc);
			
			for(int x =1; x<box.length; x++) {
				System.out.print(" "+box[x]);
			}System.out.println();
			
		}
	}

}