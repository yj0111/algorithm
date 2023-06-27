import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while (T-- > 0) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();

			//두 중심 사이 거리 
			double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

			//1. 같은 원 -> 무한대 교점
			if (x1 == x2 && y1 == y2 && r1 == r2) {
				System.out.println("-1"); 
			}
			//2. 외접 or 내접
			else if (distance == r1 + r2 || distance == Math.abs(r1 - r2)) {
				System.out.println("1"); 
			}
			//3. 두점에서 교차
			else if (distance < r1 + r2 && distance > Math.abs(r1 - r2)) {
				System.out.println("2");
			}
			else {
				System.out.println("0");
			}
		}
	}
}