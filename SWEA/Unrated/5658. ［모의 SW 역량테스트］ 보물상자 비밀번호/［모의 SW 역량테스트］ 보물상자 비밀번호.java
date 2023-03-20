import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 개수
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			// N개의 숫자
			int N = sc.nextInt();
			// 크기 순서 K
			int K = sc.nextInt();
			
			//공백없이 쓴 16진수 숫자
			String text = sc.next();
			
			String[] list = new String[N];
			//다 짤라서 넣기 
			for (int i = 0; i < N; i++) {
				list[i] = text.substring(i, i + 1);
			}

//			System.out.println(Arrays.toString(list));
			TreeSet<String> set = new TreeSet<>();

			for (int i = 0; i < N / 4; i++) {
				String x = list[N - 1];
				for (int j = N - 1; j > 0; j--) {
					list[j] = list[j - 1];
				}
				list[0] = x;

				for (int j = 0; j < list.length; j += N / 4) {
					StringBuilder sb = new StringBuilder();
					for (int k = j; k < j + (N / 4); k++) {
						sb.append(list[k]);
					}
					set.add(sb.toString());
				}
			}
			//만들수있는 것들
			String answer[] = set.toArray(new String[set.size()]);
//			System.out.println(Arrays.toString(answer));
			
			//16진수로 바꿔줘
			int[] result = new int[answer.length];
			for (int i = 0; i < answer.length; i++) {
				result[i] = Integer.parseInt(answer[i], 16);
			}
			Arrays.sort(result);
			//System.out.println(Arrays.toString(result));
			//K번째로 큰 숫자 
			System.out.println("#"+tc+" "+result[result.length- K]);
		}
	}
}