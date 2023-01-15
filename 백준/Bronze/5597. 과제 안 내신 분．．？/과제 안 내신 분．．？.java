import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] list = new int[31]; 
		
		for(int i=1; i<29; i++) {
			int yes = sc.nextInt();
			list[yes] = 1;
		}
		for(int i=1; i<list.length; i++) {
			if(list[i] != 1) {
				System.out.println(i);
			}
		}
		
	}
}