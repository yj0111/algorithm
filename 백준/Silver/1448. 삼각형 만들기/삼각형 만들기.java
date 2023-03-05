import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// 메모리 초과
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 빨대의 개수
		int N = Integer.parseInt(st.nextToken());
		int[] stick = new int[N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			stick[i] = Integer.parseInt(st.nextToken());
		}

		// 삼각형 작은 변 부터 정렬하기
		Arrays.sort(stick);

		// 제일 큰 값 비교할라고
		int max = 0;
		// 세변 더한거
		int sum = 0;

		for (int i = 0; i < N - 2; i++) {
			//제일 긴 변이 두 변 합친거보다 작아야 삼각형 완성 
			if (stick[i] + stick[i + 1] > stick[i + 2]) {
				sum = Math.max(max, stick[i] + stick[i + 1] + stick[i + 2]);
				if (max < sum) {
					max = sum;
				}
			}
		}
		if (max == 0) {
			bw.append("-1");
		} else {
			bw.append(String.valueOf(max));
		}

		bw.flush();

	}
}