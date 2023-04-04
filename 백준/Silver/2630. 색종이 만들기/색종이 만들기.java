import java.util.Scanner;

public class Main {
	// 걍 종이의 개수랑 똑같은데 4등분인거만 다르다
	static int[][] paper;
	static int cnt0, cnt1 = 0;

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

		// 출력
		// 0이 하양 1이 파랑
		System.out.println(cnt0);
		System.out.println(cnt1);

	}

	// 같은 숫자면 카운트++
	static void part(int row, int col, int size) {
		if (check(row, col, size)) {
			if (paper[row][col] == 0) {
				cnt0++;
			} else {
				cnt1++;
			}
			return;
		}

		int newSize = size / 2;

		// 위쪽부분
		part(row, col, newSize);
		part(row, col + newSize, newSize);

		part(row + newSize, col, newSize);
		part(row + newSize, col + newSize, newSize);

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