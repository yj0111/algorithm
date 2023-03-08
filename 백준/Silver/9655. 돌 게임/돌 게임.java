import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//돌 N개
		int N = sc.nextInt();
		
		int p1 = 0;
		int p2 = 0;
		
		ArrayList<Integer> game = new ArrayList<>();
		
		while(N !=0) {
			if(N >3) {
				N-=3;
				game.add(3);
			}else {
				N -= 1;				
				game.add(1);
			}
		}
//		System.out.println(game);
		
		
		if(game.size() %2 == 0) {
			System.out.println("CY");
		}else {
			System.out.println("SK");
		}
	}
	

}