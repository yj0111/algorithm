import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int x = Integer.parseInt(br.readLine());
		int answer = 0;
		int left = 0;
		int right = arr.length - 1;

		while (left < right) { // 반복문 탈출 조건은 L 포인터 변수가 R을 넘을 경우
			int sum = arr[left] + arr[right];
			// 가장 큰 원소와 더했는데 x보다 작거나 같으면 l++
			if (sum <= x) {
				left++;
			}
			// 가장 큰 원소와 더했는데 x보다 크면 r--
			else if (sum > x) {
				right--;
			}
			if (sum == x) {
				answer++;
			}

		}
		System.out.println(answer);
	}
}