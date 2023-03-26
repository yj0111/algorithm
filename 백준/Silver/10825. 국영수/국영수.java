import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		String[][] score = new String[N][4];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			score[i][0] = st.nextToken();
			score[i][1] = st.nextToken();
			score[i][2] = st.nextToken();
			score[i][3] = st.nextToken();

		}

		Arrays.sort(score, new Comparator<String[]>() {
			public int compare(String[] o1, String[] o2) {
				if (o2[1].equals(o1[1])) {
					if (o1[2].equals(o2[2])) {
						if (o1[3].equals(o2[3])) {
							return o1[0].compareTo(o2[0]);
						}
						return Integer.parseInt(o2[3]) - Integer.parseInt(o1[3]);
					}

					return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);

				}
				return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]);
			}
		});

		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i][0]);
		}

	}
}