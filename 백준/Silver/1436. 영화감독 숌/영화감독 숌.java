import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int name  = 666;
		int count = 1;
		
		while(count != N) {
			name++;
			if(String.valueOf(name).contains("666")) {
				count++;
			}
		}
		System.out.println(name);
	
	}

}