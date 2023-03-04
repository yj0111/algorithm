import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String text = "abcdefghijklmnopqrstuvwxyz";
		char[] list = text.toCharArray();

		// 테스트 케이스
		int N = sc.nextInt();

		for (int tc = 1; tc <= N; tc++) {
			String test = sc.next();
			char[] test_list = test.toCharArray();
			int count = 0;

			for (int i = 0; i < test_list.length; i++) {
				if (list[i] == test_list[i]) {
					count++;
				}else {
					break;
				}
			}
			System.out.println("#"+tc+" "+count);
		}

	}

}