import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int[] dp = new int[n];

		// 11053 코드랑 똑같이 하니까 시간초과 나서 이진 탐색 이용 !
		int length = 0;

		for (int i = 0; i < n; i++) {
			int idx = Arrays.binarySearch(dp, 0, length, arr[i]);

			if (idx < 0) {
				idx = -(idx + 1);
			}

			dp[idx] = arr[i];

			if (idx == length) {
				length++;
			}
		}
		bw.append(String.valueOf(length)); // dp 배열의 최대값 대신 LIS의 길이를 출력
		bw.flush();

	}
}