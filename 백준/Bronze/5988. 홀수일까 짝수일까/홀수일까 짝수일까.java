import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();

	        for(int i = 0 ; i<T; i++) {
	        	String[] list = sc.next().split("");
	        	if(Integer.parseInt(list[list.length - 1]) % 2 == 0) {
	        		System.out.println("even");
	        	}else {
	        		System.out.println("odd");
	        	}
	        }

	}

}
