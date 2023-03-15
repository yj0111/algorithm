import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());

		int[] list = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}

		int sum = 0;
		int max = 0;
		int count = 0;
		int last = 0;

		for (int i = 0; i < N; i++) {
			while ((last - i < X) && last < N) {
				sum += list[last];
				last++;
			}

			if (max < sum) {
				max = sum;
				count = 1;
			} else if (max == sum) {
				count++;
			}

			sum -= list[i];
		}

		if (max == 0) {
			bw.append("SAD");
		} else {
			bw.append(max + "\n" + count);
		}

		bw.flush();
	}

}