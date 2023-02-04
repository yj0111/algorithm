import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] dot1 = {sc.nextInt(),sc.nextInt()};
		int[] dot2 = {sc.nextInt(),sc.nextInt()};
		int[] dot3 = {sc.nextInt(),sc.nextInt()};
		
		int x = 0;
		if(dot1[0] == dot2[0]) {
			x = dot3[0];
		}else if(dot1[0] == dot3[0]) {
			x = dot2[0];
		}else {
			x = dot1[0];
		}

		int y = 0;
		if(dot1[1] == dot2[1]) {
			y = dot3[1];
		}else if(dot1[1] == dot3[1]) {
			y = dot2[1];
		}else {
			y = dot1[1];
		}
		
		System.out.print(x+" "+y);
		
	}

}