import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		int count = 1; 
		int range = 2; 
 
		if (N == 1) {
			System.out.print(1);
		}
 
		else {
			while (range <= N) {	
				range = range + (6 * count);	
				count++;
			}
			System.out.print(count);
		}
	}
}