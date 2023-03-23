import java.util.Scanner;

public class Main {
	static int N;
	static int[][] board;
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		board = new int[N][N];
		
		put_queen(0);
		
		System.out.println(cnt);
		sc.close();
	}

	private static void put_queen(int col) {
		if (col >= N) {
			cnt++;
		}

		for (int i = 0; i < N; i++) {
			if (check(i, col) == true) {
				board[i][col] = 1;
				put_queen(col + 1);
				board[i][col] = 0;
			}
		}
	}

	private static boolean check(int row, int col) {
		int i, j;

		for (i = 0; i < col; i++) {
			if (board[row][i] == 1) {
				return false;
			}
		}

		for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}

		for (i = row, j = col; i < N && j >= 0; i++, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}
		return true;
	}
}