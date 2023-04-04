import java.util.Scanner;

public class Main {

	static int[][] paper;
	static int cnt_1, cnt0, cnt1 = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		paper = new int[N][N];

		// 일단 다 입력해
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				paper[i][j] = sc.nextInt();
			}
		}

		// 시작
		part(0, 0, N);

		// 출력 -1 0 1 순서
		System.out.println(cnt_1);
		System.out.println(cnt0);
		System.out.println(cnt1);

	}

	// 같은 숫자면 카운트++
	static void part(int row, int col, int size) {
		if (check(row, col, size)) {
			if (paper[row][col] == -1) {
				cnt_1++;
			} else if (paper[row][col] == 0) {
				cnt0++;
			} else {
				cnt1++;
			}
			return;
		}

		//9 등분 해야하니까 전체 길이 3으로 나누기
		int newSize = size / 3;
		
		// 위쪽부분
		// 왼 중 오
		part(row, col, newSize);
		part(row, col + newSize, newSize);
		part(row, col + 2 * newSize, newSize);

		// 가운데부분
		// 왼 중 오
		part(row + newSize, col, newSize);
		part(row + newSize, col + newSize, newSize);
		part(row + newSize, col + 2 * newSize, newSize);

		// 아래부분
		// 왼 중 오
		part(row + 2 * newSize, col, newSize);
		part(row + 2 * newSize, col + newSize, newSize);
		part(row + 2 * newSize, col + 2 * newSize, newSize);

	}

	// 검사
	static boolean check(int row, int col, int size) {
		int what = paper[row][col];
		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				if (what != paper[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}