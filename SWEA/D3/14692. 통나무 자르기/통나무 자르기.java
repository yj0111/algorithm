import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		
		for(int tc = 1; tc<=T; tc++) {
			//잘라야 하는 나무
			int N = sc.nextInt();
			
			if(N%2 == 0) {
				System.out.println("#"+tc+" Alice");
			}else {
				System.out.println("#"+tc+" Bob");
			}
		}
	}
}