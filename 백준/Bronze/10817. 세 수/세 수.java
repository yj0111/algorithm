import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] list = new int[3];

		list[0] = sc.nextInt();
		list[1] = sc.nextInt();
		list[2] = sc.nextInt();
		
		Arrays.sort(list);
	
		System.out.println(list[1]);
	}

}