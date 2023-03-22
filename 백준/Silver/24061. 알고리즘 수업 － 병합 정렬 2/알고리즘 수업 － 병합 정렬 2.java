import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	// 저장횟수
	static int[] arr;
	static int[] new_arr;
	static int cnt;
	static int K;
	static boolean check = false;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr = new int[N];
		new_arr = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		mergeSort(0, arr.length - 1);

		if (check) {
			System.out.println(sb);
		} else {
			System.out.println(-1);
		}
	}

	private static void mergeSort(int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			mergeSort(left, mid);
			mergeSort(mid + 1, right);

			int i = left, j = mid + 1, k = left;
			while (i <= mid && j <= right) {
				if (arr[i] <= arr[j]) {
					new_arr[k++] = arr[i++];
				} else {
					new_arr[k++] = arr[j++];
				}
			}
			
			while (i <= mid) {
				new_arr[k++] = arr[i++];
			}
			
			while (j <= right) {
				new_arr[k++] = arr[j++];
			}

			i = left;
			k = i;

			while (i <= right) {
				arr[i++] = new_arr[k++];
				cnt++;
				if (cnt == K) {
					for (int x = 0; x < arr.length; x++) {
						sb.append(arr[x] + " ");
					}
					check = true;
					break;
				}
			}
		}
	}
}