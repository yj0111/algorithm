import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		char[][] map = new char[R][C];
		int[][] water = new int[R][C]; // 물
		int[][] gsdc = new int[R][C]; // 고슴도치
		Queue<int[]> waterQueue = new LinkedList<>();
		Queue<int[]> gsdcQueue = new LinkedList<>();
		int X = 0; // 비버굴의 위치
		int Y = 0;

		for (int i = 0; i < R; i++) {
			String line = sc.nextLine();
			for (int j = 0; j < C; j++) {
				map[i][j] = line.charAt(j);
				if (map[i][j] == 'S') {
					gsdcQueue.offer(new int[] { i, j });
					gsdc[i][j] = 0;
				} else if (map[i][j] == '*') {
					waterQueue.offer(new int[] { i, j });
					water[i][j] = 0;
				} else if (map[i][j] == 'D') {
					//비버굴의 위치 저장
					X = i;
					Y = j;
					water[i][j] = -1;
					gsdc[i][j] = -1;
				} else {
					water[i][j] = -1;
					gsdc[i][j] = -1;
				}
			}
		}

		int[] dx = { 0, 0, 1, -1 };
		int[] dy = { 1, -1, 0, 0 };
		while (!waterQueue.isEmpty()) {
			int[] current = waterQueue.poll();
			int x = current[0];
			int y = current[1];
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx < 0 || nx >= R || ny < 0 || ny >= C) {
					continue;
				}
				if (water[nx][ny] != -1 || map[nx][ny] == 'X' || map[nx][ny] == 'D') {
					continue;
				}
				water[nx][ny] = water[x][y] + 1;
				waterQueue.offer(new int[] { nx, ny });
			}
		}

		while (!gsdcQueue.isEmpty()) {
			int[] current = gsdcQueue.poll();
			int x = current[0];
			int y = current[1];
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx < 0 || nx >= R || ny < 0 || ny >= C) {
					continue;
				}
				if (gsdc[nx][ny] != -1 || map[nx][ny] == 'X') {
					continue;
				}
				if (water[nx][ny] != -1 && water[nx][ny] <= gsdc[x][y] + 1) {
					continue;
				}
				gsdc[nx][ny] = gsdc[x][y] + 1;
				gsdcQueue.offer(new int[] { nx, ny });
			}
		}

		int result = gsdc[X][Y];
		if (result == -1) {
			System.out.println("KAKTUS");
		} else {
			System.out.println(result);
		}
	}
}