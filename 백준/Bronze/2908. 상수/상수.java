import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		String B = sc.next();
		
		StringBuffer A_sb = new StringBuffer(A);
		String A_r = A_sb.reverse().toString();

		StringBuffer B_sb = new StringBuffer(B);
		String B_r = B_sb.reverse().toString();
		
		int AA = Integer.parseInt(A_r);
		int BB = Integer.parseInt(B_r);
		
		if(AA > BB) {
			System.out.println(AA);
		}else {
			System.out.println(BB);
		}	
	}
}