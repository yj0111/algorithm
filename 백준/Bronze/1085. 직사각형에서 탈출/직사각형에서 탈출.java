import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int minx = 0;
		if(w-x > x) {
			minx = x;
		}else {
			minx = w-x;
		}
		
		int miny = 0;
		if(h-y > y) {
			miny = y;
		}else {
			miny = h-y;
		}
		
		if(minx > miny) {
			System.out.println(miny);
		}else {
			System.out.println(minx);
		}
		
		
		
	}

}