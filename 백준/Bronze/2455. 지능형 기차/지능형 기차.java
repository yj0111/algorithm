import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int people = 0;
		int inper = 0;
		int outper = 0;
		for (int i = 0; i < 4; i++) {
			outper = sc.nextInt();
			inper = sc.nextInt();
			people = people + inper - outper;
			if(max < people) {
				max = people;
			}

		}
		System.out.println(max);
	}

}