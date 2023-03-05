import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 킹의 위치
		String king = sc.next();

		// 돌의 위치
		String stone = sc.next();

		// 아스키코드 뿌시기
		int x1 = (king.charAt(0) - 'A') + 1;
		int y1 = king.charAt(1) - '0';

		int x2 = (stone.charAt(0) - 'A') + 1;
		int y2 = stone.charAt(1) - '0';

//		System.out.println((king.charAt(0) - 'A') + 1);
//		System.out.println(king.charAt(1) - '0');

		// 델타 배열 R L B T RT LT RB LB
		int[] dx = { 1, -1, 0, 0, 1, -1, 1, -1 };
		int[] dy = { 0, 0, -1, 1, 1, 1, -1, -1 };

		// 움직이는 횟수
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String text = sc.next();
			int idx = 0;
			int tmpX = x1, tmpY = y1;
			//뭐 입력하는지 
			switch (text) {
			case "R":
				idx = 0;
				break;
			case "L":
				idx = 1;
				break;
			case "B":
				idx = 2;
				break;
			case "T":
				idx = 3;
				break;
			case "RT":
				idx = 4;
				break;
			case "LT":
				idx = 5;
				break;
			case "RB":
				idx = 6;
				break;
			case "LB":
				idx = 7;
				break;
			}
			
			tmpX += dx[idx];
			tmpY += dy[idx];
			// 킹, 돌 둘다 범위 안 벗어나는지 확인
			if (tmpX >= 1 && tmpX <= 8 && tmpY >= 1 && tmpY <= 8) {
				if (tmpX == x2 && tmpY == y2) {
					if (x2 + dx[idx] >= 1 && x2 + dx[idx] <= 8 && y2 + dy[idx] >= 1 && y2 + dy[idx] <= 8) {
						x2 += dx[idx];
						y2 += dy[idx];
					} else {
						continue;
					}
				}
				x1 = tmpX;
				y1 = tmpY;
			}
		}
		king = "";
		stone = "";

		//다시 char로 바꿔주기..
		king += Character.toString((char) (x1 + 'A' - 1)) + y1;
		stone += Character.toString((char) (x2 + 'A' - 1)) + y2;

		System.out.println(king);
		System.out.println(stone);
	}

}