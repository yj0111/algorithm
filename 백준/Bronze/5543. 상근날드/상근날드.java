import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] burger = new int[3];
		int[] drink = new int[2];

		int bmin = 2000;
		int dmin = 2000;
		
		for(int i = 0; i<burger.length; i++) {
			burger[i] =sc.nextInt();
		}

		for(int i = 0; i<drink.length; i++) {
			drink[i] =sc.nextInt();
		}
		
		for(int j=0; j<burger.length; j++) {
			for(int i =0; i<drink.length; i++) {
				if(dmin > drink[i]) {
					dmin = drink[i];
				}
			}
			if(bmin > burger[j]) {
				bmin = burger[j];
			}
		}
		System.out.println(dmin+bmin-50);
	}

}